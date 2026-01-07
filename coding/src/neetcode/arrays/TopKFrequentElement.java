package neetcode.arrays;

import java.util.*;

/**
 * Input: nums = [1,2,2,3,3,3], k = 2
 * Output: [2,3]
 * Give me the top 2 most frequent numbers.
 **/
public class TopKFrequentElement {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 3, 3, 4, 4};
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
        map.forEach((key, value) -> System.out.println(key + "=" + value)
        );
        System.out.println("----");

        // Step 2: Create buckets (index = frequency)
        List<Integer>[] bucket = new ArrayList[nums.length + 1];
        for (int key : map.keySet()) {
            int freq = map.get(key);
            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }
        for (int i = 0; i < bucket.length; i++) {
            System.out.println("bucket[" + i + "]" + "->" + bucket[i]);
        }
        System.out.println("----");

        // Step 3: Collect top k frequent elements
        int[] result = new int[k];
        int index = 0;
        for (int i = bucket.length - 1; i >= 0 && index < k; i--) {
            if (bucket[i] != null) {
                for (int num : bucket[i]) {
                    result[index] = num;
                    index++;
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

/**
 *             // Step 3: To collect ALL elements in top K frequencies
 *             List<Integer> resultList = new ArrayList<>();
 *             int freqCount = 0;
 *
 *             for (int x = bucket.length - 1; x >= 0 && freqCount < k; x--) {
 *                 if (bucket[x] != null) {
 *                     resultList.addAll(bucket[x]); // add ALL elements
 *                     freqCount++; // one frequency level used
 *                 }
 *             }
 *
 *             // Convert List to int[]
 *             int[] result2 = new int[resultList.size()];
 *             for (int x = 0; i < result.length; x++) {
 *                 result[x] = resultList.get(x);
 *             }
 *
 *             return result;
 *
 *             output = [3,2,4]
 **/
