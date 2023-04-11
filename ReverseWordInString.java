public class ReverseWordInString {
    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));
    }
    public static String reverseWords(String s) {
        s = s.trim();
        String[] splitted = s.split("\\s+");
        String res = "";
        for(int i = splitted.length-1; i >= 0; i--) {
            res += splitted[i] + " ";
        }
        return res.substring(0, res.length()-1);
    }
}
