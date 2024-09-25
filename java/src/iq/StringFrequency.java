package iq;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringFrequency {
    public static void main(String[] args){
        List<String> strings = Arrays.asList("Arun","Anu","Arul","Anbu","Asoke","Anu","Arun");
        Map<String, Long> stringFrequency = strings.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(stringFrequency);
    }
}
