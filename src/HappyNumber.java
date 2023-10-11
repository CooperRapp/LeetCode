// NOT COMPLETED

import java.util.HashMap;

public class HappyNumber {
    public static void main(String [] args) {
        int n = 19;
        boolean result = isHappy(n);
        System.out.println(result);
    }
    public static boolean isHappy(int n) {
        int result = 0;
        int counter = 0;
        int length = String.valueOf(n).length();
        HashMap<Integer, Integer> elements = new HashMap<>();
        elements.put(n, 1);
        System.out.println(n + "  " + counter + "  " + length);

        while(result != 1) {
            if(elements.containsKey(result)) return false;

            if(counter == length) {
                n = result;
                elements.put(n, 1);
                length = String.valueOf(n).length();
                counter = 0;
                result = 0;
            }
            result += Math.pow((n % 10), 2);
            n /= 10;
            counter++;
        }
        return true;
    }
}
