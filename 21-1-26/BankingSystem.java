
interface Loanable {
    void applyForLoan();
    double calculateLoanEligibility();
}

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        }
    }
    public abstract double calculateInterest();
}

class SavingsAccount extends BankAccount implements Loanable {

    public SavingsAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.04;
    }

    @Override
    public void applyForLoan() {
        System.out.println("Savings Account Loan Applied");
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 5;
    }
}

class CurrentAccount extends BankAccount {

    public CurrentAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.02; 
    }
}

public class BankingSystem {
    public static void main(String[] args) {

        BankAccount acc1 = new SavingsAccount("SA101", "Harsh", 50000);
        BankAccount acc2 = new CurrentAccount("CA201", "Amit", 80000);

        BankAccount[] accounts = { acc1, acc2 };
        for (BankAccount acc : accounts) {
            System.out.println("Account Holder: " + acc.getHolderName());
            System.out.println("Interest: " + acc.calculateInterest());
            System.out.println("----------------------");
        }

        Loanable loan = (Loanable) acc1;
        loan.applyForLoan();
        System.out.println("Loan Eligibility: " + loan.calculateLoanEligibility());
    }
}

