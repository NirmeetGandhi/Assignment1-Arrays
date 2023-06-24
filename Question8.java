package Assignment_1_Arrays;
import java.util.Arrays;

class Solution6 {
    public int[] find(int[] nums) {
        int[] result = new int[2];
        int n = nums.length;

        Arrays.sort(nums);

        int duplicate = -1;
        int missing = 1;

        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                duplicate = nums[i];
            } else if (nums[i] > nums[i - 1] + 1) {
                missing = nums[i - 1] + 1;
            }
        }
        if (nums[n - 1] != n) {
            missing = n;
        }

        result[0] = duplicate;
        result[1] = missing;

        return result;
    }
}
public class Question8 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4};

        Solution6 solution = new Solution6();
        int[] result = solution.find(nums);

        System.out.println("Duplicate: " + result[0]);
        System.out.println("Missing: " + result[1]);
    }
}
