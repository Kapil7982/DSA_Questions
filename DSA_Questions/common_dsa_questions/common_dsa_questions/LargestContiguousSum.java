package common_dsa_questions;

public class LargestContiguousSum {

	public static void main(String[] args) {

		int[] arr = {4, -6, 2, 5};
		
		System.out.println(largestContiguousSum(arr));

	}

	private static int largestContiguousSum(int[] arr) {
		
		int max = arr[0];
        int sum = arr[0];
		
        for(int i=1; i<arr.length; i++) 
		{
            sum = Math.max(sum + arr[i], arr[i]);
            max = Math.max(max, sum);
        }
        return max;
	}

}
