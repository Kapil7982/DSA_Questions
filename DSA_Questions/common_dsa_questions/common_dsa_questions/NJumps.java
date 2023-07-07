package common_dsa_questions;

public class NJumps {

	public static void main(String[] args) {

		int[] arr = { 3, 6 };

		int[] brr = { 4, 5 };

		int x = 10;

		int n = arr.length;

		boolean flag = nJumps(n, x, arr, brr);
		System.out.println(flag ? "Yes" : "No");

	}

	private static boolean nJumps(int n, int x, int[] arr, int[] brr) {

		for (int i = 0; i < (1 << n); i++) {
			int count = 0;

			for (int j = 0; j < n; j++) {
				if (((i >> j) & 1) == 1) {
					count += arr[j];
				} else {
					count += brr[j];
				}
			}
			if (count == x) {
				return true;
			}
		}
		return false;

	}

}
