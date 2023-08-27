package common_dsa_questions;

public class LandAndFire {

	public static void main(String[] args) {
		
		
		//int[] arr = {1, 1};
		
		//int n = arr.length;
		
		//int[] arr = {1, 0, 1, 0, 1};
		
		//int n = arr.length;
		
		int[] arr = {1, 0, 1, 1};
		
		int n = arr.length;


		int count=0, local=0, local1=0;
        
        for(int j=0; j<n; j++)
        {
            
            if(arr[j]==0)
            {
                count++;
                local=j;
            }
            else if(local==0)
            {
                local1=j;
            }
        }
        if(count==0)
        {
          System.out.println(0);
        }
        else if (count==1) 
        {  
          System.out.println(2);
        }
        else 
        {
          System.out.println(local+1-local1);
        }
	}

}
