package common_dsa_questions;

public class SprialTraversalRectangularMatrix {

	public static void main(String[] args) {
		
		int[][] arr = {
						{1,2,3,4},
						{5,6,7,8},
						{9,10,11,12}
			          };
		
		int n = 3;
		int m = 4;
		
		int t=0,l=0,r=n-1,b=m-1;
        
        int count=0;
        int total=n*m;
        
        while(count<total)
        {
            for(int i=t,j=l;i<=r&&count<total;i++)
            {
                System.out.print(arr[i][j]+" ");
                count++;
            }
            l++;
            
            for(int i=r,j=l;j<=b&&count<total;j++)
            {
                System.out.print(arr[i][j]+" ");
                count++;
            }
            r--;
            
            for(int i=r,j=b;i>=t&&count<total;i--){
                System.out.print(arr[i][j]+" ");
                count++;
            }
            b--;
            
            for(int i=t,j=b;j>=l&&count<total;j--){
                System.out.print(arr[i][j]+" ");
                count++;
            }
            t++;
        }
        System.out.println();

		
		

	}

}
