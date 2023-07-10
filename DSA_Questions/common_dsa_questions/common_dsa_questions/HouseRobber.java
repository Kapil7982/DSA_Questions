package common_dsa_questions;

public class HouseRobber {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,1};
		
		int n = arr.length;
		
		System.out.println(houseRobber(n,arr));

	}

	private static int houseRobber(int n, int[] arr) {
		
		if(n == 0) 
        {
            return 0;
        }

        if(n == 1) 
        {
            return arr[0];
        }

        
        int[] dp = new int[n];

        
        dp[0] = arr[0];
        
        dp[1] = Math.max(arr[0], arr[1]);

        
        for(int i=2; i<n; i++) 
        {
            
            dp[i] = Math.max(arr[i] + dp[i - 2], dp[i - 1]);
        }

        
        return dp[n - 1];
	}

}
