package common_dsa_questions;

public class FlowerManagement {

	public static void main(String[] args) {
		
		int[] arr = {1,0,0,0,1};
		
		int n = arr.length;
		
		int m = 1;
		
		boolean result = flowerManagement(arr, n, m);
        
        if(result) 
        {
            System.out.println("Yes");
        } 
        else 
        {
            System.out.println("No");
        }

	}

	private static boolean flowerManagement(int[] arr, int n, int m) {
		
        int count = 0;
        
        for(int i=0; i<n; i++) 
        {
            if(arr[i] == 0) 
            {
               
                boolean prevEmpty = (i == 0) || (i > 0 && arr[i - 1] == 0);
                
                boolean nextEmpty = (i == n - 1) || (i < n - 1 && arr[i + 1] == 0);
                
                if (prevEmpty && nextEmpty) 
                {
                    arr[i] = 1; 
                    count++;
                }
            }
	}
        return count >= m;

	}
}
