package common_dsa_questions;

public class PrimeLoopCheck {

	public static void main(String[] args) {
		
		int num = 5;
		
		for(int i=1; i<=num; i++)
		{
			if(isPrime(i))
				System.out.println(i);
			
			
		}
		
		

	}

	private static boolean isPrime(int num) {
		
		if(num == 0 || num ==1)
            return false;
		
		
		for(int i=2; i<num; i++)
		{
			if(num%i==0)
				return false;
		}
		return true;
	}

}
