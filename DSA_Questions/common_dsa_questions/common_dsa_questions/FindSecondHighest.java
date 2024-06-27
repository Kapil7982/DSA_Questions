package common_dsa_questions;

public class FindSecondHighest {

	public static void main(String[] args) {

		int[] arr = { 1, 4, 6, 7, -2, -1, 6, 9 };

		System.out.println(findSecondHighest(arr));
	}

	private static int findSecondHighest(int[] arr) {

		int max = Integer.MIN_VALUE;
		
		int secondMax = Integer.MIN_VALUE;
		
		for(int num : arr)
		{
			if(num > max)
			{
				secondMax = max;
				max = num;
			}
			else if(num > secondMax && num < max)
			{
				secondMax = num;
			}
		}
		
		if(secondMax == Integer.MIN_VALUE)
		{
			throw new IllegalArgumentException("No second highest element");
		}
		
		return secondMax;
	}

}
