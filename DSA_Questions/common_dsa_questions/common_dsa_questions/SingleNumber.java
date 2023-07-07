package common_dsa_questions;

public class SingleNumber {

	public static void main(String[] args) {
		
		//int[] nums = {2,2,1};
		
		//int[] nums = {4,1,2,1,2};
		
		int[] nums = {1};
		
		System.out.println(singleNumber(nums));
	}

	private static int singleNumber(int[] nums) {
		
		int result = 0;
		
        for(int num : nums) 
        {
            result ^= num;
        }
        return result;
	}
}
