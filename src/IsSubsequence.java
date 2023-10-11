public class IsSubsequence {
    public static void main (String [] args) {
        String s = "";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }

    public static boolean isSubsequence(String s, String t) {
        int counter = 0;
        System.out.println(s.length());

        if(s.length() == 0) return true;
        if(t.length() == 0) return false;

        for(int i = 0; i < t.length(); i++) {
            if(s.charAt(counter) == t.charAt(i)) {
                counter++;
            }
            if(counter == s.length()) return true;
        }
        return false;
    }
}
