package common_dsa_questions;

public class FirstSumOfMultiples {

	public static void main(String[] args) {
		
		int x = 3;
		int k = 10;
		int y = 5;
		
		int sum =0;
		
		for(int i=1; i<=k; i++)
		{
			int num = x*i;
			
			if(num%y == 0)
			{
				sum += num;
			}
		}
		System.out.println(sum);
		
	}

	
}
