import java.util.Scanner;
public class SubString {
    public static String Create(String s1,int s,int e){
            String result="";
            for(int i=s;i<e;i++){
                result+=s1.charAt(i);
            }
            return result;
    }
    public static boolean Compare(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
            return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string: ");
        String str1=sc.next();
        System.out.println("Enter starting and ending index: ");
        int start=sc.nextInt();
        int end=sc.nextInt();
        String result1=Create(str1,start,end);
        String result2=str1.substring(start,end);
        boolean result3=Compare(result1,result2);
        System.out.println("Substring with method "+result1);
        System.out.println("Result with built-in method "+result2);
        System.out.println("Are the substrings same "+result3);
    }
}