package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SingleSortArray {
    public static void main(String[] args){

        int[] a = new int[]{3,1,6,4,9};
        int[] b = new int[]{7,8,2,5,10};

        List<Integer> sortedList = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted()
                                        .boxed().collect(Collectors.toList());

        int[] c = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();

        System.out.println("SortedArray :" +Arrays.toString(c));

        System.out.println("sortedList :"+sortedList);
    }
}
