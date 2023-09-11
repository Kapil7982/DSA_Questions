package common_dsa_questions;

public class MasaiStringReversal {

	public static void main(String[] args) {
		
		String str = "masaischool";
		
		int n = str.length();
		
        char[] stc = new char[n];
        char[] stc1 = new char[n];

        for(int i=0; i<n; i++) 
        {
            stc[i] = str.charAt(i);
        }

        for(int i=0; i<stc.length; i++) 
        {
            while(stc.length != 0) 
            {
                stc1[i] = stc[stc.length - 1];
                i++;
                char[] temp = new char[stc.length - 1];
                System.arraycopy(stc, 0, temp, 0, stc.length - 1);
                stc = temp;
            }
        }

        System.out.println(new String(stc1));
	}

}
