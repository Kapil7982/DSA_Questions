package common_dsa_questions;

public class MaximumReturns {

	public static void main(String[] args) {
		
		long N = 4;
	    long K = 10;
	    long[] investmentOptions = {4, 8, 5, 3};
	    long[] returnsArray = {5, 12, 8, 1};
	    
	    System.out.println(maximumReturns(N, K, investmentOptions, returnsArray));
	}

	public static long maximumReturns (long N, long K, long[] investmentOptions, long[] returnsArray) {
       
		long[] dp = new long[(int) (K + 1)];
        
       
        for (int i = 0; i < N; i++) {
            
            for(int j=(int) K; j>= investmentOptions[i]; j--) 
            {
                
                dp[j] = Math.max(dp[j], dp[j - (int) investmentOptions[i]] + returnsArray[i]);
            }
        }
        
        return dp[(int) K];
    }
	
}
