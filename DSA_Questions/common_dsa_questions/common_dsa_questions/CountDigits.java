package common_dsa_questions;

public class CountDigits {

	public static void main(String[] args) {
		
		int[] arr = {0, 1, 0, 1, 1, 1, 0, 2, 2, 0 };
		
		int n = arr.length;
		
		int count=0 , count1=0, count2=0;
		
	    for(var i=0; i<n; i++)
	    {
	        if(arr[i]==0)
	        {
	            count++;
	        }
	        if(arr[i]==1)
	        {
	            count1++;
	        }
	        if(arr[i]==2)
	        {
	            count2++;
	        }
	    }
	    System.out.print(count+" ");
	    System.out.print(count1+" ");
	    System.out.print(count2);
	}
}
