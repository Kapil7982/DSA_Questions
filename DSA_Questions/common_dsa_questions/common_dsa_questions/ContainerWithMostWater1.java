class Solution {

    static class Result {
        int maxArea;
        int leftIndex;
        int leftHeight;
        int rightIndex;
        int rightHeight;

        Result(int maxArea, int leftIndex, int leftHeight, int rightIndex, int rightHeight) {
            this.maxArea = maxArea;
            this.leftIndex = leftIndex;
            this.leftHeight = leftHeight;
            this.rightIndex = rightIndex;
            this.rightHeight = rightHeight;
        }
    }

    public Result maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;

        int maxArea = 0;
        int bestL = left, bestR = right;

        int step = 1;

        System.out.println("Input heights: ");
        for (int i = 0; i < height.length; i++) {
            System.out.printf("i=%d h=%d  ", i, height[i]);
        }
        System.out.println("\n\nStarting two-pointer process...\n");

        while (left < right) {
            int width = right - left;
            int minHeight = Math.min(height[left], height[right]);
            int area = width * minHeight;

            if (area > maxArea) {
                maxArea = area;
                bestL = left;
                bestR = right;
            }

            if (height[left] < height[right]) {
                left++;
            } else if (height[left] > height[right]) {
                right--;
            } else {
                left++;
                right--;
            }

            step++;
        }

        System.out.println("Finished.");

        return new Result(maxArea, bestL, height[bestL], bestR, height[bestR]);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] height = {1,8,6,2,5,4,8,3,7};

        Result r = s.maxArea(height);

        System.out.println("\nOUTPUT:");
        System.out.println("Max Area = " + r.maxArea);
        System.out.println("Left index = " + r.leftIndex + " (Height=" + r.leftHeight + ")");
        System.out.println("Right index = " + r.rightIndex + " (Height=" + r.rightHeight + ")");
    }
}
