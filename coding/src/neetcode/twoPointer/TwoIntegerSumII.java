package neetcode.twoPointer;

import java.util.Arrays;

public class TwoIntegerSumII {
    public static void main(String[] args) {
        int target = 3;
        int[] numbers = {1, 1, 2, 3, 4, 5, 6};
        int[] result = twoSum(numbers, target);
        System.out.println(Arrays.toString(result));


    }

    public static int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1};
    }
}
/**
 * Time Complexity = O(n)
 * Space Complexity = O(1)
 **/