package basicPrograms;

public class Pattern {
    public static void main(String[] args) {
        int l = 5;

        for (int i = 0; i <= l; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int k = l; k >= 1; k--) {
            for (int m = 0; m < k; m++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
