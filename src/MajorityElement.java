import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        int result = majorityElement(nums);
        System.out.println(result);
    }
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> elements = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {

            if(!elements.containsKey(nums[i])) {
                elements.put(nums[i], 1);
            } else elements.replace(nums[i], elements.get(nums[i]) + 1);

            if(elements.get(nums[i]) > nums.length / 2) return nums[i];
        }
        return 0;
    }
}
