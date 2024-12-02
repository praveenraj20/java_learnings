package dsa;

public class QuickSort {

    /**
     * Sorts the array using the Quick Sort algorithm.
     * This method recursively partitions the array around a pivot element and sorts the two sub-arrays.
     *
     * @param arr  the array to be sorted
     * @param low  the starting index of the sub-array to be sorted
     * @param high the ending index of the sub-array to be sorted
     */
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {

            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);                    //recursion take place here
            quickSort(arr, pi + 1, high);
        }
    }

    /**
     * Partitions the array around a pivot element.
     * All elements smaller than the pivot are moved to the left, and all elements
     * larger than the pivot are moved to the right.
     *
     * @return the index of the pivot element after partitioning
     */
    public static int partition(int[] arr, int low, int high) {      // partition
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void main(String[] lt) {
        int[] arr = {2, 6, 1, 9, 3, 5, 4};

        quickSort(arr, 0, arr.length - 1);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
