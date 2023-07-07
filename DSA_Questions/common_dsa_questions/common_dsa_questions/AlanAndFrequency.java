package common_dsa_questions;

import java.util.HashMap;
import java.util.Map;

public class AlanAndFrequency {

	public static void main(String[] args) {
		
		String str = "aman";
		
		int n = str.length();
		
		HashMap<Character, Integer> hm = new HashMap<>();
		
		for(int i=0; i<n; i++)
		{
			Character ch = str.charAt(i);
			
			int count =0;
			
			if(hm.containsKey(ch))
			{
				Integer cv = hm.get(ch);
				count = cv+1;
			}
			else
			{
				count =1;
			}
			hm.put(ch, count);
		}
		
		for(Map.Entry<Character, Integer> i : hm.entrySet())
		{
			System.out.println(i.getKey()+"-"+i.getValue());
		}
	}

}
