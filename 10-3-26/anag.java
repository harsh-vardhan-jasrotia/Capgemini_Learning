public class anag {
    public static boolean isAnagram(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        int count[]=new int[26];
        for(int i=0;i<s1.length();i++){
            count[s1.charAt(i)-'a']++;
            count[s2.charAt(i)-'a']--;
        }
        for(int i=1;i<26;i++){
            if(count[i]!=0){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        String s1 = "listn";
        String s2 = "silent";
        if(isAnagram(s1, s2)){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }
    }
}
