public class PalindromeNumber {
    public static void main (String [] args) {
        int x = 10;
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        char[] digits = String.valueOf(x).toCharArray();

        if(digits.length < 2) return true;

        int front = 0;
        int back = digits.length - 1;
        for(int i = 0; i < digits.length / 2; i++) {
            if(digits[i] != digits[back]) return false;
            back--;
        }
        return true;
    }
}
