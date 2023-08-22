package common_dsa_questions;

public class BaneAndRemovel {

	public static void main(String[] args) {
		
		String str = "ATAAAGCAAAATGC";
		
		int n = str.length();
		
        int count = 0;
        
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n; i++) 
        {
            char ch = str.charAt(i);
            

            if(i>0 && ch == 'A' && str.charAt(i - 1) == 'A') 
            {
                count++;
            }
            else
            {
                sb.append(ch);
            }
        }

        System.out.println(sb.toString());
        System.out.println(count);

	}
}
