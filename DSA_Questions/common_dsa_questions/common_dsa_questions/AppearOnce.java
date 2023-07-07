package common_dsa_questions;

import java.util.HashMap;
import java.util.Map;

public class AppearOnce {

	public static void main(String[] args) {
		
		//int[] arr = {3,5,3,3,8,5,6};
		
		int[] arr = {2, 5, 2, 8, 5};
		
		int n = arr.length;
		

		 Map<Integer, Integer> obj = new HashMap<>();

		 for(int i=0; i<n; i++) 
		 {
		     int tag = arr[i];
		     if(!obj.containsKey(tag)) 
		     {
		         obj.put(tag, 1);
		     } 
		     else 
		     {
		         obj.put(tag, obj.get(tag) + 1);
		     }
		  }

		    int sum = 0;

		    for(Integer key : obj.keySet()) 
		    {
		            if(obj.get(key) == 1) 
		            {
		                sum += key;
		            }
		     }

		      System.out.println(sum);
		    }
		


	}


