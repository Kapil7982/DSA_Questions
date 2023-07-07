package common_dsa_questions;

public class GenerateAllSubstrings {

	public static void main(String[] args) {
		
		String str = "aman";
		
		int n = str.length();
		
		for(int i=0; i<n; i++) 
		{
	         for(int j=i+1; j<=n; j++) 
	         {
	            System.out.println(str.substring(i, j));
	         }
	      }
		
	
	}

}
