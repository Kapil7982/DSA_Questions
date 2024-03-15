package common_dsa_questions;

public class Palindrome {

	public static void main(String[] args) {
		
		int n = 12321;
		
		if(isPalindrome(n))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}

	private static boolean isPalindrome(int n) {
		
		String str = String.valueOf(n);
		
		int i=0;
		int j=str.length()-1;
		
		while(i<j)
		{
			if(str.charAt(i) != str.charAt(j)) {
				
				return false;
			}
			i++;
			j--;

		}
		return true;
	}
	
}
