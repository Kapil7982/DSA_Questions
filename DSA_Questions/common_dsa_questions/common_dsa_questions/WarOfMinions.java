package common_dsa_questions;

import java.util.Stack;

public class WarOfMinions {

	public static void main(String[] args) {

		//String str = "abbabaadcbbc";
		
		String str = "aa";

		int n = str.length();

		warOfMinions(n, str);
	}

	private static void warOfMinions(int n, String str) {

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < n; i++) {
			char ch = str.charAt(i);

			if (!stack.isEmpty() && stack.peek() == ch) {
				stack.pop();
			} else {
				stack.push(ch);
			}
		}

		if (stack.isEmpty()) {
			System.out.println("-1");
		} else {
			StringBuilder sb = new StringBuilder();

			while (!stack.isEmpty()) {
				sb.append(stack.pop());
			}
			System.out.println(sb.reverse().toString());
		}

	}

}
