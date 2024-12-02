package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {
    public static void  main(String[] a){
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9,11);
        int max = integerList.stream().max(Comparator.naturalOrder()).get();
        int min = integerList.stream().min(Comparator.naturalOrder()).get();

        System.out.println("Minimum value :"+min+ " Maximum value :"+max);
    }
}
