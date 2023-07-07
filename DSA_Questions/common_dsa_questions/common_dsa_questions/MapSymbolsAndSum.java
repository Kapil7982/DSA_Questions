package common_dsa_questions;

public class MapSymbolsAndSum {

	public static void main(String[] args) {
		
		String str = "!@#$";
		
		int n = str.length();
		
		int bag =0;
		for(int i=0; i<n; i++) 
		{
            if(str.charAt(i) == '!') 
            {
                bag = bag + 1;
            }
            if(str.charAt(i) == '@') 
            {
                bag = bag + 2;
            }
            if(str.charAt(i) == '#') 
            {
                bag = bag + 3;
            }
            if(str.charAt(i) == '$') 
            {
                bag = bag + 4;
            }
            if(str.charAt(i) == '%') 
            {
                bag = bag + 5;
            }
            if(str.charAt(i) == '^') 
            {
                bag = bag + 6;
            }
            if(str.charAt(i) == '&') 
            {
                bag = bag + 7;
            }
            if(str.charAt(i) == '*') 
            {
                bag = bag + 8;
            }
        }
        System.out.println(bag);

	}

}
