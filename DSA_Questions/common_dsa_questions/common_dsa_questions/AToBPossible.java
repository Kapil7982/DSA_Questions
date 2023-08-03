package common_dsa_questions;

public class AToBPossible {

	public static void main(String[] args) {
		
//		int l = 6;
//		
//		int m = 242;
		
//        int l = 3;
//		
//		int m = 3;
		
//        int l = 6;
//		
//		int m = 3;
		
        int l = 10;
		
		int m = 30;
		
		Boolean x = atoBPossible(l,m);
        if(x==true)
        {
            System.out.println("Possible");
        }
        else
        {
            System.out.println("Not Possible");
        }

	}

	private static Boolean atoBPossible(int l, int m) {
		
		while(m>l)
        {
            if(m%10==1)
            {
                m/=10;
                continue;
            }
            if(m%2==0)
            {
                m/=2;
                continue;
            }
            return false;
        }
        if(m==l)
            return true;
        return false;
	}

}
