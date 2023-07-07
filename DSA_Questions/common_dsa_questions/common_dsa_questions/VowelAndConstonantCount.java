package common_dsa_questions;

public class VowelAndConstonantCount {

	public static void main(String[] args) {

		String str = "ankush";

		int n = str.length();

		int v = 0, c = 0;
		for (int i = 0; i < n; i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				v++;
			}

			else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				c++;
			}
		}
		System.out.print(v + " ");
		System.out.print(c + " ");

	}

}
