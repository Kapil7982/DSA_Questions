package common_dsa_questions;

import java.util.*;


public class AllTwiceExceptOne {

	public static void main(String[] args) {
		
		//int[] arr = {5};
		
		int[] arr = {1,2,1,3,2};
		
		int n = arr.length;
		
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        
        for(int i=0; i<n; i++) 
        {
            if(hashMap.containsKey(arr[i])) 
            {
                int count = hashMap.get(arr[i]);
                
                hashMap.put(arr[i], count + 1);
            } 
            else
            {
                hashMap.put(arr[i], 1);
            }
        }
        int uni = 0;
        
        for(Map.Entry<Integer, Integer> map : hashMap.entrySet()) 
        {
            if(map.getValue() == 1) 
            {
                uni = map.getKey();

            }
        }
        System.out.println(uni);
	}
}
