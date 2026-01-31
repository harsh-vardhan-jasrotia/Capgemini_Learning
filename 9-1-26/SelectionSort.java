
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={2,1,8,4,9,3};
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int minind=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minind]){
                    minind=j;
                }
            }
            int temp=arr[minind];
            arr[minind]=arr[i];
            arr[i]=temp;
        }
        System.out.println("Sorted array:");
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
}
