package common_dsa_questions;

import java.util.*;

public class TiplesStones{
    
    public static void tiplesStones(int n, int m, int[] arr)
    {
        int count = 0;
 
        for(int i=0; i<n-2; i++)
        {
            for(int j=i+1; j<n-1; j++)
            {
                for(int k=j+1; k<n; k++)
                {
                    if(arr[i]*arr[j] * arr[k]<= m)
                    {
                        count++;
                    }
                }
            }
        }
 
        System.out.println(count);
    }
    
    public static void main(String[] args)
    {
        int[] arr = {3,2,5,7};
        
        int n = arr.length;
        
        int k = 42;
        
        tiplesStones(n,k,arr);
    }
}
