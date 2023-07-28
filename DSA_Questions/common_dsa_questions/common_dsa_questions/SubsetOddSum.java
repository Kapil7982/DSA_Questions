package common_dsa_questions;

public class SubsetOddSum {

	public static void main(String[] args) {
		
//		int[] arr = {4,3,2,1};
		
		int[] arr = {2,3};
		
		int n = arr.length;
		
        int count=0;
        
        for(int i=1; i<(1<<n); i++)
        {
            int sum=0;
            
            for(int j=0; j<n; j++)
            {
                if((i & (1<<j)) !=0)
                {
                    sum+= arr[j];
                }
            }
            
            if(sum %2 ==1)
            {
               count++;
            }
        }
        
        
        System.out.println(count);

	}

}
