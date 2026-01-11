package neetcode.arrays;

import java.util.HashMap;
import java.util.Map;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {2, 20, 4, 10, 3, 4, 5, 6};
        int result = longestConsecutive(nums);
        System.out.println(result);
    }

    public static int longestConsecutive(int[] nums) {
        int longestLength = 0;
        Map<Integer, Boolean> exploredMap = new HashMap<>();
        for (int num : nums) {
            exploredMap.put(num, Boolean.FALSE);
        }
        for (int num : nums) {
            int currentLength = 1;

            //Check in forward directions
            int nextNum = num + 1;
            while (exploredMap.containsKey(nextNum) && exploredMap.get(nextNum) == Boolean.FALSE) {
                currentLength++;
                exploredMap.put(nextNum, Boolean.TRUE);

                // Move to the next Number
                nextNum++;
            }

            //Check in reverse direction
            int prevNum = num - 1;
            while (exploredMap.containsKey(prevNum) && !exploredMap.get(prevNum)) {
                currentLength++;
                exploredMap.put(prevNum, Boolean.TRUE);
                prevNum--;
            }
            longestLength = Math.max(longestLength, currentLength);
        }

        return longestLength;
    }
}

/**
 * Time Complexity = O(n)
 * Space Complexity = O(n)
 **/
