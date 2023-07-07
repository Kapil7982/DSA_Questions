package common_dsa_questions;

public class NumberOfSegmentsInAString {

	
	public static void main(String[] args) {
		
		//String str = "Hello, my name is John";
		
		String str = "Hello";
		
	    System.out.println(countSegments(str));
	}

	private static int countSegments(String str) {
		
		int count=0;
		
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i) != ' ' && (i==0 || str.charAt(i-1) == ' ') )
			{
				count++;
			}
		}
		
		return count;
	}
	
}
