package neetcode.strings;

import java.util.*;

public class EncodeDecodeStrings {
    // Test the encode/decode
    public static void main(String[] args) {
        List<String> input = Arrays.asList("Hello", "World", "", "123#456");

        // Encode
        String encoded = encode(input);
        System.out.println("Encoded string: " + encoded);

        // Decode
        List<String> decoded = decode(encoded);
        System.out.println("Decoded list: " + decoded);
    }

    // Encode a list of strings to a single string
    public static String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length()).append('#').append(s);
        }
        return sb.toString();
    }

    // Decode a single string back to a list of strings
    public static List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            // Find the next '#' character to get the length
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));
            // Extract the string of that length
            String s = str.substring(j + 1, j + 1 + length);
            result.add(s);
            // Move index to the next encoded string
            i = j + 1 + length;
        }
        return result;
    }
    /***
     * Time Complexity = O(n)
     * Space Complexity = O(n)
     * **/
}
