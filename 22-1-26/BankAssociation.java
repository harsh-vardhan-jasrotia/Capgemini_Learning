import java.util.ArrayList;
class Bank{
    private String bankName;
    Bank(String bankName){
        this.bankName=bankName;
    }
     String getBankName() {
        return bankName;
    }
    void openAccount(Customer customer,double initial){
        customer.addAccount(new Account(this,initial));
        System.out.println("Account opened in "+bankName+"for "+customer.getName());
    }
}
class Account{
    private Bank bank;
    private double balance;
    Account(Bank bank,double balance){
        this.bank=bank;
        this.balance=balance;
    }
    double getBalance(){
        return balance;
    }
    Bank getBank(){
        return bank;
    }
}
class Customer{
    private String name;
    private ArrayList<Account>accounts;
    Customer(String name){
        this.name=name;
        accounts=new ArrayList<>();
    }
    String getName() {
        return name;
    }
    void addAccount(Account account) {
        accounts.add(account);
    }
    void viewBalance() {
        System.out.println("Customer: " + name);
        for (Account acc : accounts) {
            System.out.println(
                "Bank: " + acc.getBank().getBankName() +
                ", Balance: " + acc.getBalance()
            );
        }
    }
}
public class BankAssociation {
    public static void main(String[] args) {
        
        Bank sbi = new Bank("SBI");
        Bank hdfc = new Bank("HDFC");

        Customer c1 = new Customer("Harsh");

        sbi.openAccount(c1, 5000);
        hdfc.openAccount(c1, 10000);

        c1.viewBalance();
    }
}
