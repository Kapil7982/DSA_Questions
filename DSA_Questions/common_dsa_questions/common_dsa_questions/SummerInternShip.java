package common_dsa_questions;

public class SummerInternShip {

	public static void main(String[] args) {
		
		int[] arr= {5,5,5,10,20};
		
		int n = arr.length;
		
		if(summerInterShip(n, arr) > 0)
		{
			System.out.println("YES");
		}
        else
        {
        	System.out.println("NO");
        }
		
	}

	private static int summerInterShip(int n, int[] arr) {
		
        int count =0;
		
		int count1=0;
		
		for(int i=0; i<n; i++)
		{
			if(arr[i] == 5)
			{
				count++;
			}
			else if(arr[i]==10)
			{
				if(count>0)
				{
					count--;
					count1++;
				}
				else
				{
					return 0;
				}
			}
			else
			{
				if(count > 0 && count1 >0)
				{
					count--;
					count1--;
				}
				else if(count1>=3)
				{
					count -= 3;
				}
				else
				{
					return 0;
				}
			}
		}
		return 1;
		
	}
}
