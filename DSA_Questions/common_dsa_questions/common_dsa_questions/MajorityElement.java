package common_dsa_questions;

public class MajorityElement {

	public static void main(String[] args) {
		
		//int[] arr = {1,1,1,1,2,3};
		
		int[] arr = {1,1,2,2,3};
		
		int n= arr.length;
		
		int count=0;
        int max=0;
        for(int i=0; i<n; i++)
        {
            if(count==0)
            {
                max = arr[i];
            }
            if(arr[i]==max)
            {
                count++;
            }
            else
            {
                count--;
            }
        }
        count=0;
        for(int j=0; j<n; j++)
        {
            if(arr[j]==max)
            {
                count++;
            }
        }
        if(count> n/2)
        {
           System.out.println(max);
        }
        System.out.println(-1);
	}
}
