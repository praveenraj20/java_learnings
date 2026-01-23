package neetcode.twoPointer;

/***
 * Input: word1 = "abc", word2 = "xyz"
 * Output: "axbycz"
 * Example 2:
 * Input: word1 = "ab", word2 = "abbxxc"
 * Output: "aabbbxxc"
 * **/


public class MergeStringsAlternately {
    public static void main(String[] args) {
        String word1 = "abcde";
        String word2 = "xyz";
        System.out.println(mergeAlternately(word1, word2));
    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int j = 0;
        int i = 0;

        while (i < word1.length() && j < word2.length()) {
            result.append(word1.charAt(i++));
            result.append(word2.charAt(j++));
        }
        while (i < word1.length()) {
            result.append(word1.charAt(i++));
        }
        while (j < word2.length()) {
            result.append(word2.charAt(j++));
        }

        return result.toString();
    }
}

/**
 * Time Complexity = O(n + m)
 * Space Complexity = O(n +m)
 *
 * n = word1.length()
 * m = word2.length()
 * **/
