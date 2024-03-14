package common_dsa_questions;

public class CanJump {

	public static void main(String[] args) {
		
//		int[] arr = {2,3,1,1,4};
		
		int[] arr = {3,2,1,0,4};
		
		System.out.println(canJump(arr));

	}

	private static boolean canJump(int[] arr) {
		
		int reach =0;
		
		for(int i=0; i<arr.length; i++)
		{
			if(i > reach) 
				return false;
			reach = Math.max(reach, i+arr[i]);
		}
		
		return true;
		
	}

}
