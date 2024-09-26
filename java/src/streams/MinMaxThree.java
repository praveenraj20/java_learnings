package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MinMaxThree {
    public static void main(String[] var){

        List<Integer> integerList = Arrays.asList(4,1,7,9,2,3,5,6,8,9,10);

        List<Integer> min = integerList.stream().sorted().limit(3).collect(Collectors.toList());
        List<Integer> max = integerList.stream().sorted(Comparator.reverseOrder()).distinct().limit(3).collect(Collectors.toList());

        System.out.print(min +" "+ max);
    }
}
