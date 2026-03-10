import java.util.*;
public class duplchar {
    public static void main(String[] args) {
        String s="CsharpstarZ";
        HashSet<Character>sb =new HashSet<>();
        String result="";
        for(char c:s.toCharArray()){
            if(!sb.contains(c)){
                sb.add(c);
                result+=c;
            }
        }
        System.out.println(result);
    }
}
