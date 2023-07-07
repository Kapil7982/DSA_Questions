package common_dsa_questions;

import java.util.Arrays;

public class PossiblePalindrome {

	public static void main(String[] args) {
		
		String str = "carerca";
		
		int n = str.length();
		
		if(possiblePalindrome(n,str))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }

	}

	static int ch = 256;
	
	private static boolean possiblePalindrome(int n, String str) {
		
		int count[] = new int[ch];
		        
		        Arrays.fill(count, 0);
		 
		        for(int i=0; i<n; i++)
		        {
		            count[(int)(str.charAt(i))]++;
		        }
		 
		        int odd = 0;
		        
		        for(int i=0; i<ch; i++) 
		        {
		            if((count[i]&1) == 1)
		            {
		                odd++;
		            }
		 
		            if(odd>1)
		            {
		                return false;
		            }
		        }
		 
		        return true;
	}

}
