package gfg;

/**
 * DAY-1
 **/
public class SecLargest {
    public static void main(String[] args) {
        int num[] = {18, 75, 45, 30, 29, 11};
        int length = num.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - 1; j++) {
                if (num[i] < num[j]) {
                    int tmp = num[i];
                    num[i] = num[j];
                    num[j] = tmp;
                }
            }
        }
        for (int k = 0; k < length; k++) {
            System.out.println(num[k]);
        }
        System.out.println("Second Largest number is :" + num[length - 2]);
    }
}
