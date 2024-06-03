package common_dsa_questions;

import java.util.HashSet;

public class Panagram {

	public static void main(String[] args) {
		
		String s = "abcdefghijklmnopqrstuvwxyz";
		
		System.out.println(isPangram(s));

	}

	private static boolean isPangram(String s) {
		
        HashSet<Character> letters = new HashSet<>();
        
        for(char c : s.toCharArray()) 
        {
           
            if(c >= 'a' && c <= 'z') 
            {
                letters.add(c);
            }
        }
        
        return letters.size() == 26;  
	}

}
