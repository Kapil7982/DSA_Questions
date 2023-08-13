package common_dsa_questions;

public class RotatedArrayBinarySearch {

    public static int search(int[] arr, int k) 
    {
        int left = 0;
        int right = arr.length - 1;
        
        while(left <= right)
        {
            int mid = left + (right - left) / 2;
            
            if(arr[mid] == k) 
            {
                return mid;
            }
            
            if(arr[left] <= arr[mid]) 
            {
                if(arr[left] <= k && k < arr[mid])
                {
                    right = mid - 1;
                } 
                else
                {
                    left = mid + 1;
                }
            } 
            else 
            {
                if(arr[mid] < k && k <= arr[right]) 
                {
                    left = mid + 1;
                } 
                else
                {
                    right = mid - 1;
                }
            }
        }
        
        return -1; 
    }

    public static void main(String[] args) 
    {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        
        int k = 0;
        
        int index = search(arr, k);
        
        if(index != -1) 
        {
            System.out.println("Element " + k + " found at index " + index);
        } 
        else 
        {
            System.out.println("Element " + k + " not found in the array.");
        }
    }
}

