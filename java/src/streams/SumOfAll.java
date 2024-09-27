package streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumOfAll {
    public static void main(String[] raj){

        int n = 1234567891;

        Integer intObj = Stream.of(String.valueOf(n).split("")).
                collect(Collectors.summingInt(Integer::parseInt));
        System.out.println(intObj);
    }
}
