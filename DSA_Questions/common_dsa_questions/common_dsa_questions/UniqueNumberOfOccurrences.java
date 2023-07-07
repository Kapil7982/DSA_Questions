package common_dsa_questions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOfOccurrences {

	public static void main(String[] args) {
		
		//int[] arr = {1,2,2,1,1,3};
		
		//int[] arr = {1,2};
		
		int[] arr = {-3,0,1,-3,1,1,1,-3,10,0};
		
		System.out.println(uniqueNumberOfOccurrences(arr));

	}

	private static boolean uniqueNumberOfOccurrences(int[] arr) {
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int num : arr)
		{
			map.put(num, map.getOrDefault(num, 0) +1);
		}
		
		Set<Integer> set = new HashSet<>(map.values());
		
		return set.size() == map.size();
	}

}
