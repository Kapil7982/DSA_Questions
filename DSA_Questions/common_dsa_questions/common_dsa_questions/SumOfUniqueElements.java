package common_dsa_questions;

import java.util.HashMap;
import java.util.Map;

public class SumOfUniqueElements {

	public static void main(String[] args) {
		
		//int[] arr = {1,2,3,2};
		
		int[] arr = {1,1,1,1,1};
        System.out.println(sumOfUniqueElements(arr));

	}

	private static int sumOfUniqueElements(int[] arr) {
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int num : arr)
		{
			map.put(num, map.getOrDefault(num, 0) +1);
		}
		
		int sum=0;
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet())
		{
			if(entry.getValue() == 1)
			{
				sum+= entry.getKey();
			}
		}
		
		return sum;
	}

}
