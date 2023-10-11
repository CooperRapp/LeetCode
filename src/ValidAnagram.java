import java.util.Arrays;
import java.util.HashMap;

public class ValidAnagram {
    public static void main (String[] args) {
        String s = "rat";
        String t = "rat";
        System.out.println(isAnagram(s, t));
    }
    public static boolean isAnagram(String s, String t) {
        int counter = 0;

        if(s.length() != t.length()) return false;

        char[] sArr = s.toCharArray();
        Arrays.sort(sArr);
        char[] tArr = t.toCharArray();
        Arrays.sort(tArr);

        return Arrays.equals(sArr, tArr);
    }
}
