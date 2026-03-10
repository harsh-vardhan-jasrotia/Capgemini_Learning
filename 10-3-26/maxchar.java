import java.util.*;
public class maxchar {
    public static void main(String[] args) {
        String s="aaaabbccd";
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        int max = 0;
        char result = ' ';
        for(char c : map.keySet()){
            if(map.get(c) > max){
                max = map.get(c);
                result = c;
            }
        }
        System.out.println("Max occurring character: " + result);
    }
}
