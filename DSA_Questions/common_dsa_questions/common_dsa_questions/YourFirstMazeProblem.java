package common_dsa_questions;

public class YourFirstMazeProblem {

	public static void main(String[] args) {

		String str = "LLRDDR";

		int n = str.length();

		int x = 0;

		int y = 0;

		for (int i = 0; i < n; i++) {
			char c = str.charAt(i);
			switch (c) {
			case 'L':
				x = x - 1;
				break;

			case 'D':
				y = y - 1;
				break;

			case 'R':
				x = x + 1;
				break;

			case 'U':
				y = y + 1;
				break;

			default:
				break;
			}
		}
		System.out.println(x +" "+y);
	}

}
