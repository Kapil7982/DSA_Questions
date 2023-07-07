package common_dsa_questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ParitySorting {

	public static void main(String[] args) {
		
		int[] arr = {2,5,1,4,2};
		
		int n = arr.length;
		
		ArrayList<Integer> odd = new ArrayList<Integer>();
		ArrayList<Integer> even = new ArrayList<Integer>();
		
		for(int i=0; i<n; i++) 
		{
		    if(arr[i] % 2 == 0) 
		    {
		        even.add(arr[i]);
		    } 
		    else 
		    {
		        odd.add(arr[i]);
		    }
		}

		odd.sort(Comparator.naturalOrder());
		even.sort(Comparator.naturalOrder());
		
		ArrayList<Integer> bag = new ArrayList<Integer>();
		
		for(int i=0; i<odd.size(); i++) 
		{
		    bag.add(odd.get(i));
		}
		for(int i=0; i<even.size(); i++) 
		{
		    bag.add(even.get(i));
		}
		System.out.println(String.join(" ", bag.stream().map(Object::toString).toArray(String[]::new)));


	}

}
