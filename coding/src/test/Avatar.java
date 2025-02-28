package test;


import java.util.stream.Collectors;

public class Avatar {

    public static void main(String[] args) {
        String sr = "aabbbcc";
        String a = sr.replace("a", "");
        System.out.println(a);
        String collect = sr.chars().filter(ch -> ch != 'a').mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining());
        System.out.println(collect);
    }
}
