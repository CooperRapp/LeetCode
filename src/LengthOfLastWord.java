import java.util.Arrays;

public class LengthOfLastWord {
    public static void main(String [] args) {
        String s = "   fly me   to   the moon         ";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        int result = 0;

        String[] split = s.split(" ");
        result = split[split.length - 1].length();

        return result;
    }

}
