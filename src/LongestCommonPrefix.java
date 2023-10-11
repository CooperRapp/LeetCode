import java.util.Arrays;
import java.util.HashMap;

public class LongestCommonPrefix {
    public static void main (String[] args) {
        String[] strs = {"ab", "a"};
        String result = longestCommonPrefixBETTER(strs);
        System.out.println(result);
    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        int counter = 0;
        String compare =  strs[0];

        if(strs.length == 1) return compare;

        for(int i = 0; i < compare.length(); i++) {
            for(int j = 1; j < strs.length; j++) {

                if(i >= strs[j].length()) return result.toString();

                System.out.println(compare.charAt(i) + "  " + strs[j].charAt(i));
                if(compare.charAt(i) == strs[j].charAt(i)) {
                    counter++;
                    if(counter == strs.length -1) {
                        result.append(compare.charAt(i));
                        counter = 0;
                    }
                }  else return result.toString();
            }
        }
        return result.toString();
    }

    public static String longestCommonPrefixBETTER(String[] strs) {
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        int shortestLength = Math.min(first.length(), last.length());
        StringBuilder result = new StringBuilder();

        if(strs.length == 1) return first;

        for(int i = 0; i < shortestLength; i++) {
            if(first.charAt(i) == last.charAt(i)) {
                result.append(first.charAt(i));
            } else break;
        }
        return result.toString();
    }
}
