package basicPrograms;

public class GCD {
    public static int findGCCD(int a, int b) {
        int gcd = 0;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        gcd = a;
        System.out.println(gcd);
        return gcd;
    }

    public static void main(String[] args) {
        int x = 12, y = 24;
        findGCCD(x, y);
    }
}
