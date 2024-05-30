package common_dsa_questions;

public class SortColors {

	public static void main(String[] args) {

		int[] nums = { 2, 0, 2, 1, 1, 0 };

		sortColors(nums);
	}

	public static void sortColors(int[] nums) {

		int low = 0;
		int mid = 0;
		int high = nums.length - 1;

		while (mid <= high) {
			switch (nums[mid]) {
			case 0:
				swap(nums, low, mid);
				low++;
				mid++;
				break;
			case 1:
				mid++;
				break;
			case 2:
				swap(nums, mid, high);
				high--;
				break;
			}
		}
		
		for(int i = 0; i < nums.length; i++) {
		    System.out.print(nums[i] + " ");
		}
		System.out.println();

	}

	public static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}
