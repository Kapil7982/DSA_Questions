package common_dsa_questions;

import java.util.HashMap;
import java.util.Map;

public class StringCount {

	public static void main(String[] args) {
		
		String str = "thequickbrownfoxjumpsoverthelazydog";
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i=0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			
			if(map.containsKey(ch))
			{
				map.put(ch, map.get(ch) +1);
			}
			else
			{
				map.put(ch, 1);
			}
		}
		
		for (Map.Entry<Character, Integer> en : map.entrySet()) 
		{
            System.out.println(en.getKey() + " - " + en.getValue());
        }

	}

}
