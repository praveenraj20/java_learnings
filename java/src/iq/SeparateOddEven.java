package iq;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SeparateOddEven {
    public  static void main(String[] args){
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Map<Boolean, List<Integer>> oddEven = integerList.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println("SeparateOddEven :"+oddEven);

    }

}
