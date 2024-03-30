package common_dsa_questions;

import java.util.List;

public class FindAFixedPoint {

	public static void main(String[] args) {
		
		List<Integer> arr1 = List.of(-6, 0, 2, 40);
        List<Integer> arr2 = List.of(1, 5, 7, 8);
        
        System.out.println(findAFixedPoint(arr1)); // Output: 2
        System.out.println(findAFixedPoint(arr2)); 
	}

	public static int findAFixedPoint(List<Integer> arr) {
        int left = 0;
        int right = arr.size() - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr.get(mid) == mid) {
                return mid;
            } else if (arr.get(mid) < mid) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return -1;
    }

}
