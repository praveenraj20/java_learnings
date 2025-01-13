package gfg.array;


import java.util.ArrayList;

public class IndexOfSubArraySum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};
        int target = 5;
        ArrayList<Integer> result = subArraySum(arr, target);
        System.out.println(result);

    }

    static ArrayList<Integer> subArraySum(int[] arr, int target) {
        ArrayList<Integer> ans = new ArrayList<>();

        int n = arr.length;
        int i = 0, j = 1;

        int sum = arr[i];

        while (i < n) {
            if (sum == target) {
                ans.add(i + 1);
                ans.add(j);
                return ans;
            }
            if (sum < target && j < n) {
                sum += arr[j];
                j++;
            } else {
                sum -= arr[i];
                i++;
            }
        }

        ans.add(-1);
        return ans;
    }
}