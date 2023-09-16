package common_dsa_questions;

import java.util.*;

public class UseSideLane{
    
    public static boolean useSideLane(int[] arr)
    {
        Stack<Integer> stack  = new Stack<>();
        
        int curr = 1;
        
        for(int i=0; i<arr.length; i++)
        {
            if( curr== arr[i])
            {
                curr++;
                continue;
            }
            else if(!stack.isEmpty() && stack.peek() == curr)
            {
               while(!stack.isEmpty() && stack.peek() == curr)
               {
                    stack.pop();
                    curr++;
               }
            }
            if(!stack.isEmpty() && stack.peek()<arr[i]) 
                return false;
            stack.push(arr[i]);
        }
        return true;
    }
    
    public static void main(String[] args)
    {
    	int[][] testCases = {
                {5, 5, 1, 2, 4, 3},
                {0}
            };
            
            for (int[] testCase : testCases) {
                int n = testCase[0];
                if(n== 0) 
                    break;
                int[] arr = Arrays.copyOfRange(testCase, 1, n + 1);
                
                if (useSideLane(arr)) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            }
    }
}

