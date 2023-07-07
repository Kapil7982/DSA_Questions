package common_dsa_questions;


public class IntersectionOfArray {

	public static void main(String[] args) {
		
		int[] arr = {4,5,7};

		int[] arr1 = {9,2,5};
		
		int n = arr.length;
		
		for(int i=0; i<n; i++)
	    {
	        for(int j=0; j<n; j++)
	        {
	            if(arr[i]== arr1[j])
	            {
	                System.out.println(arr[i]);;
	                break;
	            }
	           
	        }
	    }
	}

}
