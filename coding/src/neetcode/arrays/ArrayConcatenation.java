package neetcode.arrays;

/**
 * Input int[] nums = {1,2,3,4}
 * Output int[] result = {1,2,3,4,1,2,3,4}
 **/

public class ArrayConcatenation {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int[] result = getConcatenation(nums);

        for (int n : result) {
            System.out.print(n + " ");
        }
    }


    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        return ans;
    }
}

/**
 * Time complexity = O(n)
 * Space Complexity  = O(n)
 * For this problem, Best, Worst, and Average time and space complexities are ALL THE SAME.
 **/
