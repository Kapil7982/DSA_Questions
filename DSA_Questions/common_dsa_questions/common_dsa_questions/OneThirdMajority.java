package common_dsa_questions;

import java.util.ArrayList;
import java.util.List;

public class OneThirdMajority {
	
	public static void main(String[] args) {
		
		int[] arr = {3,2,3};
		
		int n = arr.length;
		
		oneThirdMajority(n,arr);
	}

	private static void oneThirdMajority(int n, int[] arr) {
		
         int num1 = -1, num2 = -1, count1 = 0, count2 = 0;
        
        for(int i=0; i<n; i++) 
        {
            if(arr[i] == num1) 
            {
                count1++;
            } 
            else if(arr[i] == num2) 
            {
                count2++;
            } 
            else if(count1 == 0) 
            {
                num1 = arr[i];
                count1++;
            } 
            else if(count2 == 0) 
            {
                num2 = arr[i];
                count2++;
            } 
            else
            {
                count1--;
                count2--;
            }
        }

        
        count1 = 0;
        
        count2 = 0;
        
        for(int i=0; i<n; i++) 
        {
            if(arr[i] == num1) 
            {
                count1++;
            } 
            else if(arr[i] == num2) 
            {
                count2++;
            }
        }

        List<Integer> result = new ArrayList<>();
        
        if(count1 > n / 3) 
        {
            result.add(num1);
        }
        if(count2 > n / 3) 
        {
            result.add(num2);
        }

       
        for(int i : result) 
        {
            System.out.print(i + " ");
        }
        
		
	}

}
