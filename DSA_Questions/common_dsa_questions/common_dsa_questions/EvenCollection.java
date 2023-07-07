package common_dsa_questions;

public class EvenCollection {

	public static void main(String[] args) {
		
		int max = 19;
		
		int min= 13;
		
		int sum=0;
		
		for(int i=min; i<=max; i++)
		{
			if(i%2==0)
			{
				sum+= i;
			}
		}
		System.out.println(sum);
	}

}
	