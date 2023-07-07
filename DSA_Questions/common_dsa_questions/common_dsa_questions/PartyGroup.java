package common_dsa_questions;

public class PartyGroup {

	public static void main(String[] args) {


		int[] arr = {-1, 1, 2, 1, 2};
		
		int n = arr.length;
		
		int max=1;
		
		
		for(int i=1; i<=n; i++)
		{
			 int count=0;
			 
			 int found=i;
			 
			 while(found != -1)
			 {
				 found = arr[found];
				 count++;
			 }
			 
			 max = Math.max(max, count);
		}
		
		System.out.println(max);

	}

}
