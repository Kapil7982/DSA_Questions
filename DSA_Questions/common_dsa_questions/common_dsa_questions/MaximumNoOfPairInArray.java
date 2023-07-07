package common_dsa_questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MaximumNoOfPairInArray {

	public static void main(String[] args) {
		
		//int[] arr = {1, 2, 3, 1, 1, 2};
		
		int[] arr = {1,1};
		
		System.out.println(Arrays.toString(maximumNoOfPairInArray(arr)));

	}

	private static int[] maximumNoOfPairInArray(int[] arr) {
		
		Map<Integer, Integer> map = new HashMap<>();
		
		int count=0;
		
		for(int nums : arr)
		{
			map.put(nums, map.getOrDefault(nums, 0) +1);
			
			if(map.get(nums) == 2)
			{
				count++;
				map.put(nums, 0);
			}
		}
		
		int check=0;
		
		for(int nums : map.values())
		{
			if(nums == 1)
			{
				check++;
			}
		}
		
		return new int[] {count, check};
	}

}
