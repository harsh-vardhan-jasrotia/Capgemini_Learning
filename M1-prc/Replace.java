public class Replace {
    public static void main(String[] args) {
        String str="apples";
        char c1='a';
        char c2='p';
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c=='a'){
                sb.append('p');
            }
            else if(c=='p'){
                sb.append('a');
            }
            else{
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }
}
