// NOT COMPLETED

public class FindTheIndexOfTheFirstOccurrenceInAString {
    public static void main(String[] args) {
        String haystack = "mississippi";
        String needle = "issip";
        int result = strStr(haystack, needle);
        System.out.println(result);
    }
    public static int strStr(String haystack, String needle) {
        int counter = 0;

        for(int i = 0; i < haystack.length() - 1; i++) {
            if(needle.charAt(counter) == haystack.charAt(i)) {
                if(needle.charAt(counter + 1) == haystack.charAt(i + 1)) {
                    counter++;

                    if(counter == haystack.length()) {
                        return (i + 1) - counter;
                    }
                }
                else {
                    counter = 1;
                }
            }
            else counter = 0;
        }

        return -1;
    }
}
