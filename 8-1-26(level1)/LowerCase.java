import java.util.Scanner;

public class LowerCase {
     public static String convert(String s){
        String ans="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='A' && ch<='Z'){
                ch=(char)(ch+32);
            }
            ans+=ch;
        }
        return ans;
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
        System.out.println("Enter text: ");
        String text=sc.next();
        String manualm=convert(text);
        String built=text.toLowerCase();
        boolean result=Compare(manualm,built);
        System.out.println(manualm+","+built);
        System.out.println("Are the strings equal "+result);
    }    
}


