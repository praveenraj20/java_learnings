package gfg.array;

import java.util.HashMap;
import java.util.Map;

public class MinMaxElementInArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 1, 5, 4, 5, 9, 1, 2};
        int length = array.length;
        int minKey = 0, minValue = Integer.MAX_VALUE;
        int maxKey = 0, maxValue = Integer.MIN_VALUE;

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : array) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            if (value < minValue) {
                minValue = value;
                minKey = key;
            }

            if (value > maxValue) {
                maxValue = value;
                maxKey = key;
            }
        }
        System.out.println(" Minimum key: " + minKey + " Minimum Value: " + minValue);
        System.out.println(" Maximum key: " + maxKey + " Maximum Value: " + maxValue);

    }
}
