package common_dsa_questions;

public class UnitConsumed {

	public static void main(String[] args) {
		
		int n = 930;
		
		if(n<=230)
	    {
			System.out.println((n-80)/3);
	    }
	    else if(n>230 && n<=730)
	    {
	    	System.out.println(50+(n-230)/5);
	    }
	    else if(n>730)
	    {
	    	System.out.println(150+(n-730)/10);
	    }
		
	}

}
