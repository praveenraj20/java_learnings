package basicProgram;

import java.util.HashSet;
import java.util.Set;

public class DublicateInString {
    public static void main(String[] args) {
        String name = "Praveen raj";
        System.out.println(name);
        String lowerCase = name.toLowerCase();
        char[] string = lowerCase.toCharArray();
        int count;

        // To keep track of characters that are already printed
        Set<Character> printedChars = new HashSet<>();

        for (int i = 0; i < string.length; i++) {
            count = 1;
            if (string[i] != ' ' && !printedChars.contains(string[i])) {
                for (int j = i + 1; j < string.length; j++) {
                    if (string[i] == string[j]) {
                        count++;
                        string[j] = '0'; // Mark as visited
                    }
                }
                if (count > 1) {
                    System.out.println("Character: " + string[i] + ", Count: " + count);
                    printedChars.add(string[i]);
                }
            }
        }
    }
}
