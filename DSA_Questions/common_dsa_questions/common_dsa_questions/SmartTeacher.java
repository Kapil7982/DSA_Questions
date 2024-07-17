package common_dsa_questions;

import java.util.Stack;

public class SmartTeacher {

	public static void main(String[] args) {

//		String str = "ab#c";
//		String str1 = "ad#c";

//		String str = "ab##";
//		String str1 = "c#d#";
	
		String str = "aab";
		String str1 = "aa#";

		int n = str.length();

		smartTeacher(n, str, str1);
	}

	private static void smartTeacher(int n, String str, String str1) {

		Stack<Character> bag = new Stack<>();

		for (int i = 0; i < n; i++) {
			if (str.charAt(i) != '#') {
				bag.push(str.charAt(i));

			} else {
				if (!bag.isEmpty()) {
					bag.pop();
				}
			}
		}

		String bagStr = bag.toString();
		bagStr = bagStr.replace(",", "");
		bagStr = bagStr.replace("[", "");
		bagStr = bagStr.replace("]", "");

		Stack<Character> tag = new Stack<>();
		for (int i = 0; i < n; i++) {
			if (str1.charAt(i) != '#') {
				tag.push(str1.charAt(i));
			} else {
				if (!tag.isEmpty()) {
					tag.pop();
				}
			}
		}

		String tagStr = tag.toString();
		tagStr = tagStr.replace(",", "");
		tagStr = tagStr.replace("[", "");
		tagStr = tagStr.replace("]", "");

		if (bagStr.equals(tagStr)) {
			System.out.println("CORRECT");
		} else {
			System.out.println("WRONG");
		}
	}
}
