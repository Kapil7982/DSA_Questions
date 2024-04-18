package common_dsa_questions;

public class PowerOfThree {

	public static void main(String[] args) {
		
		//int n = 27;
		int n = 10;
		
	   System.out.println(powerOfThree(n));
	}

	private static boolean powerOfThree(int n) {
		
		if(n <= 0)
		{
		  return false;
		}
		
		while(n%3 ==0)
		{
			n/=3;
		}
		
		return n == 1;
	}
}
