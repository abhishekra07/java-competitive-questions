import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class StringAnagram {
    public static void main(String[] args) {
        String str1 = "Race";
        String str2 = "Care";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

//      if(isAnagram1(str1, str2)) {
//        if(isAnagram2(str1, str2)) {
//        if(isAnagram3(str1, str2)) {
        if(isAnagram4(str1, str2)) {
            System.out.println(str1 +
                    " and " + str2 + " are anagram.");
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

    /**
     * The idea is based in an assumption that the set of possible characters in both strings is small. that the characters are stored using 8 bit and there can be 256 possible characters
     * So count the frequency of the characters and if the frequency of characters in both strings are the same, they are anagram of each other.
     * @param str1
     * @param str2
     * @return
     */
    public static boolean isAnagram2(String str1, String str2) {
        //Time Complexity O(n)
        //check if length is same
        int NO_OF_CHARS = 256;
        if(str1.length() == str2.length()) {
            // Create 2 count arrays and initialize
            // all values as 0
            int count1[] = new int[NO_OF_CHARS];
            Arrays.fill(count1, 0);
            int count2[] = new int[NO_OF_CHARS];
            Arrays.fill(count2, 0);
            int i;

            // For each character in input strings,
            // increment count in the corresponding
            // count array
            for (i = 0; i < str1.length() && i < str2.length();
                 i++) {
                count1[str1.charAt(i)]++;
                count2[str2.charAt(i)]++;
            }

            // Compare count arrays
            System.out.println("count1 " + count1.toString());
            System.out.println("count2 " + count2.toString());
            for (i = 0; i < NO_OF_CHARS; i++)
                if (count1[i] != count2[i])
                    return false;

            return true;
        }
        else {
            return false;
        }
    }


    /**
     * The above can be modified to use only one count array instead of two. Increment the value in count array for characters in str1 and decrement for characters in str2. Finally, if all count values are 0, then the two strings are anagram of each other.
     */
    public static boolean isAnagram3(String str1, String str2) {
        //Time Complexity O(n)
        //check if length is same
        int NO_OF_CHARS = 256;
        if(str1.length() == str2.length()) {
            int[] count = new int[NO_OF_CHARS];
            int i;

            // For each character in input strings,
            // increment count in the corresponding
            // count array
            for(i = 0; i < str1.length(); i++)
            {
                count[str1.charAt(i)]++;
                count[str2.charAt(i)]--;
            }

            // Compare count arrays
            // See if there is any non-zero
            // value in count array
            for(i = 0; i < NO_OF_CHARS; i++)
                if (count[i] != 0)
                {
                    return false;
                }
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Check whether two strings are anagrams of each other by storing all characters in HashMap
     * The idea is a modification of the above approach where instead of creating an array of 256 characters HashMap is used to store characters and count of characters in HashMap. Idea is to put all characters of one String in HashMap and reduce them as they are encountered while looping over other the string.
     * @param str1
     * @param str2
     * @return
     */
    public static boolean isAnagram4(String str1, String str2) {
        //Time Complexity O(n)
        //check if length is same
        int NO_OF_CHARS = 256;
        if(str1.length() == str2.length()) {
            // Create a HashMap containing Character as Key and
            // Integer as Value. We will be storing character as
            // Key and count of character as Value.
            HashMap<Character, Integer> map = new HashMap<>();

            //Loop over all character of String str1 and put in
            // HashMap.
            for (int i = 0; i < str1.length(); i++) {
                map.put(str1.charAt(i), map.getOrDefault(str1.charAt(i) , 0) + 1);
            }

            // Now loop over String str2
            for (int i = 0; i < str2.length(); i++) {
                if (map.containsKey(str2.charAt(i))) {
                    map.put(str2.charAt(i),
                            map.get(str2.charAt(i)) - 1);
                }
                else {
                    return false;
                }
            }

            // Extract all keys of HashMap/map
            Set<Character> keys = map.keySet();
            // Loop over all keys and check if all keys are 0.
            // If so it means it is anagram.
            for (Character key : keys) {
                if (map.get(key) != 0) {
                    return false;
                }
            }
            // Returning True as all keys are zero
            return true;
        }
        else {
            return false;
        }
    }
}
