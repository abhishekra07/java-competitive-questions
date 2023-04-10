import java.sql.SQLOutput;
import java.util.Arrays;

public class StringAnagram {
    public static void main(String[] args) {
        String str1 = "Race";
        String str2 = "Care";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(isAnagram1(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagram.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagram.");
        }
    }

    public static boolean isAnagram1(String str1, String str2) {
        //Time Complexity O(N * LogN)
        //check if length is same
        if(str1.length() == str2.length()) {
            // convert strings to char array
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            // sort the char array
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            // if sorted char arrays are same
            // then the string is anagram
            boolean result = Arrays.equals(charArray1, charArray2);

            if(result) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }

    public static boolean isAnagram2(String str1, String str2) {
        //Time Complexity O(N * LogN)
        //check if length is same
        if(str1.length() == str2.length()) {
            // convert strings to char array
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            // sort the char array
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            // if sorted char arrays are same
            // then the string is anagram
            boolean result = Arrays.equals(charArray1, charArray2);

            if(result) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }
}
