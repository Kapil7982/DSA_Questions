package common_dsa_questions;

import java.util.Stack;

public class ReduceString {

	public static void main(String[] args) {
		
		String str = "aaabccddd";
		
		int n = str.length();
		
		Stack<Character> stack = new Stack<>();
		
        for(char c : str.toCharArray()) 
        {
            if(!stack.isEmpty() && stack.peek() == c) 
            {
                stack.pop(); 
            } 
            else 
            {
                stack.push(c); 
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        while(!stack.isEmpty()) 
        {
            sb.append(stack.pop()); 
        }
        
        String result = sb.reverse().toString();
        
        if(result.isEmpty()) 
        {
            System.out.println("Empty String");
        } 
        else 
        {
            System.out.println(result);
        }
	}
	}


