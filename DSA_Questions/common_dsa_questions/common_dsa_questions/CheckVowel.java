package common_dsa_questions;

public class CheckVowel {

	public static void main(String[] args) {
		
		String str = "stvr";
		
		int n = str.length();
		
		checkVowel(n,str);
	}

	private static void checkVowel(int n, String str) {
		
		int count=0;
		
		for(int i=0; i<n-1; i++)
		{
			char ch = str.charAt(i);
			
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			{
				count=1;
				break;
			}
		}
		
		if(count ==1)
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
		
	}

}
