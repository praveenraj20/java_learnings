package javaEightFeatures;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args){
        List<Integer> values = Arrays.asList(1,2,3,4,5);

        List<Integer> multipleOfFives = Arrays.asList(12,10,22,15,50,31,25,11);

        String S = "example";
//
//        System.out.println(values.stream().map(i->i*2).reduce(0,(i,j)->i+j));
//
//        System.out.println(values.stream().map(i->i*2).reduce(0,(i,j) -> Integer.sum(i,j)));;

        System.out.println(values.stream().map(i-> i*2).reduce(Integer::sum));

        System.out.println(multipleOfFives.stream().filter(i->i%5==0).reduce(Integer::sum));


        Map<Character,Long> charCount = S.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(c -> c,Collectors.counting()));

        charCount.forEach((ch,count) -> System.out.println(ch+": "+count));;


        // find odd and even no from the list

        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Map<Boolean, List<Integer>> map = num.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));

        List<Integer> even = map.get(true);
        List<Integer> odd = map.get(false);

        System.out.println("Even Numbers: "+ even);
        System.out.println("odd Numbers: "+ odd);

        //String Occurrence

        String input = "hello";

        Map<String, Long> ans = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("String Occurrence: "+ans);

        //String Duplicate
        ans.entrySet().stream().filter(entry -> entry.getValue() > 1).forEach(entry -> System.out.println("String Duplicate: "+entry.getKey()+": "+entry.getValue()));

        //String unique value
        Set<String> uni = ans.entrySet().stream().filter(x -> x.getValue() == 1).map(Map.Entry::getKey).collect(Collectors.toSet());
        System.out.println("String Unique Value: "+uni);

        // find first non repeat element in the string
        String unique = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(z -> z.getValue() == 1).findFirst().get().getKey();

        System.out.println("First Uniques: "+unique);


        //Second-Highest Number:
        int[] numbers = {11,23,56,7,12,35,76};
        Integer HighestNum = Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println("Second Highest Number: "+HighestNum);


        //find the longest String in the Array

        String[] strArray = {"Praveenraj","raj","Arun","Vigneshwaran"};
        String lngString = Arrays.stream(strArray).reduce((str1, str2) -> str1.length() > str2.length() ? str1 : str2).get();

        System.out.println("Longest String: "+lngString);

        //find the num start with 1
        List<String> fNum = Arrays.stream(numbers).boxed().map(s -> s + "")
                .filter(s -> s.startsWith("1")).toList();
        System.out.println("Print the Num Start with 1 from the given Array: "+fNum);

        //String join method

        List<String> nums = Arrays.asList("1","2","3","4","5","6");
        String result = String.join("-", nums);
        System.out.println("String Method to concatenate: "+result);


        //skip and limit method
        IntStream.rangeClosed(1,10).skip(1).limit(8).forEach(System.out::println);




    }
}
