package common_dsa_questions;

public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {
    	
        if (nums.length == 0) {
            return 0;
        }
        
        int uniqueCount = 1;
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueCount - 1]) {
                nums[uniqueCount] = nums[i];
                uniqueCount++;
            }
        }
        
        return uniqueCount;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int uniqueCount = removeDuplicates(nums);
        
        System.out.println(uniqueCount);
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(nums[i]);
            if (i < uniqueCount - 1) {
                System.out.print(", ");
            }
        }
        
    }
}
