package array;

public class ArraySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 67, 8, 9};
        int target = 8;
        int resultIndex = searchElement(arr, target);
        if (resultIndex != -1) {
            System.out.println("Element " + target + " found at index " + resultIndex);
        } else {
            System.out.println("Element " + target + " not found.");
        }
    }

    public static int searchElement(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }
}
