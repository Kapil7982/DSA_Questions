package common_dsa_questions;

public class FindDiscount {

	public static void main(String[] args) {
		
		//int[] arr = {8,4,6,2,3};
		
		//int[] arr = {1,2,3,4,5};
		
		int[] arr = {10,1,1,6};
		
		
		int n = arr.length;
		
		int[] output = findDiscount(n,arr);
        
        for(int i=0; i<n; i++) 
        {
            System.out.print(output[i] + " ");
        }
        System.out.println();

	}

	private static int[] findDiscount(int n, int[] arr) {
		
		int[] output = new int[n];

        for(int i=0; i<n; i++) 
        {
            int discount = 0;
            
            for(int j=i+1; j<n; j++) 
            {
                if(arr[j] <= arr[i]) 
                {
                    discount = arr[j];
                    break;
                }
            }
            output[i] = arr[i] - discount;
        }

        return output;
	}

}
