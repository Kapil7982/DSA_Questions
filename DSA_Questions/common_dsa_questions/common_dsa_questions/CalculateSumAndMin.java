package common_dsa_questions;

import java.util.Arrays;
import java.util.stream.IntStream;

public class CalculateSumAndMin {

	public static void main(String[] args) {
		
		int[][] arr = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };
		
		calculateSumAndMin(arr);
		
	}

	private static void calculateSumAndMin(int[][] arr) {
		
		IntStream.range(0, arr.length)
		.forEach(i -> {
			
			int sum = Arrays.stream(arr[i]).sum();
			int min = Arrays.stream(arr[i]).min().orElse(Integer.MAX_VALUE);
			
			System.out.println("Sum of row " + i + " is " + sum);
			System.out.println("Minimum value of row " + i + " is " + min);
		});
	}

}
