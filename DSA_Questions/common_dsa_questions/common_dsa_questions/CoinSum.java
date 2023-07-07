package common_dsa_questions;


public class CoinSum {

	public static void main(String[] args) {
		
		int[] arr = {3,5,2};
		
		int n = arr.length;
		
		
		coinSum(n,arr);
	}

	private static void coinSum(int n, int[] arr) {
		
        boolean[] sums = new boolean[100001];
        
        sums[0] = true;

        
        for(int i=0; i<n; i++) 
        {
            for(int j=100000-arr[i]; j>=0; j--) 
            {
                if(sums[j]) 
                {
                    sums[j + arr[i]] = true;
                }
            }
        }

       
        int count = 0;
        for(int i=1; i<=100000; i++) 
        {
            if(sums[i]) 
            {
                count++;
            }
        }
        System.out.println(count);
        
        for(int i=1; i<=100000; i++) 
        {
            if(sums[i]) 
            {
                System.out.print(i + " ");
            }
        }
	}

}
