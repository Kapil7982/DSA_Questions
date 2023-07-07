package common_dsa_questions;

public class DecipherString {

	public static void main(String[] args) {
		
		//String str = "a2b1c2";
		
		String str = "a2z1a2";
		
		int n = str.length();
		
		for(int i=0; i<n; i++)
        {
        if(str.charAt(i)>='0'&& str.charAt(i)<='9')
        {
            int k = str.charAt(i)-'0';
            for(int j=0; j<k;j++)
            {
                System.out.print(str.charAt(i-1));}
            }
        }
        System.out.println();

	}

}
