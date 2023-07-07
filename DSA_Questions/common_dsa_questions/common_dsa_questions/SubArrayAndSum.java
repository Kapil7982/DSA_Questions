package common_dsa_questions;

public class SubArrayAndSum {

	public static void main(String[] args) {

		int[] arr = {2,3,4,6};
		
		int n = arr.length;
		
		int k = 3;
		
		System.out.println(subArrayAndSum(n,k,arr));
	}

	private static int subArrayAndSum(int n, int k, int[] arr) {
		
		for(int i=0;i<n;i++)
        {
            int N=arr.length-i;
            int count=0;
            int sum=0;
            for(int j=0;j<N;j++)
            {
                sum+=arr[j];
            }
            
            if(sum%k!=0)
            count++;
            
             for(int j=N;j<n;j++)
            {
                sum+=arr[j];
                sum -=arr[j-N];
                
                if(sum%k!=0)
                count++;
            
            }
            
            if(count>0)
            {
                return count;
            }
            
        }
        return 0;
	}

}
