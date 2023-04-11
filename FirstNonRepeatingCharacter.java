import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String str = "aabbdde";
        System.out.println(findNonRepeatingChar1(str));
    }

    public static char findNonRepeatingChar1(String str) {
        // Time Complexity: O(N2)
        int index = -1;
        char fnc = ' ';
        for (char i : str.toCharArray()) {
            if (str.indexOf(i) == str.lastIndexOf(i)) {
                fnc = i;
                break;
            }
            else {
                index += 1;
            }
        }
        return fnc;
    }
    public static char findNonRepeatingChar(String str) {
        Map<Character, Integer> counterMap = new LinkedHashMap<>();
        for(char ch : str.toCharArray()) {
            counterMap.put(ch, counterMap.getOrDefault(ch, 0) + 1);
        }
        for(Map.Entry<Character, Integer> entry : counterMap.entrySet()) {
            if(entry.getValue() == 1)
                return entry.getKey();
        }
        throw new RuntimeException("didn't find any non repeating character");
    }
}
