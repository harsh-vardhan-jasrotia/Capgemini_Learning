public class Fee {
    public static void main(String[] args) {
        int fee=125000;
        int discountPercent=10;
        int discountVariable=(fee*discountPercent)/100;
        int finalfee=fee-discountVariable;
        System.out.println("The discount amount is INR"+" "+discountVariable+"and final discounted fee is"+" "+finalfee);
    }
}
