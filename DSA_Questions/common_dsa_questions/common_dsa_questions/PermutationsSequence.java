package common_dsa_questions;

import java.util.ArrayList;
import java.util.List;

public class PermutationsSequence {

	public static void main(String[] args) {
		
		int n = 3;
		int k = 3;
		
		System.out.println(permutationsSequence(n,k));
	}

    public static String permutationsSequence(int n, int k) {
        
        int fact = 1;
        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
            nums.add(i);
        }
        k--;

        StringBuilder sb = new StringBuilder();
        for(int i = n; i >= 1; i--) 
        {
            
            int index = k / factorial(i - 1);
            sb.append(nums.get(index));
            nums.remove(index);
            k -= index * factorial(i - 1);
        }

        return sb.toString();
    }

    public static int factorial(int n) 
    {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    
	
	
   
}
