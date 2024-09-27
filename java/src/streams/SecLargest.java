package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecLargest {
    public static void main(String[] raj ){
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9,10,22);

        Integer SecLargest = integerList.stream()
                .sorted(Comparator.reverseOrder()).skip(1).findFirst().get();

        System.out.println(SecLargest);
    }
}
