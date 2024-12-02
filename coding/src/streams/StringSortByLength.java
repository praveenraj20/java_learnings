package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StringSortByLength {
    public static void main(String[] raj){

        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin","C++", "COBOL", "C");

        listOfStrings.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
    }
}
