package streams;

import java.util.Arrays;
public class ArraySumAvg {
    public static void main(String[] raj){

        int[] a =  new int[]{1,2,3,4,5,6,6,7,7,7,89,2,12};
        int sum = Arrays.stream(a).sum();
        double avg = Arrays.stream(a).average().getAsDouble();

        System.out.println("Sum : "+ sum+ "   Average :"+avg);
    }
}
