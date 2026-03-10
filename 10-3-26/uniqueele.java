import java.util.*;
public class uniqueele {
    public static int[] uniquearr(int[] a){
        HashSet<Integer>m=new HashSet<>();
        for(int num:a){
            m.add(num);
        }
        int result[]=new int[m.size()];
        int i=0;
        for(int num:m)
        result[i++]=num;
        return result;
    }
    public static void main(String[] args) {
        int[] arr=new int[]{11,11,11,24,25,37}; 
        System.out.println(Arrays.toString(uniquearr(arr)));
    }
}
