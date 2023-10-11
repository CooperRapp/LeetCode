import java.util.Arrays;
import java.util.HashMap;

public class LongestConsecutiveSequence {
    public static void main (String [] args) {
        int[] nums = {1,2,0,1};
        System.out.println(longestConsecutive(nums));
    }

    public static int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return 1;

        Arrays.sort(nums);

        int counter = 0;
        int longestSeq = 0;

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] - nums[i - 1] == 1) {
                counter++;
            } else {
                if(nums[i] - nums[i - 1] == 0) continue;
                if(longestSeq < counter) longestSeq = counter;
                counter = 0;
            }
            if(longestSeq < counter) longestSeq = counter;
        }
        return longestSeq + 1;
    }
}
