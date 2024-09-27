package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseEachWord {
    public static void main(String[] lt){

        String str = "Java Concept Of The Day";

        String reversedStr = Arrays.stream(str.split(" "))
                        .map(word -> new StringBuffer(word).reverse())
                                .collect(Collectors.joining(""));

        System.out.println(reversedStr);
    }
}
