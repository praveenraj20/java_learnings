package interviewqs;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharFrequencyCount {
    public static void main(String[] args) {
        String str = "Some problem statement";

        // Step 1: Convert the string into a Stream of characters and count occurrences
        Map<Character, Long> charCount = str.chars()
                .mapToObj(c -> (char) c)  // Convert int stream to Character stream
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));  // Count occurrences

        // Step 2: Filter characters that appear more than once and store them in an array
        Character[] result = charCount.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)  // Keep only characters appearing more than once
                .map(Map.Entry::getKey)  // Extract the character
                .sorted()  // Sort the characters
                .toArray(Character[]::new);  // Convert to an array

        // Step 3: Print the result
        System.out.println(Arrays.toString(result));
    }
}
