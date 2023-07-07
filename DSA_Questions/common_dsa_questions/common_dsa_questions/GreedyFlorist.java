package common_dsa_questions;

import java.util.Arrays;

public class GreedyFlorist {

	public static void main(String[] args) {
		
		int[] arr = {1, 3, 5, 7, 9};
		
		int k = 3;
		 
		int n = arr.length;
		
		Arrays.sort(arr); 

		int sum = 0;
		int multiplier = 1;
        int count = 0;
        for (int i = n - 1; i >= 0; i--) {
            sum += arr[i] * multiplier;
            count++;
            if (count % k == 0) {
                multiplier++;
            }
        }
        System.out.println(sum);
    
	}

}
