package basicPrograms;

import java.util.stream.IntStream;
public class OddEven {
    public static void main(String[] args) {
        int num = 11;
        if (num % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd");
        }
        // java8

        boolean isEven = IntStream.of(num).allMatch(n -> n % 2 == 0);
        if (isEven) {
            System.out.println("even");
        } else System.out.println("odd");
    }
}
