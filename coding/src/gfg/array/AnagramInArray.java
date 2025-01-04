package gfg.array;

import java.util.*;

public class AnagramInArray {
    public static void main(String[] args) {
        String[] array = {"act", "god", "cat", "dog", "tac"};
        ArrayList<ArrayList<String>> result = anagrams(array);
        System.out.println(result);
    }

    public static ArrayList<ArrayList<String>> anagrams(String[] arr) {
        Map<String, ArrayList<String>> map = new LinkedHashMap<>();
        for (String word : arr) {
            char[] ch = word.toCharArray();
            Arrays.sort(ch);
            String sortedStr = new String(ch);
            map.putIfAbsent(sortedStr, new ArrayList<>());
            map.get(sortedStr).add(word);
        }
        return new ArrayList<>(map.values());
    }
}
