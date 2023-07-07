package common_dsa_questions;

public class BlackAndWhiteStrips {

	public static void main(String[] args) {
		
		String str = "BBWBW";
		
		int n = str.length();
		
		int k = 3;
		
		int min = Integer.MAX_VALUE; 

        for (int j=0; j<=n-k; j++) 
        {
            int count = 0; 

            for(int l=j; l<j+k; l++) 
            {
                if(str.charAt(l) == 'W') 
                {
                    count++;
                }
            }

           
            if(count < min) 
            {
                min = count;
            }
        }

    
        System.out.println(min == Integer.MAX_VALUE ? k : min);
	}
}
