package neetcode.arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * Input: nums = [1, 2, 3, 3]
 * Output: true
 **/

public class ContainDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        boolean result = hasDublicate(nums);
        boolean result2 = hasDublicate(nums);
        System.out.println("Worst Approach: " + result);
        System.out.println("Best Approach: " + result2);

    }

    public static boolean hasDublicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j])
                    return true;
            }
        }
        return false;
    }
    /**
     * TIme Complexity = O(n²)
     * Space Complexity  = O(1)
     * **/


    /**
     * Method-II
     **/
    public static boolean hasDublicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num))
                return true;
        }
        return false;
    }

    /**
     * TIme Complexity = O(n)
     * Space Complexity  = O(n)
     * Now,I added extra space for faster time by using a HashSet, reducing time complexity from O(n²) to O(n).
     * **/
}
