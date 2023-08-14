package common_dsa_questions;

import java.util.*;

public class JumpingOnTheClouds{
	
	 private static int minJumpsToWin(int n, int[] arr)
	    {
	        int count = 0;
	        
	        int currentPosition = 0;

	        while(currentPosition < n - 1) 
	        {
	            if(currentPosition + 2 < n && arr[currentPosition + 2] == 0) 
	            {
	                currentPosition += 2;
	            } 
	            else 
	            {
	                currentPosition += 1;
	            }
	            count++;
	        }

	        return count;
	    }
    
    public static void main(String[] args) 
    {
        int[] arr = {0, 0, 1, 0, 0, 1, 0};
        
        
        int n = arr.length;
       
//        int[] arr = {0, 0, 0, 0, 1, 0};
//        
//        int n = arr.length;

            int minJumps = minJumpsToWin(n, arr);
            System.out.println(minJumps);
        }
    

   
}

