package common_dsa_questions;

public class ProductOfArrayExceptItself {

	public static void main(String[] args) {
		
		//int[] arr = {1,2,3,4};
		
		int[] arr = {-1,1,0,3,-3};
		
		int n = arr.length;
		
		int[] arr1 = productOfArrayExceptItself(n,arr);
        
        StringBuilder bag = new StringBuilder();
    
        for(int x:arr1)
        {
            bag.append(x+" ");
        }
        System.out.println(bag);

	}

	private static int[] productOfArrayExceptItself(int n, int[] arr) {
		
        int[] arr1 = new int[n];
        
        arr1[0]=1;
        
        for(int i=1; i<n; i++) 
        {
            arr1[i]= arr1[i-1]*arr[i-1];
        }
        
        int pro=1;
        for(int i=n-1; i>=0; i--)
        {
            arr1[i]*=pro;
            pro*=arr[i];
        }  
        return arr1;
         
	}

}
