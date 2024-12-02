package javaEightFeatures;

import java.util.Arrays;
import java.util.List;

public class ForEach {
    public static void main(String[] args){
        List<Integer> valuse = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

//        for (int i=0;i<valuse.size();i++){
//            System.out.println(valuse.get(i));
//        }
//        System.out.println("+++++++++Enhanced For Loop++++++++");
//        for( int i : valuse){
//            System.out.println(i);
//        }
        System.out.println("*************** For_Each and lambda Expression ***************");
        valuse.forEach(i -> System.out.println(i));

    }
}
