package common_dsa_questions;

public class DetectPalindrome {

	public static void main(String[] args) {
		
		 String str = "1221";
		
		 String s ="";
	     int length = str.length();
	     for(int i=length-1; i>=0; i--)
	     {
	        s = s + str.charAt(i);    
	     }
	     if (str.equals(s))
	     {
	        System.out.println("Yes");
	          
	     }
	     else
	     {
	        System.out.println("No");   
	     }

	}

}
