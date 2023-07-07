package common_dsa_questions;

public class KeepDistinct {

	public static void main(String[] args) {
		
		String str = "iloveprogramming";
		
        int count = 0;
        
        char[] ch = str.toCharArray();
        
        int i = 0;
        
        int size = ch.length;
        
        char x;
        
        int length = 0;
        
        while(i < size) 
        {
            x =(char) (ch[i] - 97);
        
            if((count & (1 << x)) == 0) 
            {
        
                ch[length] = (char) ('a' + x);
        
                count = count | (1 << x);
        
                length++;
            }
            i++;
        }
         System.out.println(new String(ch).substring(0, length));

	}
}
