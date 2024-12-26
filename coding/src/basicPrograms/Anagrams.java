package basicPrograms;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String A = " hello";
        String B = "Hello";

        if (isAnagram(A, B)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }

    public static boolean isAnagram(String str1, String str2) {
        str1 = str1.replaceAll("\\s+", "").toLowerCase();
        str2 = str2.replaceAll("\\s+", "").toLowerCase();

        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);
        if (str1.length() != str2.length()) {
            return false;
        }
        return Arrays.equals(a, b);

    }

}


//         for (int i = 0; i < chA.length - 1; i++) {
//        for (int j = 0; j < chA.length - i - 1; j++) {
//        if (chA[j] > chA[j + 1]) {
//// Swap chA[j] and chA[j + 1]
//char temp = chA[j];
//chA[j] = chA[j + 1];
//chA[j + 1] = temp;
//                }
//                        if (chB[j] > chB[j + 1]) {
//// Swap chB[j] and chB[j + 1]
//char temp = chB[j];
//chB[j] = chB[j + 1];
//chB[j + 1] = temp;
//                }
//                        }
//                        }
//                        for (int i = 0; i < chA.length; i++) {
//        if (chA[i] != chB[i]) {
//        return false;
//        }