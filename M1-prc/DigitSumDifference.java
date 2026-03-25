public class DigitSumDifference {
    static int digitsum(int a){
        int sum=0;
        while(a>0){
            sum+=a%10;
            a/=10;
        }
        return sum;
    }
    static int digitSumDifference(int m, int n) {
        int sum4=0;
        int sum7=0;
        for(int i=m;i<=n;i++){
            if(i%4==0){
                sum4+=digitsum(i);
            }
            if(i%7==0){
                sum7+=digitsum(i);
            }
        }
        return Math.abs(sum4-sum7);
    }
    public static void main(String[] args) {
        int m = 50, n = 120;
        System.out.println("Input : m = " + m + ", n = " + n);
        System.out.println("Output: " + digitSumDifference(m, n)); 
    }
}