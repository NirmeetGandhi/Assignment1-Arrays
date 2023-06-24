package Assignment_1_Arrays;

import java.util.Arrays;

class Solution1 {
    public int remove(int[] nums, int val) {
        int k = 0; // Number of elements not equal to val

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is not equal to val
            if (nums[i] != val) {
                nums[k] = nums[i]; // Move the element to the front
                k++; // Increment k
            }
        }

        return k;
    }
}
public class Question2 {
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;

        Solution1 solution = new Solution1();
        int k = solution.remove(nums, val);

        System.out.println("k: " + k);
        System.out.print("nums: [");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i]+" ,");

        }
        System.out.println("]");
    }
}
