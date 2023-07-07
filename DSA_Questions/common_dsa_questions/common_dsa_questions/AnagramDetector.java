package common_dsa_questions;

import java.util.Arrays;

public class AnagramDetector {

	public static void main(String[] args) {
		
		
		String str = "anagram";
		String str1 = "nag a ram";
		
		str = str.replaceAll("\\s", "").toLowerCase();
	    str1 = str1.replaceAll("\\s", "").toLowerCase();

	        
	    char[] ch = str.toCharArray();
	    Arrays.sort(ch);
	    str = new String(ch);

	    char[] ch1 = str1.toCharArray();
	    Arrays.sort(ch1);
	    str1 = new String(ch1);

	        
	        if (str.equals(str1)) 
	        {
	            System.out.println("True");
	        } 
	        else 
	        {
	            System.out.println("False");
	        }

	}

}
