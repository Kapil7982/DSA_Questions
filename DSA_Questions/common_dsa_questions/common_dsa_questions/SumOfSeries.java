package common_dsa_questions;

public class SumOfSeries {

	public static void main(String[] args) {
		
		int n = 3;
		
		int x = 2;
		
		if(n<=0 || x<=0)
	    {
	       System.out.println("-1");
	    }
	    else
	    {
	        int tag=0;
	       for(int i=0; i<n; i++)
	       {
	           int bag = (int) Math.pow(x, i);;
	           tag = tag + bag;
	       }
	       System.out.println(tag);
	    }

	}

}
