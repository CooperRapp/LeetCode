import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int result = removeDuplicates(nums);
        System.out.println(result);
    }
    public static int removeDuplicates(int[] nums) {
        int result = 0;
        HashMap<Integer, Integer> elements = new HashMap<>();
        int j = 0;

        for(int i = 0; i < nums.length; i++) {
            if(!elements.containsKey(nums[i])) {
                elements.put(nums[i], 0);
                nums[j] = nums[i];
                j++;
            }
        }
        return elements.size();
    }
}
