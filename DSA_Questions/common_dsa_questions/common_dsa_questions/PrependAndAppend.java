package common_dsa_questions;

public class PrependAndAppend {

	public static void main(String[] args) {
		
		//String str = "1010110";
		
		String str = "11";
		
		int n = str.length();
		
		prependAndAppend(n, str);

	}

	private static void prependAndAppend(int n, String str) {
		
		int count=0;
		
		for(int i=0, j=n-1; i<n/2; i++, j--) 
        {
            if(str.charAt(i) == str.charAt(j)) 
            {
                break;
            } 
            else 
            {
                count++;
            }
        }
        System.out.println(n-(2*count));
		
	}

}
