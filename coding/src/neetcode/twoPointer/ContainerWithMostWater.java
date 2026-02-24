package neetcode.twoPointer;

/**
 * You are given an integer array heights where heights[i] represents the height of the i th bar.
 * You may choose any two bars to form a container. Return the maximum amount of water a container can store.
 * Example 1:
 * Input: height = [1,7,2,5,4,7,3,6]
 * Output: 36
 * Example 2:
 * Input: height = [2,2,2]
 * Output: 4
 **/
public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] heights = {1, 7, 2, 5, 4, 7, 3, 6};
        System.out.println(maxArea(heights));

    }

    public static int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int maxArea = 0;

        while (left < right) {
            int height = Math.min(heights[left], heights[right]);
            int width = right - left;
            int area = height * width;

            maxArea = Math.max(maxArea, area);

            // Move the smaller height pointer
            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
/**
 * Time Complexity = O(n)
 * Space Complexity = O(1)
 */
