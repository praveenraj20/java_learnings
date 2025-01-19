package gfg.array;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 1, 2, 3};
        Set<Integer> res = findDuplicates(arr);
        System.out.println(res);
        List<Integer> result = findDuplicatesUsingStreams(arr);
        System.out.println(result);
    }

    private static Set<Integer> findDuplicates(int[] arr) {
        Set<Integer> integerSet = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    integerSet.add(arr[i]);
                }
            }
        }
        return integerSet;
    }

    private static List<Integer> findDuplicatesUsingStreams(int[] arr) {
        Map<Integer, Long> map = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(num -> num, Collectors.counting()));

        return map.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

    }
}
