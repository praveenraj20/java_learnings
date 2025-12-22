package neetcode.arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {5, 5, 1, 1, 1, 5, 5};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }
    /**
     * Time Complexity = O(n)
     * Space Complexity = O((1)
     * */
}
