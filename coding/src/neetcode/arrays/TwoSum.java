package neetcode.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * nums = [3,4,5,6], target = 7
 * Output: [0,1]
 */

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3, 1, 11, 15};
        int target = 18;
        System.out.println("Worst Case: " + Arrays.toString(twoSum(nums, target)));
        System.out.println("Best Case: " + Arrays.toString(twoSums(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
        /**
         * Time Complexity : O(n²)
         * Space Complexity: O(1)
         * **/
    }

    public static int[] twoSums(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
        /**
         * Time Complexity : O(n)
         * Space Complexity: O(n)
         * **/
    }
}