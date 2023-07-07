package common_dsa_questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SherlockAndAnagrams {

	public static void main(String[] args) {
		
		//String str = "abba";
		
		String str = "abcd";
		
		int n = str.length();
		
		sherlockAndAnagrams(n,str);

	}

	private static void sherlockAndAnagrams(int n, String str) {
		
		Map<String, Integer> map = new HashMap<>(); 
        
        
        for(int i=0; i<n; i++) 
        {
            int[] alpha = new int[26]; 
            
            for(int j=i; j<n; j++) 
            {
                alpha[str.charAt(j) - 'a']++; 
                
                String substring = Arrays.toString(alpha); 
                
                map.put(substring, map.getOrDefault(substring, 0) + 1);
            }
        }
        
        int res = 0; 
        
        for(int alpha : map.values()) 
        {
            res += alpha * (alpha - 1) / 2; 
        }
        System.out.println(res);
	}

}
