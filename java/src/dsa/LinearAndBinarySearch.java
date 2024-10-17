package dsa;
public class LinearAndBinarySearch {
    public static void main(String[] arg) {
        int num[] = { 1,2,3,4,5,6,7,8,8,9};
        int target = 9;

        int result = linearSearch(num, target);
        int res = binarySearch(num,target);

        if (result == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at Index " + result);
    }

    public static int linearSearch(int[] num, int target) {
        int steps = 0;
        for (int i = 0; i < num.length; i++) {
            steps++;
            if (num[i] == target) {
                System.out.println("Steps taken by Linear Search: " + steps);
                return i;
            }

        }
        return -1;
    }

    public static int binarySearch(int[] num, int target) {

        int left = 0;
        int right = num.length;
        int steps = 0;

        while (left<=right){
            steps++;
            int mid = (left+right)/2;

            if(num[mid]==target){
                System.out.println("Steps taken by Binary Search: " + steps);
                return mid;
            }
            else if (num[mid]<target) {
                left = mid + 1;
            }
            else right = mid-1;
        }
        System.out.println("Steps taken by Binary Search: " + steps);
        return -1;
    }

//        if (left <= right) {
//            int mid = (left + right) / 2;
//            if (num[mid] == target) {
//                return mid;
//            } else if (num[mid] < target) {
//                return binarySearch(num, target, mid + 1, right);
//            } else right = mid - 1;
//            return binarySearch(num, target, mid - 1, right);
//        }
//        return -1;
//    }

}
