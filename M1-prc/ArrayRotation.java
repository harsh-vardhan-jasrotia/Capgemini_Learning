public class ArrayRotation {
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp   = arr[start];
            arr[start] = arr[end];
            arr[end]   = temp;
            start++;
            end--;
        }
    }
    public static void rotateRight(int[] arr, int n, int d) {
        d = d % n; 
        if (d == 0) return;
        reverse(arr, 0, n-d-1); 
        reverse(arr, n - d, n - 1); 
        reverse(arr, 0, n - 1);    
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = 5, d = 3;
        System.out.print("Input : ");
        for (int x : arr) System.out.print(x + " ");
        System.out.println("\nd     : " + d);

        rotateRight(arr, n, d);

        System.out.print("Output: ");
        for (int x : arr) System.out.print(x + " "); 
        System.out.println();
    }
}