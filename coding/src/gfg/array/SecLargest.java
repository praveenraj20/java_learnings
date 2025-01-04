package gfg.array;

import java.util.Arrays;

/**
 * DAY-1
 **/
public class SecLargest {
    public static void main(String[] args) {
        int[] arr = {40, 76, 40, 76, 45, 43, 23, 9, 67};
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - 1; j++) {
                if (arr[i] < arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        for (int k = 0; k < length; k++) {
            System.out.println(arr[k]);
        }
        System.out.println("My Approach: " + arr[length - 2]);

        System.out.println("secLargestNoApproachOne: " + secLargestNoApproachOne(arr));

        System.out.println("secLargestNoApproachTwo: " + secLargestNoApproachTwo(arr));

        System.out.println("secLargestNoApproachThree: " + secLargestNoApproachThree(arr));
    }

    static int secLargestNoApproachOne(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] != arr[n - 1]) {
                return arr[i];
            }
        }
        return -1;
        // t.c = O(nlogn)
        // s.c = O(1);
    }

    static int secLargestNoApproachTwo(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int largest = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] > secLargest && arr[i] != largest) {
                secLargest = arr[i];
            }
        }
        return secLargest;
        // t.c = O(2n)
        // s.c =O(1)
    }

    static int secLargestNoApproachThree(int[] arr) {
        int n = arr.length;
        int largest = -1;
        int secLargest = -1;

        if (n < 2) {
            return -1;
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secLargest && arr[i] < largest) {
                secLargest = arr[i];
            }
        }
        return secLargest;
        // t.c = O(n)
        // s.c = O(1)
    }
}

