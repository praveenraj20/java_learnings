package gfg.array;

public class ThirdLargest {
    public static void main(String[] args) {
        int[] arr = {7, 5, 2, 3, 4, 9, 11, 11, 11};
        int thirdLargestNumber = findThirdLargestNum(arr);
        System.out.println(thirdLargestNumber);

    }

    private static int findThirdLargestNum(int[] arr) {
        int n = arr.length;
        int largest = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;

        if (n < 3) {
            return -1;
        }
        for (int num : arr) {
            if (num > largest) {
                thirdLargest = secLargest;
                secLargest = largest;
                largest = num;
            } else if (num > secLargest && num < largest) {
                thirdLargest = secLargest;
                secLargest = num;
            } else if (num > thirdLargest && num < secLargest) {
                thirdLargest = num;
            }
        }
        return thirdLargest == Integer.MIN_VALUE ? -1 : thirdLargest;
    }
}
