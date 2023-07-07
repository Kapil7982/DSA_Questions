package common_dsa_questions;

public class BineryStringCompression {

	public static void main(String[] args) {
		
		String str = "11000";
		
		int n = str.length();
		
		StringBuilder sb = new StringBuilder();
		
        int count = 0;

        for(int i=0; i<n; i++) 
        {
            if(sb.length() == 0 || sb.charAt(count - 1) == str.charAt(i)) 
            {
                sb.append(str.charAt(i));
                count++;
            } 
            else 
            {
                sb.deleteCharAt(count -1);
                count--;
            }
        }

        System.out.println(count);
	}

}
