package common_dsa_questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountCommonWordsWithOneOccurrence {

	public static void main(String[] args) {
		
		String[] str = {"leetcode","is","amazing","as","is"};
		
		String[] str1 = {"amazing","leetcode","is"};
		
//        String[] str = {"b","bb","bbb"};
//		
//		String[] str1 = {"a","aa","aaa"};
//		

		System.out.println(countCommonWordsWithOneOccurrence(str,str1));
	}

	private static int countCommonWordsWithOneOccurrence(String[] str, String[] str1) {
		
		Map<String, Integer> freq1 = new HashMap<>();
		
        Map<String, Integer> freq2 = new HashMap<>();
        
        for(String word : str) 
        {
            freq1.put(word, freq1.getOrDefault(word, 0) + 1);
        }
        
        for(String word : str1) 
        {
            freq2.put(word, freq2.getOrDefault(word, 0) + 1);
        }
        
        int count = 0;
        
        for(String word : freq1.keySet()) 
        {
            if(freq1.get(word) == 1 && freq2.getOrDefault(word, 0) == 1) 
            {
                count++;
            }
        }
        
        return count;
	}
}
