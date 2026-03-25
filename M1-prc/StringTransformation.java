public class StringTransformation {
    public static String stringTransformation(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a')
                result.append('b');
            else if (c == 'b')
                result.append('a');
            else
                result.append(c);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String str = "abaabbcc";
        System.out.println("Input : " + str);
        System.out.println("Output: " + stringTransformation(str)); 
    }
}