package interviewqs;


import java.util.Scanner;

/**
 * There are n stairs, a person standing at the bottom wants to reach the top. The person can climb either 1 stair or 2 stairs at a time. How many distinct number of ways he/she person can reach the top.
 **/

public class ClimbingStairs {
    static int countWays(int n) {
        if (n <= 1) return 1;
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number of Stairs: ");
        int n = scanner.nextInt();
        System.out.println("Number of Ways: " + countWays(n));
        scanner.close();
    }

}
