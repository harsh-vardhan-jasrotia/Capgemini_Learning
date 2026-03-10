
public class palindrome {
    public static int countPalindrome(String s,int n) {

        String arr[] = s.split(" ");
        int count = 0;
        for(String word : arr){
            int i = 0;
            int j = word.length() - 1;
            boolean isPal = true;
            while(i < j){
                if(word.charAt(i) != word.charAt(j)){
                    isPal = false;
                    break;
                }
                i++;
                j--;
            }
            if(isPal){
                count++;
            }
        }
            return count;
        }
    public static void main(String[] args) {
        String s="this is level 72";
        int n=16;
        System.out.println(countPalindrome(s,n));
    }
}
