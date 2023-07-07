package common_dsa_questions;

public class RotateTheArrayReturnsBack {

	public static void main(String[] args) {
		
		//int[] arr = {1,2};
		
		int[] arr = {1,2,3};
		
		int n = arr.length;
		
		int k = 1;
		
		//int k  = 2;
		
		String bag="";
	    k%=n;
	    for(int i=0; i<n; i++)
	    {
	        if(i<k)
	        {
	            bag += arr[n+i-k]+" ";
	        }
	        else 
	        {
	            bag+= arr[i-k]+" ";
	        }
	    }
	    System.out.println(bag);
	

	}

}
