package common_dsa_questions;

import java.util.*;

public class FixedPointFinder {

	public static void main(String[] args) {
		
		//List<Integer> arr = List.of(-6, 0, 2, 40);
		
		List<Integer> arr = List.of(1, 5, 7, 8);

		System.out.println(findFixedPoint(arr));
	}

	private static int findFixedPoint(List<Integer> arr) {
		
		int left = 0;
        int right = arr.size() - 1;

        while(left <= right) 
        {
            int mid = left + (right - left) / 2;
            
            int value = arr.get(mid);

            if(value == mid) 
            {
                return value;
            } 
            else if(value < mid) 
            {
                left = mid + 1;
            } 
            else
            {
                right = mid - 1;
            }
        }

        return -1;
	}

}
