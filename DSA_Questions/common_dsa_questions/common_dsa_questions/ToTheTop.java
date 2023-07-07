package common_dsa_questions;


public class ToTheTop {

	public static void main(String[] args) {
		
		int[] arr = {3,2,1,0,4};
		
		int n = arr.length;
		
         int count = 0;
        
        for(int i=0; i<n; i++) 
        {
            if(i>count) 
            {
                System.out.println("NO");
            }
            count = Math.max(count, i + arr[i]);
        }
        System.out.println("YES");
	}

}
