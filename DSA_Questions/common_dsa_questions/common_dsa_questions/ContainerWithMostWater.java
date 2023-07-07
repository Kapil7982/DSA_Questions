package common_dsa_questions;

public class ContainerWithMostWater {

	public static void main(String[] args) {
		
		int[] arr = {1, 8 ,6, 2, 5, 4, 8, 3, 7};
		
		int n = arr.length;
		
		System.out.println(containerWithMostWater(n,arr));

	}

	private static int containerWithMostWater(int n, int[] arr) {
		
		int l =0;
		
		int r =n-1;
		
		int max=0;
		
		while(l<r)
		{
			max= Math.max(max, Math.min(arr[l], arr[r])* (r -l));
			
			if(arr[l] < arr[r])
			{
				l++;
			}
			else
			{
				r--;
			}
		}
		
		return max;
	}

}
