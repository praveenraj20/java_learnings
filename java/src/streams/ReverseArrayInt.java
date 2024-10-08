package streams;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseArrayInt{
    public static void main(String[] lt){
        int[] array = new int[] {5, 1, 7, 3, 9, 6};
        int[] reversedArray = IntStream.rangeClosed(1, array.length).map(i -> array[array.length-i]).toArray();
        System.out.println(Arrays.toString(reversedArray));

    }
}
