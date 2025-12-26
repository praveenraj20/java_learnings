package neetcode.arrays;

import java.util.Arrays;

/**
 * Input: nums = [10,9,1,1,1,2,3,1]
 * Output: [1,1,1,1,2,3,9,10]
 **/
public class SortArray {
    public static void main(String[] args) {
        int[] nums = {10, 9, 1, 1, 1, 2, 3, 1};
        sortArray(nums);
        System.out.println(Arrays.toString(nums));

    }

    public static int[] sortArray(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        return nums;
    }
    /**
     * Time Complexity: O(n²)
     * Space Complexity: O(1)
     * **/
}
