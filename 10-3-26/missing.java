import java.util.*;
public class missing {
    public static void main(String[] args) {
        int[] a=new int[]{1,4,2,3,8,7,5};
        Arrays.sort(a);
        int n=a.length;
        int b=a[0];
        int c=a[n-1];
        int totalsum=((b+c)*(c-b+1))/2;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=a[i];
        }
        System.out.println(totalsum-sum);
    }
}
