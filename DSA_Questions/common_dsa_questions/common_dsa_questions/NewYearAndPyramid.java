package common_dsa_questions;

public class NewYearAndPyramid {

	public static void main(String[] args) {
		
		int n = 25;
		
		int max=1;
	    while(n>0)
	    {
	       double s = max*(max+1);
	        s = Math.floor(s/2);
	        if(s>n)
	        {
	            break;
	        }
	        n-=s;
	        max++;
	    }
	    System.out.println(max-1);
	}

}
