package neetcode.twoPointer;

import java.util.Arrays;

/**
 * Input: nums = [1,2,3,4,5,6,7,8], k = 4
 * Output: [5,6,7,8,1,2,3,4]
 **/
public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {2, 7, 1, 15, 11, 10};
        int k = 3;
        System.out.println(Arrays.toString(rotate(nums, k)));
    }

    public static int[] rotate(int[] nums, int k) {
        k = k % nums.length;
        int n = nums.length;
        reverseNum(nums, 0, n - 1);
        reverseNum(nums, 0, k - 1);
        reverseNum(nums, k, n - 1);
        return nums;
    }

    public static void reverseNum(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}

/**
 * Time Complexity  = O(n)
 * Space Complexity = O(1)
 **/
