package common_dsa_questions;

public class BestTimeToBuyAndSellStocks {

	public static void main(String[] args) {
		
		int[] prices = {6, 1, 4, 2, 5, 3};
		
		int n = prices.length;
		
		System.out.println(BestTimeToBuyAndSellStocks(n,prices));

	}

	private static int BestTimeToBuyAndSellStocks(int n, int[] prices) {
		
		int max=0;
		
		int min = Integer.MAX_VALUE;
		
		for(int i=0; i<n; i++)
		{
			if(prices[i] < min)
			{
				min = prices[i];
			}
			else if(prices[i] - min > max)
			{
				max = prices[i] - min;
			}
		}
		
		return max;
		
	}

}
