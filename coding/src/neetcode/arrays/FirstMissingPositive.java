package neetcode.arrays;

import java.util.Arrays;

/**
 * Input: nums = [-2,-1,0]
 * Output: 1
 * <p>
 * Input: nums = [1,2,4]
 * Output: 3
 * <p>
 * Input: nums = [1,2,4,5,6,3,1]
 * Output: 7
 **/
public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] num = {-2, -1, 0};
        System.out.println(firstMissingPositive(num));

        System.out.println(firstMissingPositiveNum(num));
    }

    public static int firstMissingPositive(int[] nums) {
        int missingNumber = 1;
        Arrays.sort(nums);
        for (int number : nums) {
            if (number > 0) {
                if (number == missingNumber)
                    missingNumber++;
                else if (number > missingNumber)
                    break;
            }
        }

        return missingNumber;
    }

    /**
     * Time Complexity =  O(n log n)
     * Space Complexity = O(n)
     **/

    public static int firstMissingPositiveNum(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            while (nums[i] >= 1 && nums[i] <= n
                    && nums[nums[i] - 1] != nums[i]) {
                int temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return n + 1;
    }
    /**
     * Time Complexity =  O(n)
     * Space Complexity = O(n)
     * **/
}
