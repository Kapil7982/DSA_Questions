package common_dsa_questions;

public class LongestPalindromesubstring {

	public static void main(String[] args) {
		
		String str = "forgeeksskeegfor";
		
		System.out.println(LongestPalindromesubstring(str));

	}

	private static String LongestPalindromesubstring(String str) {
		
		if(str == null || str.length() < 1)
		{
			return "";
		}
		
		String longest = "";
		
		for(int i=0; i<str.length(); i++)
		{
			for(int j=i+1; j<= str.length(); j++)
			{
				String substring = str.substring(i,j);
				
				if(isPlaindrome(substring) && substring.length() > longest.length())
				{
					longest = substring;
				}
			}
		}
		return longest;
		
	}

	public static boolean isPlaindrome(String s)
	{
		int left =0;
		int right = s.length() -1;
		
		while(left < right)
		{
			if(s.charAt(left)  != s.charAt(right))
			{
				return false;
			}
			left ++;
			right --;
		}
		return true;
	}
}
