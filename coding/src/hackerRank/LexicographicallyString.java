package hackerRank;

import java.util.Scanner;

public class LexicographicallyString {
    public static void main(String[] args) {
        String A = "hello";
        String B = "java";

        int l = A.length();
        int k = B.length();
        int sum = l + k;
        System.out.println(sum);

        int res1 = A.compareTo(B);
        if (res1 > 0) {
            System.out.println("yes");
        } else {
            System.out.println("No");
        }

        String capitalizedA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capitalizedB = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(capitalizedA + " " + capitalizedB);


    }
}
