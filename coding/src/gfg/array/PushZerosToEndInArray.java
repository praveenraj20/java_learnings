package gfg.array;

/**
 * DAY-2
 **/

public class PushZerosToEndInArray {
    public static void main(String[] args) {
        int[] arr = {3, 1, 0, 5, 0, 0, 4};
        int n = arr.length;
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp[j++] = arr[i];
            }
        }
        while (j < n) {
            temp[j++] = 0;
        }
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
        for (int num : arr) {
            System.out.print(" " + num);
        }
        System.out.println();
        pushZerosToEndSecondApproach(arr);
        for (int num : arr) {
            System.out.print(" " + num);
        }
        System.out.println();
        pushZerosToEndThirdApproach(arr);
        for (int num : arr) {
            System.out.print(" " + num);
        }
    }

    static void pushZerosToEndSecondApproach(int[] arr) {
        System.out.println("Second Approach :");
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }
        while (count < arr.length) {
            arr[count++] = 0;
        }
        // t.c = O(2n) ~ O(n)
        // S.c  = O(1)
    }

    static void pushZerosToEndThirdApproach(int[] arr) {
        System.out.println("Third Approach: ");
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
    }
    // t.c = O(n)
    // S.c  = O(1)
}
