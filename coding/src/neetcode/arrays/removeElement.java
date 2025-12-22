package neetcode.arrays;

import java.util.Arrays;

/**
 * Input: nums = [1,1,2,3,4], val = 1
 * Output: [2,3,4]
 **/

public class removeElement {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 4};
        int val = 1;
        int k = removeElement(nums, val);
        System.out.println(Arrays.toString(Arrays.copyOf(nums, k)));

    }

    public static int removeElement(int[] nums, int val) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
    /**
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     * */
}
