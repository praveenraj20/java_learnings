package streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Anagram {
    public static void main(String[] raj){

        String s1 = "SchoolMaster";
        String s2 = "TheClassRoom";

         s1 = Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
         s2 = Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());

        System.out.println(s1.equals(s2));
    }
}
