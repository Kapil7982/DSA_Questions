package common_dsa_questions;

public class TwoSortedArrays {

	public static void main(String[] args) {
		
		
		int[] arr = {1, 2, 2, 3, 4, 5};
		
		int[] arr1 = {4, 4, 3, 2, 1, 1};
		
		var l=0; 
	    var r=arr1.length-1;
	    var count=0;
	    while(l<arr.length && r>=0)
	    {
	        if(arr[l]==arr1[r])
	        {
	            count++;
	            l++;
	            r--;
	        } 
	        else if(arr[l]<arr1[r])
	        {
	            l++;
	        }
	        else 
	        {
	            r--;
	        }
	    }
	    System.out.println(count);

	}

}
