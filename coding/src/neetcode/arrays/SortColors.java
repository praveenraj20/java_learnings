package neetcode.arrays;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 2};
        sortColor(nums);
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(nums));

    }

    public static void sortColor(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }

    /**
     * Time Complexity = O(n²)
     * Space Complexity = O(1)
     **/

    //Best approach
    public static void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }
    /**
     * Time Complexity = O(n)
     * Space Complexity = O(1)
     * **/
}
