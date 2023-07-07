package common_dsa_questions;

public class DivisibleByKII {

	public static void main(String[] args) {
	
		int num = 7;
		
		int k = 2;
		
		int sum =0;
		
		for(int i=1; i<=num; i++)
		{
			if(i%k == 0)
			{
				sum += i;
			}
		}
		System.out.println(sum);
	}

}
