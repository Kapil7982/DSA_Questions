package common_dsa_questions;

public class MissingInteger {

	public static void main(String[] args) {
		
		int[] arr = {4, 5, 1, 3};
		
		int n = arr.length;
        int sum = ((n+1)*(n+2))/2;
        for(int i=0; i<n; i++)
        {
            sum-= arr[i];
        }
        System.out.println(sum);
	}

}
