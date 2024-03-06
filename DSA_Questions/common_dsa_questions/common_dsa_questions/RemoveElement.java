package common_dsa_questions;

import java.util.ArrayList;

public class RemoveElement {

	public static void main(String[] args) {
		
		//int[] arr = {3,2,2,3};
		
		int[] arr = {0,1,2,2,3,0,4,2};
		
		//int val = 3;
		
		int val = 2;
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i : arr)
		{
			list.add(i);
		}
		
		while(list.contains(val))
		{
			list.remove(Integer.valueOf(val));
		}
		
		for(int i=0; i<list.size(); i++)
		{
			arr[i] = list.get(i);
		}
		
		System.out.println(list.size());
		
		
	}
}
