package common_dsa_questions;

public class VowalHalf {

	public static void main(String[] args) {
		
		int n = 6;
		
		String str = "aabefe";
		
		int count=0;
	    
	    for(int i=0; i<n; i++)
	    {
	        char ch = str.charAt(i);
	        if(ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'o' || ch == 'u')
	        {
	            count++;
	        }
	    }
	    
	    if(count > n / 2)
	    {
	      System.out.println("True");  
	    }
	    else
	    {
	        System.out.println("False");
	    }
	}
	
			
}
