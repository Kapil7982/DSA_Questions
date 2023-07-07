package common_dsa_questions;

public class CheckIfSortedAndRotatedUsingBinarySearch {

	public static void main(String[] args) {
		
		int[] arr = {3,4,7,9,1,2};
		
		int n = arr.length;
		
		System.out.println(checkIfSortedAndRotatedUsingBinarySearch(n,arr));
	}

	private static String checkIfSortedAndRotatedUsingBinarySearch(int n, int[] arr) {
		
		int count = 0;
	    
        for(int i=0; i<n-1; i++)
        {
            if(arr[i]>arr[i+1])
            {
                count++;
            }
        }
    
        if(count == 0) 
        {
            return "YES";
        }
        
        if(count == 1 && arr[0] >= arr[n-1])   
        {
            return "YES";
        }
        
       
        return "NO";
	}

}
