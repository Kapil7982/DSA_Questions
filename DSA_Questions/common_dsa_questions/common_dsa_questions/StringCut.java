package common_dsa_questions;

public class StringCut {

	public static void main(String[] args) {
		
		String str = "abcxyz";
		
		
		int mid = str.length()/2;

	      
        String bag = str.substring(0, mid);
        String tag = str.substring(mid);

       
        StringBuilder jhola = new StringBuilder(bag);
        jhola.reverse();

        
        StringBuilder jhola1 = new StringBuilder(tag);
        jhola1.reverse();

        
        String ans = jhola.toString() + jhola1.toString();

        System.out.println(ans);
	}
}
