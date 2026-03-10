import java.util.*;

public class mid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> positive = new ArrayList<>();
        for(int num : arr) {
            if(num > 0) {
                positive.add(num);
            }
        }
        int midIndex = (positive.size() - 1) / 2;
        System.out.println(positive.get(midIndex));
    }
}