package common_dsa_questions;

import java.util.HashMap;

public class FindPairWithGivenDifference {

	public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 3, 1};
        int k = 3;
        findPairIndexes(arr, k);
    }

	private static void findPairIndexes(int[] arr, int k) {
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i=0; i<arr.length; i++)
		{
			if(map.containsKey(arr[i]))
			{
				int index = map.get(arr[i]);
				
				if(Math.abs(index-i) <= k)
				{
					System.out.println(index + " "+ i);
					return;
				}
			}
			else
			{
				map.put(arr[i], i);
			}
		}
		
		System.out.println("-1");
		
	}

}
