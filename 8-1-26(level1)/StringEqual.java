import java.util.Scanner;

public class StringEqual {
    public static boolean CompareString(String s1,String s2){
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
        System.out.println("Enter str1");
        String str1=sc.next();
        System.out.println("Enter str2");
        String str2=sc.next();
        boolean result1=CompareString(str1,str2);
        boolean result2=str1.equals(str2);
        System.out.println("Result using method "+result1);
        System.out.println("Result using built in method "+result2);
        System.out.println("Are both results same "+(result1==result2));

    }
}
