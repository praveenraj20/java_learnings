package iq;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareEvenNos {

        public static void main(String[] args) {
            List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 1);

            List<Integer> squaredEvens = listOfNumbers.stream()
                    .filter(num->num%2==0)
                    .map(num->num*num)
                    .distinct()
                    .collect(Collectors.toList());
            System.out.println(squaredEvens);

        }
}
