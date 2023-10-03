package common_dsa_questions;

public class CharactersAtOddPosition {

	public static void main(String[] args) {
		
		String str = "ankush";
		
		int n = str.length();
		
		for(int i=0; i<n; i++)
	    {
	        if(i%2!=0)
	        {
	            System.out.println(str.charAt(i));;
	        }
	    }

	}

}
