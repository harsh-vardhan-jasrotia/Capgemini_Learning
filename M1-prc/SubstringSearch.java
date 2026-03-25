public class SubstringSearch {
    public static int substringSearch(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        for (int i = 0; i <= n - m; i++) {
            int j = 0;
            while (j < m && str1.charAt(i + j) == str2.charAt(j)) {
                j++;
            }
            if (j == m) return i; 
        }
        return -1;
    }
    public static void main(String[] args) {
        String str1 = "Hello, World!";
        String str2 = "World";
        System.out.println("str1  : " + str1);
        System.out.println("str2  : " + str2);
        System.out.println("Output: " + substringSearch(str1, str2));
    }
}