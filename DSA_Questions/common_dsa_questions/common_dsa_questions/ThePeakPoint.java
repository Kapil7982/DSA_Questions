package common_dsa_questions;

public class ThePeakPoint {

	public static void main(String[] args) {
		
		//int[] arr = {10, 20, 11};
		
		int[] arr = {1,3,6,5,4};
		
		int n = arr.length;
		
        int i=0,j=n-1;
        
        while(i<j)
        {
            int m=i+(j-i)/2;
            
            if(arr[m]<arr[m+1])
            {
                  i=m+1;
                
            }
            else
            {
                j=m;
            }

        }
        System.out.println(i);
	}

}
