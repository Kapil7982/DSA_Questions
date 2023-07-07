package common_dsa_questions;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeat {

	public static void main(String[] args) {

		String s1 = "workattech";
        String s2 = "mississippi";
        System.out.println(lengthOfLongestSubstring(s1)); 
        System.out.println(lengthOfLongestSubstring(s2));

	}

	private static int lengthOfLongestSubstring(String s) {
		
		Map<Character,Integer> map = new HashMap<>();
		
		int l=0;
		int max=0;
		
		for(int i=0; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			
			if(map.containsKey(ch) && map.get(ch) >= l)
			{
				l = map.get(ch) +1;
			}
			
			map.put(ch, i);
			max = Math.max(max, i-l +1);
					
		}
		return max;
	}

}
