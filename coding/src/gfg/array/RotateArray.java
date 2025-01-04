package gfg.array;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int d = 2;

        thirdApproach(arr, d);
        for (int num : arr) {
            System.out.print(num);
        }
    }

    private static void rotateArray(int[] arr, int d) {
        int n = arr.length;

        for (int i = 0; i < d; i++) {
            int first = arr[0];
            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[n - 1] = first;
        }

    }

    private static void secondApproach(int[] arr, int d) {
        int n = arr.length;
        d %= n;
        int[] temp = new int[n];

        for (int i = 0; i < n - d; i++)
            temp[i] = arr[d + i];

        for (int i = 0; i < d; i++)
            temp[n - d + i] = arr[i];

        for (int i = 0; i < n; i++)
            arr[i] = temp[i];
    }

    private static void thirdApproach(int[] arr, int d) {
        int n = arr.length;
        d %= n;
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }
}
