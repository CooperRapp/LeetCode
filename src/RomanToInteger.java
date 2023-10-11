import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        int result = romanToInt(s);
        System.out.println(result);
    }
    public static int romanToInt(String s) {
        HashMap<Character, Integer> elements = new HashMap<>();
        elements.put('I', 1);
        elements.put('V', 5);
        elements.put('X', 10);
        elements.put('L', 50);
        elements.put('C', 100);
        elements.put('D', 500);
        elements.put('M', 1000);

        int res = 0;

        if(s.length() == 1) return elements.get(s.charAt(0));

        for(int i = 0; i < s.length() - 1; i++){
            if(elements.get(s.charAt(i)) >= elements.get(s.charAt(i + 1))) {
                res += elements.get(s.charAt(i));
            }
            else {
                res += (elements.get(s.charAt(i + 1)) - elements.get(s.charAt(i)));
                i++;
            }
            if(i == s.length() - 2) {
                res += elements.get(s.charAt(i + 1));
            }
        }
        return res;
    }
}
