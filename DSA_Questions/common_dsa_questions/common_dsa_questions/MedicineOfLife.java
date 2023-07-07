package common_dsa_questions;

public class MedicineOfLife {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		int n = arr.length;
		
		//int k= 7;
		
		int k = 12;
		
		Boolean x=medicineOfLife(n,k,arr);
		
	    if(x==true)
	      {
	         System.out.println("Possible");
	      }     
	     else
	      {
	         System.out.println("Impossible");
	      }

	}

	private static boolean medicineOfLife(int n, int k, int[] arr) {
		
		int l=0;
	       int r=n-1;
	       while(l<r)
	       {
	           int sum=arr[l]+arr[r];
	           if(sum==k)
	           {
	               l++;
	               r--;
	               return true;
	           }
	           
	           else if(sum<k)
	           {
	               l++;
	           }
	           
	           else
	           {
	              r--; 
	           }
	       }
	       
	       return false;
	}

}
