package common_dsa_questions;

public class IsItPowerOfTwo {

	public static void main(String[] args) {
		
		//int n = 1;
		
		//int n = 2;
		
		int n = 100;
		
		if(isItPowerOfTwo(n))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}

	}

	private static boolean isItPowerOfTwo(int n) {
		
		int count=0;
		
		while(n>0)
		{
			if(n%2==1)
			{
				count++;
			}
			n = n/2;
		}
		return count==1;
	}

}
