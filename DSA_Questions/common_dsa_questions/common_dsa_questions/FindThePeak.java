package common_dsa_questions;

public class FindThePeak {

	public static void main(String[] args) {
		
		//int[] arr = {1,2,1,2};
		
		//int[] arr = {2,2};
		
		int[] arr = {4};
		int n = arr.length;
		
		int i = 0;
        int j = n-1;

        while(i<j)
        {

            int m = i+(j - i)/2;

            if(arr[m] > arr[m+1])
            {
                j=m;
            }
            else
            {
                i = m+1;
            }
        }

        System.out.println(i);
	}
}
