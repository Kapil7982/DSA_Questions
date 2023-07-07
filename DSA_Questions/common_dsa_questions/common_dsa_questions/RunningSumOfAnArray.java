package common_dsa_questions;

public class RunningSumOfAnArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		int n = arr.length;
		
		int sum=0;
        StringBuilder bag = new StringBuilder("");
        
        for (int i=0; i<n; i++)
        {
           sum += arr[i];
           bag.append(sum+" ");
           
           
        }
        System.out.println(bag);
	}

}
