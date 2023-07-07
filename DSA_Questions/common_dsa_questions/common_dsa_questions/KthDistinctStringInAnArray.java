package common_dsa_questions;

import java.util.HashMap;

public class KthDistinctStringInAnArray {

	public static void main(String[] args) {
		
//		String[] str = {"d","b","c","b","c","a"};
//		int k = 2;
		
		String[] str = {"aaa","aa","a"};
		int k = 1;
		
		System.out.println(kthDistinctStringInAnArray(str,k));
		
		

	}

	private static String kthDistinctStringInAnArray(String[] str, int k) {
		
        HashMap<String, Integer> map = new HashMap<>();
		
		for(String st : str)
		{
			map.put(st, map.getOrDefault(st, 0) +1);
		}
		
		int count=0;
		
		for(String st: str)
		{
			if(map.get(st) == 1)
			{
				count++;
				if(count == k)
				{
					return st;
				}
			}
		}
		
		return "";
	}

}
