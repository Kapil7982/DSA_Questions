package common_dsa_questions;

public class KillEnemies {

	public static void main(String[] args) {
		
		//int[] arr = {1,2,3,1};
		
		int[] arr = {2,7,9,3,1};
		
		int n = arr.length;
		
		int sum=arr[0]; 
        int count=0;
        
        for(int i=1; i<n; i++)
        {
            int nSum= count+arr[i];
            int ncount = Math.max(sum,count);
            
            sum = nSum;
            count= ncount;
        }
        
        int sol = Math.max(sum,count);
        System.out.println(sol);
	}
}
