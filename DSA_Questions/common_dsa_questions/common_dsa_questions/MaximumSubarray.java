package common_dsa_questions;

public class MaximumSubarray {

	public static void main(String[] args) {
		
		int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums1));
        
        int[] nums2 = {1};
        System.out.println(maxSubArray(nums2));
        
        int[] nums3 = {5, 4, -1, 7, 8};
        System.out.println(maxSubArray(nums3));

	}

	private static int maxSubArray(int[] nums1) {
		
		int maxSum = nums1[0];
		
		int currentSum = nums1[0];
		
		for(int i=1; i<nums1.length; i++)
		{
			currentSum = Math.max(nums1[i], currentSum + nums1[i]);
			maxSum = Math.max(maxSum, currentSum);
		}
		
		
		return maxSum;
	}

}
