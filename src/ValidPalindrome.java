public class ValidPalindrome {
    public static void main (String[] args) {
        String s = " ";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int front = 0;
        int back = s.length() - 1;

        for(int i = 0; i < s.length() / 2; i++) {
            if(s.charAt(front) != s.charAt(back)) {
                return false;
            } else {
                front++;
                back--;
            }
        }
        return true;
    }
}
