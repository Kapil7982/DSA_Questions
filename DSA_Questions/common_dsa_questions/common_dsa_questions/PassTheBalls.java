package common_dsa_questions;

import java.util.Arrays;

public class PassTheBalls {

	public static void main(String[] args) {

		int[] arr = { 2, 3, 3, 2 };

		// int[] arr = {1,5,2};

		// int[] arr = {0,0};

		int n = arr.length;

		passTheBalls(n, arr);

	}

	private static void passTheBalls(int n, int[] arr) {

		int count = 0;

		for (int i = 0; i < n; i++) {
			if (arr[i] != 0) {
				count = 1;
			}
		}

		long max = -1;

		for (int i = 0; i < n; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		long sum = Arrays.stream(arr).sum();

		if (count == 0) {
			System.out.println(0);
		} else if (2 * max > sum) {
			System.out.println(2 * max - sum);
		} else {
			System.out.println(1);
		}

	}

}
