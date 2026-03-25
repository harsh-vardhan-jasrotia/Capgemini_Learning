public class ArrayEquilibrium {
    public static int arrayEquilibrium(int[] arr, int n) {
        int totalSum = 0;
        for (int x : arr) totalSum += x;
        int leftSum = 0;
        for (int i = 0; i < n; i++) {
            int rightSum = totalSum - leftSum - arr[i];
            if (leftSum == rightSum) return i;
            leftSum += arr[i];
        }
        return -1;
    }   
    public static void main(String[] args) {
        int[] arr = {1,7, 4,3, 5 };
        int n = arr.length;
        System.out.print("Input : ");
        for (int x : arr) System.out.print(x + " ");
        System.out.println();
        System.out.println("Output: " + arrayEquilibrium(arr, n)); 
    }
}