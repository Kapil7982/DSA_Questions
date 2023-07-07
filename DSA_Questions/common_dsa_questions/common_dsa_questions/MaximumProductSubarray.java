package common_dsa_questions;

public class MaximumProductSubarray {

	public static void main(String[] args) {
		
		int[] nums = {-1, 3, 2, -1, -2, 3, 0, -2};
		
		int n = nums.length;
		
		System.out.println(maximumProductSubarray(n,nums));

	}

	private static int maximumProductSubarray(int n, int[] nums) {
		// TODO Auto-generated method stub
		
		if(nums == null || nums.length == 0)
		{
			return 0;
		}
		
		int max=nums[0];
		
		int min = nums[0];
		
		int res = nums[0];
		
		for(int i=1; i<n; i++)
		{
			int max1 = Math.max(nums[i], Math.max(max * nums[i], min * nums[i]));
            int min1 = Math.min(nums[i], Math.min(max * nums[i], min * nums[i]));
            
            max = max1;
            min = min1;

            res = Math.max(res, max1);
		}
		
		return res;
	}

}
