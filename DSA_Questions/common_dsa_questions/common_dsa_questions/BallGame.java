package common_dsa_questions;

public class BallGame {

	public static void main(String[] args) {
		
		//String str = "AAA";
		
		//String str = "BBBB";
		
		//String str = "ABABB";
		
		String str = "BABAB";
		
		int n = str.length();
		
		int alice = 0;
        int bob = 0;
        
        boolean flag = true;

        for(int i=0; i<n; i++) 
        {
            char ch = str.charAt(i);

            if(ch == 'A') 
            {
                if(flag) 
                {
                    alice++;
                }
                flag = true;
            } 
            else if(ch == 'B') 
            {
                if(!flag) 
                {
                    bob++;
                }
                flag = false;
            }
        }

        System.out.println(alice + " " + bob);
		
		

	}

}
