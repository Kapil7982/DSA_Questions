package common_dsa_questions;

public class NumberOfWaysProblemsReturns {

	public static void main(String[] args) {
		
		int n = 4;
		
		if(n == 0 || n == 1) 
        {
            System.out.println(1);
        } 
        else if(n == 2) 
        {
            System.out.println(2);
        }

        long[] arr = new long[n + 1];
        
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 2;

        for(int i=3; i<=n; i++) 
        {
            arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3];
        }

        System.out.println(arr[n]);

	}

}
