package interviewqs;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayComparison {
    public static void main (String[] args){
        int[] a = new int[]{3,1,6,4,9};
        int[] b = new int[]{7,8,2,5,10};

        boolean areEqual = IntStream.range(0, a.length).allMatch(i -> a[i] == b[i]);

        boolean areLengthsEqual = Stream.of(a, b)
                .mapToInt(arr -> arr.length)
                .distinct()
                .count() == 1;

        System.out.println(areEqual);
        System.out.println(areLengthsEqual);

    }
}
