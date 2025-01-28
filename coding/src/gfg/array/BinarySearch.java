package gfg.array;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 4};
        int k = 4;
        System.out.println(findPosition(arr, k));
    }

    public static int findPosition(int[] arr, int k) {
        int left = 0;
        int right = arr.length;
        int result = -1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == k) {
                result = k;
                right = mid - 1;
            } else if (arr[mid] < k) {
                left = mid + 1;
            } else
                right = mid - 1;
        }
        return result;
    }
}
