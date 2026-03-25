public class ParkingLot {
    public static int parkingLot(char[] arr, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 'S') {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        char[] arr = "XXXSXXSXXSSXXSXX".toCharArray();
        int n = arr.length;
        System.out.println("Input : " + new String(arr));
        System.out.println("Output: " + parkingLot(arr, n));
    }
}