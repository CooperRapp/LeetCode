import java.util.Arrays;
import java.util.HashMap;

public class WordPattern {
    public static void main (String [] args) {
        String pattern = "abba";
        String s = "dog dog dog dog";
        System.out.println(wordPattern(pattern, s));
    }

    public static boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> elements = new HashMap<>();
        String[] values = s.split((" "));

        if(values.length != pattern.length()) return false;

        for(int i = 0; i < pattern.length(); i++) {
            if(!elements.containsKey(pattern.charAt(i))) {
                if(elements.containsValue(values[i])) return false;
                elements.put(pattern.charAt(i), values[i]);
            } else {
                if(!elements.get(pattern.charAt(i)).equals(values[i])) {
                    return false;
                }
            }
        }
        return true;
    }
}
