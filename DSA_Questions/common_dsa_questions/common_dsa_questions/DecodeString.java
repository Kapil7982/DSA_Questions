package common_dsa_questions;

import java.util.Stack;

public class DecodeString {

	public static void main(String[] args) {
		
		String s1 = "3[a]2[bc]";
        System.out.println(decodeString(s1));

        String s2 = "3[a2[c]]";
        System.out.println(decodeString(s2));

        String s3 = "2[abc]3[cd]ef";
        System.out.println(decodeString(s3));
	}

	private static String decodeString(String s) {
		
		Stack<Integer> numStack = new Stack<>();
        Stack<StringBuilder> strStack = new Stack<>();
        StringBuilder currentString = new StringBuilder();
        int num = 0;

        for(char c : s.toCharArray()) 
        {
            if(Character.isDigit(c)) 
            {
                num = num * 10 + (c - '0');
            } 
            else if (c == '[') 
            {
                numStack.push(num);
                strStack.push(currentString);
                num = 0;
                currentString = new StringBuilder();
            } 
            else if (c == ']') 
            {
                StringBuilder temp = new StringBuilder();
                int repeatTimes = numStack.pop();
                for(int i = 0; i < repeatTimes; i++) 
                {
                    temp.append(currentString);
                }
                currentString = strStack.pop().append(temp);
            } 
            else 
            																					{
                currentString.append(c);
            }
        }

        return currentString.toString();
	}

}
