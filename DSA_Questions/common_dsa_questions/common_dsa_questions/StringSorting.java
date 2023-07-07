package common_dsa_questions;

public class StringSorting {

	public static void main(String[] args) {
		
//		String str = "000";
		
		//String str = "1001";
		
		//String str = "1010";
		
		String str = "010101";
		
		int n = str.length();
		
		int count=0;
		
		for(int i=0; i<n-1; i++)
		{
			if(str.charAt(i) == '1' && str.charAt(i+1) == '0')
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
