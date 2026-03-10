
public class repeat {
    public static void main(String[] args) {
        int n=3;
        String s="abc";
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<n-1;i++){
            sb.append(s);
        }
        System.out.println(sb.toString());
    }
}
