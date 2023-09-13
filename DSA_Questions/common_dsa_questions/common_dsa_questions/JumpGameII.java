package common_dsa_questions;

public class JumpGameII {

	public static void main(String[] args) {
		
//		int[] arr = {2,3,1,4,4};
//		
//		int n = arr.length;
		
        int[] arr = {2,3,0,1,4};
		
		int n = arr.length;
		
		System.out.println(jumpGameII(n,arr));

	}

	private static int jumpGameII(int n, int[] arr) {
		
        int[] mat = new int[n];
        
        mat[n - 1] = 0;

        for(int i=n-2; i>=0; i--) 
        {
            mat[i] = Integer.MAX_VALUE;
            for(int j=1; j<=arr[i] && i + j<n; j++) 
            {
                if(mat[i + j] != Integer.MAX_VALUE) 
                {
                    mat[i] = Math.min(mat[i], 1 + mat[i + j]);
                }
            }
        }

        return mat[0];
	}

}
