package gfg.array;

public class MissingNum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        int n = arr.length + 1;
        int missNum = findMissingNum(arr, n);
        System.out.println(missNum);

    }

    private static int findMissingNum(int[] arr, int n) {
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
}
