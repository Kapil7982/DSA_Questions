package common_dsa_questions;

public class NumberOfOccurencesInLogN {

	public static void main(String[] args) {
		
		int n = 6;
		int k = 3;
		
		int[] arr = {2, 3, 3, 3, 6, 9};
		
		int first = binarySearchFirst(arr,k);
        int last = binarySearchLast(arr,k);
        
        int count=0;
        if(first != -1 && last != -1)
        {
            count = last - first +1;
        }
        System.out.println(count);

	}

	public static int binarySearchLast(int[] arr, int k)
    {
        int left =0;
        int right = arr.length-1;
        int res = -1;
        
        while(left <= right)
        {
            int mid = left + (right -left)/2;
            
            if(arr[mid] == k)
            {
                res = mid;
                left = mid+1;
            }
            else if(arr[mid] < k)
            {
                left = mid + 1;
            }
            else
            {
                right = mid -1;
            }
        }
        
        return res;
    }

	public static int binarySearchFirst(int[] arr, int k)
    {
        int left =0;
        int right = arr.length-1;
        int res = -1;
        
        while(left <= right)
        {
            int mid = left + (right -left)/2;
            
            if(arr[mid] == k)
            {
                res = mid;
                right = mid-1;
            }
            else if(arr[mid] < k)
            {
                left = mid + 1;
            }
            else
            {
                right = mid -1;
            }
        }
        
        return res;
    }

}
