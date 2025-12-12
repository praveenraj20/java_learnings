package neetcode.arrays;

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
