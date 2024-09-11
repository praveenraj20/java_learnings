package basicProgram;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class StringOccurence {
    public static void main (String[] args){

        String input = "hello";
        Map<String, Long> result = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(result);

        //dublicates
        char[] ch = input.toCharArray();
        for(int i =0; i<input.length();i++){
            for(int j=i+1;j<input.length();j++){
                if (ch[i]==ch[j]){
                    System.out.println(ch[i]);
                }
            }
        }
    }
}
