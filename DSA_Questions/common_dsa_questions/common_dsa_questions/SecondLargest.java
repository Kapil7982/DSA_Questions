package common_dsa_questions;

public class SecondLargest {
	
    public static void main(String[] args)
    {
        int[] array = {-1, -6, -8, -3, 100};
        
        int largest = Integer.MIN_VALUE;
        
        int secondLargest = Integer.MIN_VALUE;
        
        for(int number : array) 
        {
            if (number > largest) 
            {
                secondLargest = largest;
                largest = number;
            } 
            else if(number > secondLargest && number != largest) 
            {
                secondLargest = number;
            }
        }
        
        if(secondLargest != Integer.MIN_VALUE) 
        {
            System.out.println("Second largest integer: " + secondLargest);
        } 
        else
        {
            System.out.println("No second largest integer found.");
        }
    }
}

