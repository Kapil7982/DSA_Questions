package common_dsa_questions;

public class LCMChallenge {

	public static void main(String[] args) {
		
		//int n = 3;
		
		//int n = 5;
		
		int n = 11;
		
	    
	    int bag=0;
	    
	      if(n%2!=0)
	      {
	          bag= (n)*(n-1)*(n-2);
	      }
	        else if(n%2==0 && n%3==0)
	        {
	            bag= (n-1)*(n-2)*(n-3);
	        }
	      else 
	        {
	            bag= (n)*(n-1)*(n-3);
	        }
	        
	       
	    
	     System.out.println(bag);

	}

}
