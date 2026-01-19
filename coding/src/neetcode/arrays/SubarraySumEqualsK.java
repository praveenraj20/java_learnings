package neetcode.arrays;

import java.util.HashMap;

public class SubarraySumEqualsK {
    public static void main(String[] args) {

        int[] nums = {2, -1, 1, 2};
        int k = 2;
        int result = subarraySum(nums, k);
        System.out.println(result);

    }

    public static int subarraySum(int[] nums, int k) {
        // Map to store prefix sum and its frequency
        HashMap<Integer, Integer> map = new HashMap<>();

        // To handle subarrays starting from index 0
        map.put(0, 1);

        int result = 0;
        int prefixSum = 0;

        for (int num : nums) {
            prefixSum += num;

            // Check if there exists a prefix sum = sum - k
            if (map.containsKey(prefixSum - k)) {
                result += map.get(prefixSum - k);
            }

            // Store current prefix sum
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        return result;
    }
}
/**
 * Time Complexity = O(n)
 * Space Complexity = O(n)
 **/
