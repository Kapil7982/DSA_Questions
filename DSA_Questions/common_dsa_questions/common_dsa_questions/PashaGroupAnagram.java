package common_dsa_questions;

import java.util.*;

public class PashaGroupAnagram {

	public static void main(String[] args) {
		
		//String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"};
		
		String[] str = {"abc", "abc", "def"};

		
		Map<String, List<String>> map = new HashMap<>();
		
		for(String s : str)
		{
			char[] ch = s.toCharArray();
			
			Arrays.sort(ch);
			
			String key = String.valueOf(ch);
			
			if(!map.containsKey(key))
			{
				map.put(key, new ArrayList<>());
			}
			
			map.get(key).add(s);
		}
		
		for(List<String> list : map.values())
		{
			System.out.println(list.size()+" ");
			
			for(String st : list)
			{
				System.out.println(st+" ");
			}
		}

	}

}
