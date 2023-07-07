package common_dsa_questions;

public class LittleAdamAndSums {

	public static void main(String[] args) {

		// int[] arr = { 1, 2, 3 };

		int[] arr = { 2, 1, 3, 1 };

		int n = arr.length;

		littleAdamAndSums(n, arr);
	}

	private static void littleAdamAndSums(int n, int[] arr) {

		int[] ps = new int[n];

		int[] ss = new int[n];

		ps[0] = arr[0];

		for (int i = 1; i < n; i++) {
			ps[i] = ps[i - 1] + arr[i];
		}

		ss[n - 1] = arr[n - 1];

		for (int i = n - 2; i >= 0; i--) {
			ss[i] = ss[i + 1] + arr[i];
		}

		int min = Integer.MAX_VALUE;

		int minc = -1;

		for (int i = 0; i < n; i++) {
			int sum = ps[i] + ss[i];

			if (sum < min) {
				min = sum;
				minc = i;
			}
		}
		System.out.println(minc + 1);

	}

}
