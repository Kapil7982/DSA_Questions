package common_dsa_questions;

public class FindTheIndexOfTheFirstIndexOccurrenceInAString {

	public static void main(String[] args) {
		
//		    String str = "sadbutsad";
//		    
//	        String str1 = "sad";
	        
	        String str = "leetcode";
	        
	        String str1 = "leeto";
	        
	        int index = findTheIndexOfTheFirstIndexOccurrenceInAString(str, str1);
	        
	        if(index == -1) 
	        {
	            System.out.println("-1");
	        } 
	        else 
	        {
	            System.out.println(index);
	        }
	}

	private static int findTheIndexOfTheFirstIndexOccurrenceInAString(String str, String str1) {
		
		return str.indexOf(str1);
	}

}
