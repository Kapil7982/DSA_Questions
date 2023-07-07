package common_dsa_questions;

import java.util.Arrays;
import java.util.Random;

public class FindNUniqueIntegerSumUpToZero {

	public static void main(String[] args) {
		
		//int n = 5;
		
		//int n = 3;
		
		int n =1;
		
		System.out.println(Arrays.toString(findNUniqueIntegerSumUpToZero(n)));

	}

	private static int[] findNUniqueIntegerSumUpToZero(int n) {
		
		int[] arr = new int[n];
		
		int sum=0;
		
		Random rand = new Random();
		
		for(int i=0; i<n-1; i++)
		{
			int num = rand.nextInt(100) +1;
			
			arr[i] = (rand.nextBoolean()) ? num : -num;
			
			sum+= arr[i];
		}
		
		arr[n -1] = -sum;
		
		return arr;
	}

}
