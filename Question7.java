package Assignment_1_Arrays;

class Solution5 {
    public void moveZeroes(int[] nums) {
        int index = 0;

        for (int num : nums) {
            if (num != 0) {
                nums[index] = num;
                index++;
            }
        }

        while (index < nums.length) {
            nums[index] = 0;
            index++;
        }
    }
}

public class Question7 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};

        Solution5 solution = new Solution5();
        solution.moveZeroes(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }
}
