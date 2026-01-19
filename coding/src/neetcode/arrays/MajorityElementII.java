package neetcode.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementII {
    public static void main(String[] args) {
        int[] nums = {5, 2, 3, 2, 2, 2, 2, 5, 5, 5};
        System.out.println(majorityElement(nums));
    }

    public static List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> candidates = new HashMap<>();
        for (int num : nums) {
            if (candidates.containsKey(num)) {
                candidates.put(num, candidates.get(num) + 1);
            } else {
                candidates.put(num, 1);
            }
        }
        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : candidates.entrySet()) {
            if (entry.getValue() > nums.length / 3) {
                result.add(entry.getKey());
            }
        }

        return result;
    }
}
/**
 * Time Complexity = O(n)
 * Space Complexity = O(n)
 **/
