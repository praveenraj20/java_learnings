package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinString {
    public  static void main(String[] args){
        List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
        String joinString = listOfStrings.stream()
                .collect(Collectors.joining(" ,", "\"[", "]\""));
        System.out.println(joinString);
    }
}
