package neetcode.strings;
/**
 * Input: s = "racecar", t = "carrace"
 * Output: true
 * */

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "abcdd";
        String t = "dcbaa";
        System.out.println(isAnagram(s, t));

    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] count = new int[26];

        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            count[c - 'a']--;
        }
        for (int i : count) {
            if (i != 0)
                return false;
        }
        return true;
    }
}

/**
 * Time Complexity  = O(n)
 * Space Complexity = O(1)
 * **/
