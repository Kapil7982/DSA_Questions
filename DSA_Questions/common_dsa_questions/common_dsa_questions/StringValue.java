package common_dsa_questions;

public class StringValue {

	public static void main(String[] args) {
		
		String str  = "aba";
		
		int sum=0;
	    
        for(int i=0; i<str.length(); i++)
        {
           char ch= str.charAt(i);
           
           if(ch>='a' && ch<='z')
           {
               int count = ch-'a'+1;
               sum+=count;
           }
        }
        
        System.out.println(sum);
	}

}
