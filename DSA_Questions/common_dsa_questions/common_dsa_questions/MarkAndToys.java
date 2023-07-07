package common_dsa_questions;

import java.util.*;

public class MarkAndToys {

	public static void main(String[] args) {
		
		int[] arr = {1,12,5,111,200,1000,10};
		
		int n = arr.length;
		
		int k = 50;
		
        List<Integer> stc = new ArrayList<>();
        
        for(int i=0; i<n; i++)
        {
            stc.add(arr[i]);
        }
        
        Collections.sort(stc);
        
        int count = 0;
        
        while(stc.get(0) <= k) 
        {
            count++;
            k -= stc.get(0);
            stc.remove(0);
        }
        System.out.println(count);
	}
}
