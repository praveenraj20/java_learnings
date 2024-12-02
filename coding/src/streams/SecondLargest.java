package streams;

import java.util.Arrays;
import java.util.Comparator;

public class SecondLargest {
    public static void main (String[] args){
        int  num [] =  {12,17,11,13,14,12,15,16,17,19,2,3};

        Integer res = Arrays.stream(num)
                .boxed()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("array must have 2 element"));

        System.out.println(res);

        int first = 0, second =0;
       for(int n : num){
           if (n>first){
               second=first;
               first=n;
           } else if (n>second && n!=first ) {
               second=n;
           }
       }
        System.out.println(second);
    }


}
