import java.util.HashMap;

public class IsomorphicStrings {
    public static void main (String[] args) {
        String s = "badc";
        String t = "baba";
        System.out.println(isIsomorphic(s, t));
    }

    public static boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;

        HashMap<Character, Character> elements = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            if(elements.containsKey(s.charAt(i))) {
                if(elements.get(s.charAt(i)) != t.charAt(i)) return false;
            }
            else {
                if(elements.containsValue(t.charAt(i))) return false;
                elements.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;
    }
}
