package common_dsa_questions;

import java.util.*;


public class PowerWithoutMultiplication {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the base: ");
        int b = sc.nextInt();
        
        System.out.print("Enter the exponent: ");
        int n = sc.nextInt();
        
        int result = power(b, n);
        
        System.out.println(b + " raised to the power of " + n + " is: " + result);
    }
    
    public static int power(int b, int n) 
    {
        if(n == 0) 
        {
            return 1;
        }
        
        int result = b;
        
        for(int i = 1; i < n; i++) 
        {
            result = multiply(result, b);
        }
        return result;
    }
    
    public static int multiply(int a, int b) 
    {
        int result = 0;
        for(int i = 0; i < a; i++)
        {
            result += b;
        }
        return result;
    }
}


