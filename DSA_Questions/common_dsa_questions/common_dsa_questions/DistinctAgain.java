package common_dsa_questions;

import java.util.HashSet;
import java.util.Set;

public class DistinctAgain {

	public static void main(String[] args) {
		
		int[] arr = {2,2,2,1,1};
		
		
		Set<Integer> set = new HashSet<>();
		
		int sum=0;
		
		for(int i : arr)
		{
			if(!set.contains(i))
			{
				sum+= i;
				set.add(i);
			}
		}
		System.out.println(sum);
	}

}
