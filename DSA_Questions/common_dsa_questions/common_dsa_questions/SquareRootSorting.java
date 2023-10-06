package common_dsa_questions;

public class SquareRootSorting {

	public static void main(String[] args) {
		
		
//		int[] arr = {4, 9, 1};
//		
//		int n = arr.length;
		
		int[] arr = {8, 4, 5, 11, 9};
		int n = arr.length;
		sort(arr);
        squareRootSorting(arr);
	}

	private static void squareRootSorting(int[] arr) {
		
		for(int i=0; i<arr.length; i++) 
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
	}

	private static void sort(int[] arr) {
		
		for(int i=0; i<arr.length-1; i++) 
        {
            for(int j=0; j<arr.length-i-1; j++) 
            {
                int sqrt = (int) Math.sqrt(Math.abs(arr[j]));
                
                int sqrt1 = (int) Math.sqrt(Math.abs(arr[j + 1]));
                
                if(sqrt>sqrt1) 
                {
                    
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                } 
                else if(sqrt == sqrt1 && arr[j] > arr[j + 1]) 
                {
        
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
		
	}

}
