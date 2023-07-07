package common_dsa_questions;

import java.util.Arrays;

public class MeanMedianMode {

	public static void main(String[] args) {
		
		//int[] arr = {4, 8, 7, 6, 4, 2, 4, 4, 1, 2};
				
		int[] arr = {4, 4, 4, 2, 2, 2};
		
		int n = arr.length;
		
	    meanMedianMode(n,arr);

	}

	private static void meanMedianMode(int n, int[] arr) {
		
		Arrays.sort(arr);
		
		double sum=0;
		
		for(int i=0; i<n; i++)
		{
			sum+= arr[i];
		}
		
		int mean = (int)Math.floor(sum/n);
		
		System.out.print(mean+ " ");
		
		int median = arr[n/2];
		
		if(n%2 == 0)
		{
			median  = (arr[n/2-1] + arr[n/2]) /2;
		}
		System.out.print(median +" ");
		
		int mode = arr[0];
		
		int max = 1;
		
		int count=1;
		
		for(int i=1; i<n; i++)
		{
			if(arr[i] == arr[i-1])
			{
				count++;
			}
			else
			{
				count=1;
			}
			if(count > max)
			{
				max = count;
				mode = arr[i];
			}
		}
		
		System.out.println(mode);
	}

}
