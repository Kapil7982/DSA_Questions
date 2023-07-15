package common_dsa_questions;

public class FindTheKBeautyOfANumber {

	public static void main(String[] args) {
		
		int n = 240;
		int k = 2;
		
       String numStr = String.valueOf(n);
        
        int count = 0;

        for(int i=0; i<=numStr.length()-k; i++) 
        {
            String substring = numStr.substring(i, i + k);
            
            int sub = Integer.parseInt(substring);

            if(sub != 0 && n % sub == 0) 
            {
                count++;
            }
        }
        System.out.println(count);
	}

}
