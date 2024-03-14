package common_dsa_questions;

import java.util.Arrays;

public class Candy {

	public static void main(String[] args) {
		
		int[] ratings =  {1,2,2}; //{1,0,2};
		
		 int n = ratings.length;
		 
		 System.out.println(candy(ratings, n));

	}

	private static int candy(int[] ratings, int n) {
		
		int[] candies = new int[n];

        Arrays.fill(candies, 1);

        for(int i=1; i<n; i++)
        {
            if(ratings[i] > ratings[i-1])
            {
                candies[i] = candies[i-1]+1;
            }
        }

        for(int i=n-2; i>=0; i--)
        {
            if(ratings[i] > ratings[i+1])
            {
                candies[i] = Math.max(candies[i],candies[i+1]+1);
            }
        }

        int totalCandies =0;
        for(int candy : candies)
        {
            totalCandies+= candy;
        }

        return totalCandies;
	}

}
