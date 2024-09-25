package iq;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharFrequency {
    public static void main (String[] args){
        String inputString = " Hello world!";
        Map<Character, Long> charCount = inputString.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("charCount: "+charCount);
    }
}
