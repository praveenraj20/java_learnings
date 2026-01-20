package neetcode.twoPointer;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[] s = {'n', 'e', 'e', 't'};
        reverseString(s);
        System.out.println(Arrays.toString(s));
    }

    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}
/**
 * Time Complexity = O(n)
 * Space Complexity = O(1)
 **/
