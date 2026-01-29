import java.util.Stack;
public class SortusingStack {
    static void sort(Stack<Integer>s){
        if(s.isEmpty()){
            return;
        }
        int x=s.pop();
        sort(s);
        insert(s,x);
    }
    static void insert(Stack<Integer>s,int x){
        if(s.isEmpty() || s.peek()<=x){
            s.push(x);
            return;
        }
        int temp=s.pop();
        insert(s,x);
        s.push(temp);
    }
    public static void main(String[] args) {
        Stack<Integer>st=new Stack<>();
        st.push(10);
        st.push(1);
        st.push(3);
        st.push(6);
        sort(st);
        System.out.println(st);
    }
}
