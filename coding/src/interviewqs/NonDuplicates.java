package interviewqs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class NonDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 1, 2};
        HashMap<Integer, Integer> integerHashMap = new HashMap<>();
        for (int num : arr) {
            integerHashMap.put(num, integerHashMap.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : integerHashMap.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
        System.out.println("Non-duplicate elements:");
        for (int num : arr) {
            if (integerHashMap.get(num) == 1) {
                System.out.print(num + " ");
            }
        }

        //Using Java-8
        System.out.println();
        Map<Integer, Long> integerMap = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(num -> num, Collectors.counting()));
        Arrays.stream(arr).filter(n -> integerMap.get(n) == 1).forEach(n -> System.out.print(n + " "));

    }
}
