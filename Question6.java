package Assignment_1_Arrays;
import java.util.Arrays;

class Solution4 {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }

        return false;
    }
}
public class Question6 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};

        Solution4 solution = new Solution4();
        boolean containsDuplicate = solution.containsDuplicate(nums);

        System.out.println("Contains Duplicate: " + containsDuplicate);
    }
}
