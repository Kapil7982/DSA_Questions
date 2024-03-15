package common_dsa_questions;

public class Prime {

	public static void main(String[] args) {
		
		int prime = sumOfPrime(1, 100);
		
		System.out.println(prime);
	}

	private static int sumOfPrime(int i, int j) {
		
		int sum=0;
		
		for(int k=i; k<=j; k++)
		{
			if(isPrime(k))
			sum+= k;
		}
		
		return sum;
	}
	
	public static boolean isPrime(int n)
	{
		if(n <=1)
		{
			return false;
		}
		
		for(int i=2; i<=Math.sqrt(n); i++)
		{
			if(n % i ==0)
			{
				return false;
			}
		}
		return true;
	}
}
