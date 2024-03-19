package common_dsa_questions;

public class CanPartition {

	public static void main(String[] args) {
		
		int[] arr = {1,5,11,5};
		
		System.out.println(canpartition(arr));
	}

	private static boolean canpartition(int[] arr) {
		
		int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }
        
        if (totalSum % 2 != 0) {
            return false;
        }
        
        int target = totalSum / 2;
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;
        
        for (int num : arr) {
            for (int i = target; i >= num; i--) {
                if (dp[i - num]) {
                    dp[i] = true;
                }
            }
        }
        
        return dp[target];
	}
}
