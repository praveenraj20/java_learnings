package streams;

import java.util.Arrays;
import java.util.List;

public class MultiplesOfFive {
    public static void main (String[] arg){
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9,12,10,15,14);
        integerList.stream().filter(n -> n % 5 ==0).forEach(System.out::println);
    }
}
