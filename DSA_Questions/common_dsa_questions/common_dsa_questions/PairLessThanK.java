package common_dsa_questions;

public class PairLessThanK {

	public static void main(String[] args) {
		
		//int[] arr = {1,2,3,4,5};
		
		int[] arr = {30,10,20};
		
		
		int n = arr.length;
		
		//int k= 7;
		
		int k = 15;
		
		int r= -1;
		
		for(int i=0; i<n; i++)
		{
			for(int j=i+1; j<n; j++)
			{
				if(arr[i]+arr[j] < k)
				{
					r = Math.max(r, arr[i]+arr[j]);
				}
			}
		}
		System.out.println(r);
	}

}
