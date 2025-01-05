package basicPrograms;

public class Palindrome {
    public static void main(String[] args) {
        int num = 1112;
        int n = num;
        int rev = 0;
        while (num != 0) {
            int last = num % 10;
            rev = (rev * 10) + last;
            num = num / 10;
        }
        if (rev == n) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
