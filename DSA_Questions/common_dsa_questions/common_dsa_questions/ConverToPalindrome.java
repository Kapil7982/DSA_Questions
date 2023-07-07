package common_dsa_questions;

public class ConverToPalindrome {

	public static void main(String[] args) {
		
		//String str = "abcba";
		
		//String str = "aaaaakaaa";
		
		String str = "abcabc";
		
		int n = str.length();
		
		converTopalindrome(n,str);
	}

	private static void converTopalindrome(int n, String str) {
		
		boolean flag = false;
		
		for(char ch='a'; ch<='z'; ch++)
		{
			String st = str.replaceAll(Character.toString(ch), "");
			
			if(check(st))
			{
				flag = true;
				break;
			}
		}
		
		if(flag)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}
	
	public static boolean check(String str)
	{
		int n = str.length();
		
		for(int i=0; i<n/2; i++)
		{
			if(str.charAt(i) != str.charAt(n - i - 1))
			{
				return false;
			}
		}
		return true;
	}

}
