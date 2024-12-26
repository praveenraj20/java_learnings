package basicPrograms;

import java.util.stream.IntStream;

public class Palindrome {
    static String str = "madam";

    public static void main(String[] a) {
        if (isPalindrome(str)) {
            System.out.println("given string is palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

    }

    public static boolean isPalindrome(String string) {
        int left = 0;
        int right = str.length() - 1;
        while (right > left) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    //java_8
//        boolean isPalindrome = IntStream.range(0, str.length() / 2).allMatch(i -> str.charAt(i) == str.charAt(str.length() - i - 1));
//        System.out.println("Is palindrome " + isPalindrome);


}
