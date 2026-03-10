
public class hiking {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4,3,2,1};
        int a=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                a=i-1;
                break;
            }
        }
        System.out.println(arr[a]);
    }
}
