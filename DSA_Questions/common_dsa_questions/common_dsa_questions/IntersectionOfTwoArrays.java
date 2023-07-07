package common_dsa_questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        
        System.out.println(Arrays.toString(intersectionOfTwoArrays(nums1,nums2)));
	}

	private static int[] intersectionOfTwoArrays(int[] nums1, int[] nums2) {
		
		Set<Integer> set = new HashSet<>();
		
        for(int num : nums1) 
        {
            set.add(num);
        }
        
        Set<Integer> set1 = new HashSet<>();
        
        for(int num : nums2) 
        {
            if(set.contains(num)) {
                set1.add(num);
            }
        }
        
        int[] res = new int[set1.size()];
        
        int i = 0;
        
        for(int num : set1) 
        {
            res[i++] = num;
        }
        
        return res;
	}

}
