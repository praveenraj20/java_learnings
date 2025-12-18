package neetcode.arrays;

/**
 * Input: strs = ["dance","dag","danger","damage"]
 * Output: "da"
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"dance", "dag", "danger", "damage"};
        System.out.println("Longest Common Prefix: " + longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
    /**
     * Time Complexity = O(n x m)
     * Space Complexity = O(1)
     * **/
}

