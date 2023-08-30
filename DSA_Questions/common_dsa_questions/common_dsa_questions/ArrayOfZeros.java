package common_dsa_questions;

public class ArrayOfZeros {

	public static void main(String[] args) {
		
//		int[] arr = {1,2};
//		
//		int n = arr.length;
		
        int[] arr = {2,2};
		
		int n = arr.length;
		
		if(arrayOfZeros(n,arr))
        {
            System.out.print("YES");
        }
        else
        {
            System.out.print("NO");
        }
	}

	private static boolean arrayOfZeros(int n, int[] arr) {
		
		if(n==1 && arr[0]==0)
        {
            return true;
        }
        else if(n==1)
        {
            return false;
        }
        
        for (int i=0; i<n-1; i++) 
        {
	        int min = Math.min(arr[i], arr[i + 1]);
	        
	        arr[i] -= min;
	        
	        arr[i + 1] -= min;
	        
	        if (arr[i] != 0)
	        {
	            return false;
	        }
        }
        
	    if (arr[n-1] !=0)
	    {
	        return false;
	    }
	
	    return true;
	}

}
