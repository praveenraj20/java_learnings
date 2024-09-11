package basicProgram;


public class ArrayAdd {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 4, 5, 6, 9};
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        System.out.println("Sum is :" + sum);

        int max = nums[0];
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] > max) {
                max = nums[j];
            }
        }
        System.out.println("Max is :" + max);
    }
}
