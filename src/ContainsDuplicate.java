import java.util.HashMap;

public class ContainsDuplicate {
    public static void main (String [] args) {
        int[] nums = {1, 2, 3};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        if(nums.length < 2) return false;

        HashMap<Integer, Integer> elements = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            if(elements.containsKey(nums[i])) {
                return true;
            } else elements.put(nums[i], 1);
        }
        return false;
    }
}
