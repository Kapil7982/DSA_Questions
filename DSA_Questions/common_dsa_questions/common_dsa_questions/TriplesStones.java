package common_dsa_questions;

public class TriplesStones {

	public static void main(String[] args) {
		
		int[] arr = {3,2,5,7};
		
		int n = arr.length;
		
		int k = 42;
		
		int count = 0;
		 
        for(int i=0; i<n-2; i++)
        {
            for(int j=i+1; j<n-1; j++)
            {
                for(int m=j+1; m<n; m++)
                {
                    if(arr[i]*arr[j] * arr[m]<= k)
                    {
                        count++;
                    }
                }
            }
        }
 
        System.out.println(count);
	}
}
