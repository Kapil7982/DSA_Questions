package common_dsa_questions;

public class CheckOfVowel {

	public static void main(String[] args) {
		
		//String str = "strv";
		
		String str = "false";
		
		int n = str.length();
		
		int count=0;
		
		for(int i=0; i<n; i++)
		{
			if(str.charAt(i)== 'a' || str.charAt(i)== 'e' || str.charAt(i)== 'i' || str.charAt(i)== 'o' || str.charAt(i)== 'u')
			{
				count=1;
				break;
			}
		}
		
		if(count== 1)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
}
