package common_dsa_questions;

import java.util.Stack;

public class BalancedParentheses {

	public static void main(String[] args) {
		
            
		String str = "({})[]";
		
		if(balancedParentheses(str)) {
            System.out.println("Balanced");
        } 
		else 
		{
            System.out.println("Not Balanced");
        }
            
        }

	private static boolean balancedParentheses(String str) {
		
		 Stack<Character> stack = new Stack<>();

	        for(char ch : str.toCharArray()) 
	        {
	            if(ch == '(' || ch == '{' || ch == '[') 
	            {
	                stack.push(ch);  
	            } 
	            else if(ch == ')' || ch == '}' || ch == ']') 
	            {
	                if(stack.isEmpty()) 
	                {
	                    return false;
	                } 
	                else if(ch == ')' && stack.peek() == '(' || ch == '}' && stack.peek() == '{' ||ch == ']' && stack.peek() == '[') 
	                {
	                    stack.pop();
	                }
	                else
	                {
	                    return false;
	                }
	            }
	        }

	        return stack.isEmpty();
		
	}

	
		
	}
        

	


