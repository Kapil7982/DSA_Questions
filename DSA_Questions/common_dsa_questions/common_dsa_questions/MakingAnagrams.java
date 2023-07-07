package common_dsa_questions;

public class MakingAnagrams {

	public static void main(String[] args) {
		
		String str = "cde";
		
		String str1 = "abc";
		
		System.out.println(makingAnagrams(str,str1));

	}

	private static int makingAnagrams(String str, String str1) {
		
        int[] charSet = new int[256];
        
        for(int i=0; i<str.length(); i++)
        {
            charSet[str.charAt(i)]++;
        }
        
        for(int i=0; i<str1.length(); i++)
        {
            charSet[str1.charAt(i)]--;
        }
        
        int count = 0;
        for(int i=0; i<256; i++)
        {
            count += Math.abs(charSet[i]);
        }
        
        return count;
		
	}

}
