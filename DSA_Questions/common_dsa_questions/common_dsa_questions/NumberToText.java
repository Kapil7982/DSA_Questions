package common_dsa_questions;

import java.util.*;

public class NumberToText {
	
	private static final String[] alpha = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

	public static void main(String[] args) {
		
		String str = "23";
		
		List<String> combinations = numberToText(str);
        Collections.sort(combinations);
        
        for(String combination : combinations) 
        {
            System.out.print(combination + " ");
        }
        
        System.out.println();
		
	}

	private static List<String> numberToText(String str) {
		
        List<String> combinations = new ArrayList<>();
        
        if(str.isEmpty()) 
        {
            return combinations;
        }
        
        check(combinations, str, new StringBuilder(), 0);
        
        return combinations;
	}

	private static void check(List<String> combinations, String str, StringBuilder sb, int in) {
		if(in == str.length()) 
        {
            combinations.add(sb.toString());
            return;
        }
        
        int digit = str.charAt(in) - '0';
        String letters = alpha[digit];
        
        for(char ch : letters.toCharArray()) {
            sb.append(ch);
            check(combinations, str, sb, in + 1);
            sb.deleteCharAt(sb.length() - 1);
        }
		
	}

}
