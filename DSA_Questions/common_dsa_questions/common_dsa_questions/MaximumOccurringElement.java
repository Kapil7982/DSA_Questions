package common_dsa_questions;

public class MaximumOccurringElement {

	public static void main(String[] args) {
		
		int[] arr = {0, 2, 0, 6, 9};
		
		int n = arr.length;
		
		int max = 0, ans = 0;
        for (int i=0; i<n; i++)
        {
            int count = 0;
            for (int j=i; j<n; j++)
            {
                if (arr[j] == arr[i])
                {
                    count++;
                    
                }
                
            }   
            if (count > max)
            {
               max = count; 
               ans = arr[i];
                
            }
            
        }
        System.out.println(ans);


	}

}
