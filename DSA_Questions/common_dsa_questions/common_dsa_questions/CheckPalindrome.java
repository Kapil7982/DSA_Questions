package common_dsa_questions;

public class CheckPalindrome {

	public static void main(String[] args) {
		
		//String str = "nrupul";
		
		String str = "Nitin";
		
		int n = str.length();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=n-1; i>=0; i--)
		{
			sb = sb.append(str.charAt(i));
		}
		if(str.equalsIgnoreCase(sb.toString()))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
}
