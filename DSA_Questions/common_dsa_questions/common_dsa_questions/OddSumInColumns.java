package common_dsa_questions;

public class OddSumInColumns {

	public static void main(String[] args) {
		
		int n = 3;
		int m = 3;
		
		int[][] arr = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
			
		};
		
		oddSumInColumns(n,m,arr);
	}

	private static void oddSumInColumns(int n, int m, int[][] arr) 
	{
		for(int i=0; i<m; i++)
	    {
	         int sum =0;
	        for(int j=0; j<n; j++)
	        {
	            if(arr[j][i]%2==1)
	            {
	                sum+= arr[j][i];
	                
	            }
	            
	        }
	        System.out.println(sum);
		
	}

}
}
