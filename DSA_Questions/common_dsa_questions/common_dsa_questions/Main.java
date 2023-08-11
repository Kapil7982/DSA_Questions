package common_dsa_questions;

public class Main {
	
    public static void main(String[] args) {
    	
        int[] arr1 = {2, 1, 6, 4};
        System.out.println(countIndicesToRemove(arr1));

        int[] arr2 = {1, 1, 1};
        System.out.println(countIndicesToRemove(arr2));
    }

    public static int countIndicesToRemove(int[] arr) {
    	
        int n = arr.length;
        int evenSum = 0, oddSum = 0;

        for(int i=0; i<n; i++) 
        {
            if(i%2 == 0) 
            {
                evenSum += arr[i];
            }
            else 
            {
                oddSum += arr[i];
            }
        }

        int count = 0;
        int currEvenSum = 0, currOddSum = 0;

        for(int i=0; i<n; i++) 
        {
            if(i%2 == 0)
            {
                if(currEvenSum + oddSum - currOddSum == currOddSum + evenSum - currEvenSum - arr[i]) 
                {
                    count++;
                }
                currEvenSum += arr[i];
            } 
            else 
            {
                if(currEvenSum + oddSum - currOddSum - arr[i] == currOddSum + evenSum - currEvenSum) 
                {
                    count++;
                }
                currOddSum += arr[i];
            }
        }

        return count;
    }
}
