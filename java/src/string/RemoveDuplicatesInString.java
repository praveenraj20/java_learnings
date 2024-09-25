package string;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RemoveDuplicatesInString {
    public static  void main(String[] args){
        List<String> listOfStrings = Arrays.asList("Apple","Orange","Grapes","Amla","Grapes");

        List<String> x = listOfStrings.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() == 1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(x);
//        List<String> nonDuplicate = listOfStrings.stream()
//                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
//                .entrySet().stream()
//                .filter(e -> e.getValue() == 1)
//                .map(Map.Entry::getKey)
//                .collect(Collectors.toList());
//        System.out.println(nonDuplicate);

    }
}
