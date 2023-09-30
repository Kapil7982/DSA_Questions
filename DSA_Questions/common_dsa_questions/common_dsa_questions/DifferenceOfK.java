package common_dsa_questions;

public class DifferenceOfK {

	public static void main(String[] args) {
		
		
//		int[] arr = {1, 2, 3, 4, 5};
//		
//		int n = arr.length;
//		
//		int k = 3;
		
		
		int[] arr = {1, 2, 3, 4, 5};
		int n = arr.length;
		int k = 8;
		
		System.out.println(differenceOfK(n,k,arr));

	}

	private static String differenceOfK(int n, int k, int[] arr) {
		
        int r =0;
		
		int l = 0;
		
		while(r<n && l<n)
		{
			int temp = arr[l]-arr[r];
			
			if(temp ==k && r!=l)
			{
				return "Yes";
			}
			if(temp<k)
			{
				l++;
			}
			else
			{
				r++;
			}
		}
		return "No";
	}

}
