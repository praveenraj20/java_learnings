package gfg.array;

public class MinMaxInArray {
    public static void main(String[] args) {
        int[] arr = {4, 9, 5, 3, 2};
        int min = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                min = arr[i + 1];
            }
        }
        System.out.println(min);
    }
}
