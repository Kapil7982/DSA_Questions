package common_dsa_questions;

public class EvenSumInColumns {

	public static void main(String[] args) {
	
		int[][] arr = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };

		int n = arr.length;
        int m = arr[0].length;
        
        for(int i=0; i<m; i++)
        {
           int sum =0;
            for(int j=0; j<n; j++)
            {  
                if(arr[j][i]%2==0)
                {
                     sum = sum + arr[j][i];
                }
               
              
            }  
            System.out.println(sum);
        } 
	}

}
