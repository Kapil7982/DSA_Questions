package common_dsa_questions;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {0,1,0,1};
		
		sortArray(arr);
		
		for(int num : arr)
		{
			System.out.print(num +" ");
		}
	}

	private static void sortArray(int[] arr) {
		// TODO Auto-generated method stub
		
		int left =0;
		int right = arr.length-1;
		
		while(left < right)
		{
			if(arr[left]==0)
			{
				left++;
			}
			if(arr[right]==1)
			{
				right--;
			}
			
			if(left< right)
			{
				arr[left++]=0;
				arr[right--]=1;
			}
		}
		
		
	}

}
