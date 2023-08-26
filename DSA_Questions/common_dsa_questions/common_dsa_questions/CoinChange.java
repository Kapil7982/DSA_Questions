package common_dsa_questions;

import java.util.*;

public class CoinChange {
    
    public static int coinChange(int n, int amount, int[] arr) 
    {
        int[] mat =new int[amount+1];
        
        for(int i=1;i<=amount;i++)
        {
            int min= Integer.MAX_VALUE; 
            
            for(int j=0;j<n;j++)
            {
                if(i>=arr[j] && mat[i-arr[j]]!= -1)
                {
                    min=Math.min(min,mat[i-arr[j]]);
                }
            }
            mat[i]= (min==Integer.MAX_VALUE)? -1:min+1;
        }
        return mat[amount];
    }
    
    public static void main(String[] args)
    {
    	int[] arr = {1,2,3,5,6};
    	
        int n = arr.length;
        
        
        int amount = 11;
        
        System.out.println(coinChange(n,amount,arr));
    }
    
}
