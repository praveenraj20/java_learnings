package gfg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * DAY-3
 **/
public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        // Normal Approach
        reverseArrayApproachThree(array);
        for (int num : array) {
            System.out.print(" " + num);
        }

        // reverseArrayInbuiltMethod
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        reverseArrayInbuiltMethod(arr);
        System.out.println();

        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }


        // RecursiveFunction
        reverseArray(array);
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
    }


    public static void reverserArrayApproachOne(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
//        int j = n - 1;
        for (int i = 0; i <= n - 1; i++) {
            temp[i] = arr[n - i - 1];
//            j--;
        }
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
        // t.c = O(n)
        // s.c = O(n)
    }

    public static void reverseArrayApproachTwo(int[] arr) {
        int count = arr.length - 1;
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[count];
            arr[count] = temp;
            count--;
        }
    }

    public static void reverseArrayApproachThree(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void reverseArrayInbuiltMethod(List<Integer> arr) {
        Collections.reverse(arr);
    }

    public static void reverseArray(int[] arr) {
        int n = arr.length;
        reverseArrayRecursiveFunction(arr, 0, n - 1);
    }

    public static void reverseArrayRecursiveFunction(int[] arr, int l, int r) {
        if (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            reverseArrayRecursiveFunction(arr, l + 1, r - 1);
        } else {
            return;
        }

    }

}
