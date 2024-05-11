package common_dsa_questions;

import java.util.Arrays;
import java.util.Comparator;

public class FindRightInterval {

	public static void main(String[] args) {
		
		int[][] intervals1 = {{1, 2}};
        System.out.println(Arrays.toString(findRightInterval(intervals1))); 

        int[][] intervals2 = {{3, 4}, {2, 3}, {1, 2}};
        System.out.println(Arrays.toString(findRightInterval(intervals2)));

        int[][] intervals3 = {{1, 4}, {2, 3}, {3, 4}};
        System.out.println(Arrays.toString(findRightInterval(intervals3))); 
   
	}

	private static int[] findRightInterval(int[][] intervals) {
		
		int n = intervals.length;
        int[] result = new int[n];
        Arrays.fill(result, -1);

        
        int[][] intervalsWithIndex = new int[n][3];
        for (int i = 0; i < n; i++) {
            intervalsWithIndex[i][0] = intervals[i][0];
            intervalsWithIndex[i][1] = intervals[i][1];
            intervalsWithIndex[i][2] = i; // store the original index
        }

        Arrays.sort(intervalsWithIndex, Comparator.comparingInt(a -> a[0]));

        for (int i = 0; i < n; i++) {
            int target = intervals[i][1];
            int left = 0, right = n - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (intervalsWithIndex[mid][0] >= target) {
                    result[i] = intervalsWithIndex[mid][2];
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }

        return result;
	}

}
