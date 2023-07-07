package common_dsa_questions;

public class LongQueue {

	public static void main(String[] args) {
		
		int[] arr = {1,2,4,3,5,8};
		
		int n = arr.length;
		
		
		longQueue(n,arr);
	}

	private static void longQueue(int n, int[] arr) {
		
		  int count = 1;
	      for(int i=1; i<n;  i++)
	      {
	          if(arr[i]<arr[i-1])
	          {
	              count++;
	          }
	      }
	      System.out.println(count);
		
	}

}
