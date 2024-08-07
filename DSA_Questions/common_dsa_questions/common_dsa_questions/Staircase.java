package common_dsa_questions;

public class Staircase {

	public static void main(String[] args) {
		
		int n = 3;
		
		System.out.println(countWays(n));
		
	}

	private static int countWays(int n) {
		
		if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
	}

}
