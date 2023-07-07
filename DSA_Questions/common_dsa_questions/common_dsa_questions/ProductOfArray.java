package common_dsa_questions;

public class ProductOfArray {

	public static void main(String[] args) {
		
		//int[] arr = {1,2,3,4,5};
		
		int[] arr = {3,2,7};
		
		
		int n = arr.length;
        
        int[] ans=new int[n];
        
        int product=1;
        
        for(int i=0; i<n; i++)
        {
            ans[i]=product;
            product*=arr[i];
        }
        
        product=1;
        for(int i=n-1; i>=0; i--)
        {
            ans[i]*=product;
            product*=arr[i];
        }
        
        for(int bag:ans)
        {
            System.out.print(bag+" ");
        }
        System.out.println();

	}

}
