package common_dsa_questions;

public class EncryptIt {

	public static void main(String[] args) {
	
		String str = "All-convoYs-9-be:Alert1.";
		
		int k = 4;
		
		encryptIt(k,str);
	}

	private static void encryptIt(int k, String str) {
		
		StringBuilder bag = new StringBuilder();

        for(int i=0; i<str.length(); i++) 
        {
            char ch = str.charAt(i);
            String encrypted = encrypt(ch, k);
            bag.append(encrypted);
        }
        System.out.println(bag);
	}

	private static String encrypt(char ch, int k) {
		
		if (ch >= '0' && ch <= '9') 
        {
            int temp = ch;
            temp = ((temp + k - 48) % 10) + 48;
            return Character.toString((char) temp);
        } 
        else if (ch >= 'A' && ch <= 'Z') 
        {
            int temp = ch;
            temp = ((temp + k - 65) % 26) + 65;
            return Character.toString((char) temp);
        } 
        else if (ch >= 'a' && ch <= 'z') 
        {
            int temp = ch;
            temp = ((temp + k - 97) % 26) + 97;
            return Character.toString((char) temp);
        } 
        else 
        {
            return Character.toString(ch);
        }
	}

}
