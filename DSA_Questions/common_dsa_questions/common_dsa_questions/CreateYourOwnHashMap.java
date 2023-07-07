package common_dsa_questions;

import java.util.HashMap;

public class CreateYourOwnHashMap {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		int n = arr.length;
		
		HashMap<Integer, Integer> hmap = new HashMap<>();
		
		for(int i=0; i<n; i++)
		{
			Integer ch = arr[i];
			
			int count=0;
			
			if(hmap.containsKey(ch))
			{
				Integer cv = hmap.get(ch);
				count = cv+1;
			}
			else
			{
				count = 1;
			}
			hmap.put(ch, count);
			System.out.println(ch +"-"+count);
		}
		
	}
}
