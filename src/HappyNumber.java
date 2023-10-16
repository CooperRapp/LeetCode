// NOT COMPLETED

import java.util.HashMap;

public class HappyNumber {
    public static void main(String [] args) {
        int n = 19;

        boolean result = isHappy(n);
        System.out.println(result);
    }

    public static boolean isHappy(int n) {
        HashMap<Integer, Integer> elements = new HashMap<>();
        return helper(n, elements);
    }

    private static boolean helper(int n, HashMap<Integer, Integer> elements) {
        int sum = 0;
        elements.put(n, 1);
        while(n > 0) {
            sum += Math.pow((n % 10), 2);
            n /= 10;
        }
        if(sum == 1) return true;
        else if(elements.containsKey(sum)) return false;
        else return helper(sum, elements);
    }
}
