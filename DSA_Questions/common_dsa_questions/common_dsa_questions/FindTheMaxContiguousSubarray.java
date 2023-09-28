package common_dsa_questions;

public class FindTheMaxContiguousSubarray {

	public static void main(String[] args) {
		
		
		
//		int[] arr = {1, 2, 3};
//		
//		int n = arr.length;
		
//		int[] arr = {-1, -1, 0, 1};
//		
//		int n = arr.length;
//		
		int[] arr = {2, -1, 2};
		
		int n = arr.length;
		
		System.out.println(findTheMaxContiguousSubarray(n,arr));
	}

	private static int findTheMaxContiguousSubarray(int n, int[] arr) {
		
        int sum = arr[0];
        
        int max = 0;
        
        for(int i=0; i<n; i++) 
        {
            max += arr[i];
            sum = Math.max(max, sum);
    
            
            max = Math.max(max, 0);
        }
    
       
        return sum;
	}

}
