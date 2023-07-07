package common_dsa_questions;

import java.util.*;

public class NoddyExamination{
	    
	    public static void main(String[] args)
	    {
	        int[] arr = {3, 2, 4, 1, 5};
	        
	        int n = arr.length;
	        int k = 3; 
	        
	        int skip = 0;
	        int count = 0;
	    
	        for(int i = 0; i < n; i++) 
	        {
	           int arr1 = arr[i];
	           
	           if(arr1 <= k && skip < 2)
	           {
	               count++;
	           }
	           else if (arr1 > k)
	           {
	               skip++;
	           }
	        }
	    
	        System.out.println(count);
	    }
	}
