package common_dsa_questions;


import java.util.Arrays;

public class ThirdLargestNumber{

    public static int findThirdLargest(int[] arr) 
    {
        if (arr.length < 3) 
        {
            System.out.println("Array should have at least 3 elements.");
            return -1;
        }

        Arrays.sort(arr);
        return arr[arr.length - 3];
    }

    public static void main(String[] args) 
    {
        int[] arr = {10, 4, 3, 50, 23, 90, 100};
        int thirdLargest = findThirdLargest(arr);
        
        if(thirdLargest != -1) 
        {
            System.out.println(thirdLargest);
        }
    }
}

