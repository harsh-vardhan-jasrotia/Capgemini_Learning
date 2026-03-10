import java.util.Arrays;

public class PushZerosToEnd {
    public static void pushZerosToEnd(int[] arr, int n) {
        int pos = 0; 
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[pos++] = arr[i];
            }
        }
        while (pos < n) {
            arr[pos++] = 0;
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 0, 7, 0};
        int n = arr.length;
        pushZerosToEnd(arr, n);
        System.out.println(Arrays.toString(arr));
    }
}