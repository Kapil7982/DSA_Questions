package common_dsa_questions;

public class PowerOfTwo {

	public static void main(String[] args) {
		
		//int n = 2;
		
		int n = 3;
		
		if (powerOfTwo(n)) 
		{
		    System.out.println("True");
		}
		else
		{
			System.out.println("False");
		} 

	}

	private static boolean powerOfTwo(int n) {
		
		int count = 0;
		while(n>0)
		{
			if(n%2==1)  
			{
			    count++;
			}
			n = n/2;
		}
		return count == 1;
	}

}
