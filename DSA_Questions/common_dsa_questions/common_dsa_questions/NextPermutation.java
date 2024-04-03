package common_dsa_questions;

import java.util.Arrays;

public class NextPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1, 2, 3};
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
	}

	private static void nextPermutation(int[] arr) {
		
		int k = arr.length - 2;
        while (k >= 0 && arr[k] >= arr[k + 1]) {
            k--;
        }

        if (k >= 0) {
            int l = arr.length - 1;
            while (l > k && arr[l] <= arr[k]) {
                l--;
            }
            swap(arr, k, l);
        }

        reverse(arr, k + 1, arr.length - 1);
	}

	public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

}
