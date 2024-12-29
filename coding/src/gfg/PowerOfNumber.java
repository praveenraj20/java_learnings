package gfg;

public class PowerOfNumber {
    public static void main(String[] args) {
        int number = 3;
        int pwr = 4;
        int n = number;
        int temp;
        for (int i = 1; i < pwr; i++) {
            temp = n * number;
            n = temp;
        }
        System.out.println(n);
        powerOfNumberApproachTwo(number, pwr);
    }

    private static void powerOfNumberApproachTwo(int number, int pwr) {
        int result = 1;
        for (int i = 0; i < pwr; i++) {
            result *= number;
        }
        System.out.println(result);
    }
}
