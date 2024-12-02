package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElementInTwoArray {
    public static void main(String[] lt){
        int[] a  = new int[]{1,2,3,4,77,45,56,7,12};
        int[] b = new int[]{99,88,77,66,1,23,11,12};

        List<Integer> commonElement = Arrays.stream(a).filter(x -> Arrays.stream(b).anyMatch(y -> y == x)).boxed().collect(Collectors.toList());
        System.out.println(commonElement);

        List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);
        List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);

        List<Integer> cmnElement = list1.stream().filter(list2::contains).collect(Collectors.toList());

        System.out.println(cmnElement);
    }
}
