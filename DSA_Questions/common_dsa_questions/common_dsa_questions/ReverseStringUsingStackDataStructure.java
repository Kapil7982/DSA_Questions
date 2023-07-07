package common_dsa_questions;

import java.util.Stack;

public class ReverseStringUsingStackDataStructure {

	public static void main(String[] args) {
		
		String str = "Global Warming";
		
		System.out.println(reverseStringUsingStackDataStructure(str));
		
	}

	private static String reverseStringUsingStackDataStructure(String str) {
		
		Stack<Character> stack = new Stack<>();

        for(char ch : str.toCharArray()) 
        {
            stack.push(ch);
        }

        StringBuilder sb = new StringBuilder();

        while(!stack.isEmpty()) 
        {
            sb.append(stack.pop());
        }

        return sb.toString();
		
	}

}
