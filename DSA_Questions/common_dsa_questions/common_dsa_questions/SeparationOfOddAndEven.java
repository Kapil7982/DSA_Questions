package common_dsa_questions;

import java.util.*;


public class SeparationOfOddAndEven {

	public static void main(String[] args) {
		
		int[] arr = {1,3,5,2,4,7};
		
		int n = arr.length;
		
		//int q = 1;
		
		int q = 2;
		
		Arrays.sort(arr);
        List<Integer> list = new ArrayList<>();
        
        if(q==1)
        {
            for(int i=0; i<n; i++)
            {
                if(arr[i]%2==0)
                {
                    list.add(arr[i]);
                }
            }
            for(int j=0; j<n; j++)
            {
                if(arr[j]%2!=0)
                {
                    list.add(arr[j]);
                }
            }
        }
       else  if(q==2)
        {
           for(int i=0; i<n; i++)
           {
               if(arr[i]%2!=0)
                {
                    list.add(arr[i]);
                }
           }
           for(int j=0; j<n; j++)
            {
                if(arr[j]%2==0)
                {
                    list.add(arr[j]);
                }
            }
        }
        
        for(Integer i:list)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        

	}

}
