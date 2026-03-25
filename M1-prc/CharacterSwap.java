public class CharacterSwap {
    public static String characterSwap(String str, char ch1, char ch2) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == ch1)
                result.append(ch2);
            else if (c == ch2)
                result.append(ch1);
            else
                result.append(c);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String str = "apples";
        char ch1 = 'a';
        char ch2 = 'p';
        System.out.println("Input : str = \"" + str + "\", ch1 = '" + ch1 + "', ch2 = '" + ch2 + "'");
        System.out.println("Output: " + characterSwap(str, ch1, ch2)); 
    }
}