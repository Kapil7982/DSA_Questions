package common_dsa_questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {

		int[] nums = {1, 3, 3, 4};
        int k = 5;
        int[] result = TwoSum(nums, k);
        System.out.println(Arrays.toString(result));

	}

	private static int[] TwoSum(int[] nums, int k) {
		
		Map<Integer, Integer> map = new HashMap<>();
		
        for(int i = 0; i < nums.length; i++) 
        {
            int sum = k - nums[i];
            
            if(map.containsKey(sum) && map.get(sum) != i) 
            {
                return new int[] {i, map.get(sum)};
            }
            map.put(nums[i], i);
        }
        return new int[0];
	}

}
