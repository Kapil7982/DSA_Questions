package common_dsa_questions;

public class TallestAround {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,1,4,5,2,3,6};
		
		int n = arr.length;
		
		int k = 3;
		
		String bag="";
		
	    for(int i=0; i<=n-k; i++) 
	    {
	        var max = arr[i];
	        
	        for(int j=1; j<k; j++) 
	        {
	            if(arr[i+j]>max)
	            {
	                max = arr[i+j];
	            }
	        }
	       bag+=(max + " ");
	    }
	    System.out.println(bag);;
	    
		
		
	}
}
