package common_dsa_questions;

import java.util.HashSet;

public class HashSetsInJava {

	public static void main(String[] args) {
		
		int[] arr = {1,2,2,2,2,3};
		
		System.out.println(solve(arr));

	}

	private static HashSet<Integer> solve(int[] arr) {
		
		HashSet<Integer> hs = new HashSet<>();
		
		for(int i=0; i<arr.length; i++)
		{
			hs.add(arr[i]);
		}
		return hs;
	}

}
