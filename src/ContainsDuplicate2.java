import java.util.HashMap;

public class ContainsDuplicate2 {
    public static void main (String [] args) {
        int[] nums = {1,0,1,1};
        int k = 1;
        System.out.println(containsNearbyDuplicate(nums, k));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> elements = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!elements.containsKey(nums[i])) {
                elements.put(nums[i], i);
            } else {
                if (Math.abs(elements.get(nums[i]) - i) <= k) {
                    return true;
                } else {
                    elements.put(nums[i], i);
                }
            }
        }
        return false;
    }
}

