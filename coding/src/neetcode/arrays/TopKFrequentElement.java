package neetcode.arrays;

import java.util.*;

/**
 * Input: nums = [1,2,2,3,3,3], k = 2
 * Output: [2,3]
 * Give me the top 2 most frequent numbers.
 **/
public class TopKFrequentElement {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 3, 3};
        int k = 2;
        System.out.println(Arrays.toString(topKFrequent(nums, k)));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        // Step 1: Count frequency using HashMap
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
            // map.put(num, map.getOrDefault(num, 0) + 1); => shortcut
        }

        // Step 2: Create buckets (index = frequency)
        List<Integer>[] bucket = new ArrayList[nums.length + 1];

        for (int key : map.keySet()) {
            int freq = map.get(key);
            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }

        // Step 3: Collect top k frequent elements
        int[] result = new int[k];
        int index = 0;

        for (int i = bucket.length - 1; i >= 0 && index < k; i--) {
            if (bucket[i] != null) {
                for (int num : bucket[i]) {
                    result[index++] = num;
                    if (index == k) {
                        break;
                    }
                }
            }
        }
        return result;
    }
    /**
     * Time Complexity = O(n)
     * Space Complexity = O(n)
     **/
}
