package basicPrograms;

public class CountDigit {
    public static void main(String[] args) {
        int number = -1234;
        int count = 0;
        int posNum = Math.abs(number);

        while (posNum > 0) {
            int temp = posNum / 10;
            count++;
            posNum = temp;
        }
        System.out.println(count);
    }
}
