package common_dsa_questions;

public class SpirallyTraversingAMatrix {

	public static void main(String[] args) {
		
		int n = 4;
		
		
		int[][] arr = {
				
		{1, 2, 3, 4},
		
		{5 ,6 ,7, 8},
		
		{1, 2, 3, 4},
		{5 ,6 ,7 ,8}
		

	};
		
		spirallyMatrixTraversal(n,arr);
		
	}

	private static void spirallyMatrixTraversal(int n, int[][] arr) {
		
		   int t=0;
	       int l=0;
	       int r=arr.length-1;
	       int b=arr.length-1;
	        StringBuilder bag = new StringBuilder("");
	       int count=0;
	       
	       while(count<n*n)
	       {
	           for(int i=l;i<=r &&count<n*n;i++)
	           {
	               bag.append(arr[t][i]+" ");
	               count++;
	           }
	           t++;
	           
	           for(int i=t;i<=b &&count<n*n;i++)
	           {
	               bag.append(arr[i][r]+" ");
	               count++;
	           }
	           r--;
	           
	           for(int i=r;i>=l &&count<n*n;i--)
	           {
	               bag.append(arr[b][i]+" ");
	               count++;
	           }
	           b--;
	           
	           
	            for(int i=b;i>=t &&count<n*n;i--)
	           {
	               bag.append(arr[i][l]+" ");
	               count++;
	           }
	           l++;
	           
	           
	       }
	       System.out.print(bag);
	        
		
	}

}
