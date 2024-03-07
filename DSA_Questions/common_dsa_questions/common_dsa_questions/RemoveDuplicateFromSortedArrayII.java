package common_dsa_questions;

public class RemoveDuplicateFromSortedArrayII {
	
	public static void main(String[] args) {
		
		//int[] arr = {1,1,1,2,2,3};
		
		int[] arr = {0,0,1,1,1,1,2,3,3};
		
		if(arr.length == 0)
        {
            System.out.println(0);
        }

        int unique =0;

        for(int num : arr)
        {
           if(unique < 2 || num != arr[unique -1] || num != arr[unique -2])
           {
               arr[unique++] = num;
           }
        }


        System.out.println(unique);
	}

}
