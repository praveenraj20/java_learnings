package hackerRank;

public class StringToken {
    public static void main(String[] args) {
        String string = "He is a very very good boy, isn't he?";

        string = string.trim();
        if (string.isEmpty()) {
            System.out.println(0);
            return;
        }
        String[] tokens = string.split("[^A-Za-z]+");

        System.out.println(tokens.length);
        for (String token : tokens) {
            System.out.println(token);
        }
    }
}
