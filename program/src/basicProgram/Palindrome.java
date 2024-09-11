package basicProgram;

import java.util.stream.IntStream;

public class Palindrome {
    public static void main(String[] a) {
        String str = "madam";
     boolean isPalindrome = IntStream.range(0,str.length()/2).allMatch(i -> str.charAt(i) == str.charAt(str.length()-i-1));
        System.out.println("Is palindrome "+ isPalindrome);
    }
}
