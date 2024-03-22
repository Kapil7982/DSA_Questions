package common_dsa_questions;

public class LengthOfLastWord {

	public static void main(String[] args) {
		
		String str = "Hello World";
		
		System.out.println(lengthOfLastWord(str));
	}

	private static int lengthOfLastWord(String str) {
		
		str = str.trim();
		
		int length = 0;
		int i = str.length()-1;
		
		while(i >= 0 && str.charAt(i) != ' ')
		{
			length++;
			i--;
		}
		
		return length;
	}
}
