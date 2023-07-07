package common_dsa_questions;

import java.util.Arrays;

public class StockItUp {

	public static void main(String[] args) {
		
		int[] arr = {550, 240, 84, 159, 80, 160, 252};
		
		int[] stock = {0, 1, 1, 1, 0, 0, 1};
		
		long n = Arrays.stream(stock).filter(i -> i == 1).count();
		
		int sum=0;
		
		for(int i=0; i<stock.length; i++)
		{
			if(stock[i] == 1)
			{
				sum+= arr[i];
			}
		}
		System.out.println(sum*n);
	}
}
