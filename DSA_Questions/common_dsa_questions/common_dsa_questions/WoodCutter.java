package common_dsa_questions;

public class WoodCutter {

	public static void main(String[] args) {
		
		int n = 4;
		
		int m = 7;
		
		int[] heights = {20, 15, 10, 17};
		
		int left = 0;
        int right = 1_000_000_000; 
        int maxHeight = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long woodCut = 0; 
            
            for (int height : heights) {
                woodCut += Math.max(0, height - mid);
            }

            
            if (woodCut >= m) {
                maxHeight = mid;
                left = mid + 1; 
            } else {
                right = mid - 1; 
            }
        }

        System.out.println(maxHeight);
	}
}
