import java.util.Arrays;
import java.util.HashMap;

public class RansomNote {
    public static void main (String[] args) {
        String ransomNote = "aaa";
        String magazine = "aajfasolb";
        boolean result = canConstruct(ransomNote, magazine);
        System.out.println(result);
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> elements = new HashMap<>();

        if(ransomNote.length() > magazine.length()) return false;

        for(int i = 0; i < magazine.length(); i++) {
            if(!elements.containsKey(magazine.charAt(i))) {
                elements.put(magazine.charAt(i), 1);
            }
            else elements.put(magazine.charAt(i), elements.get(magazine.charAt(i)) + 1);

            if(elements.containsKey(ransomNote.charAt(i))) {
                if(elements.get(ransomNote.charAt(i)) > 1) {
                    elements.put(ransomNote.charAt(i), elements.get(ransomNote.charAt(i)) - 1);
                } else elements.remove(ransomNote.charAt(i));
            } else return false;
        }
        return true;
    }
}
