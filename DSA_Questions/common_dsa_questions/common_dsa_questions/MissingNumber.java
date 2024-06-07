package common_dsa_questions;

public class MissingNumber {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 4, 5, 6};
		
		int n = 6;
		
		System.out.println(findMissingNumber(arr,n));
	}

	private static int findMissingNumber(int[] arr, int n) {
		
		int expectedSum = n * (n + 1) / 2;

       
        int actualSum = 0;
        
        for(int num : arr) 
        {
            actualSum += num;
        }

        
        return expectedSum - actualSum;
	}

}
