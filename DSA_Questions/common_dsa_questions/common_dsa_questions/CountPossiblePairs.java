package common_dsa_questions;

public class CountPossiblePairs {

	public static void main(String[] args) {

		int n = 9;

		int m = 3;

		int ans = 0;

		for (int i = 0; i <= n; i++) 
		{
			for (int j = 0; j <= n; j++) 
			{
				if ((int) Math.pow(i, 2) + j == n && (int) Math.pow(j, 2) + i == m) {
					ans++;
				}

			}

		}
		System.out.println(ans);
	}

}
