package common_dsa_questions;

public class FollowTheKnight {

	public static void main(String[] args) {
		
		int x=3;
		int y= 3;
		int n = 1;
		
		followTheKnight (arr ,x,y,n);
        System.out.println(count());
	}
	
	private static int count() {
		int count = 0;
	       for(int i=0 ; i<10; i++)
	       {
	          for (int j=0; j<10; j++)
	          
	          if(arr[i][j] == 1)
	          {
	              count++;
	          }
	       }
	          return count;
	}

	private static void followTheKnight(int[][] arr2, int l, int m, int n) {
		
		if(l<0 || l>9 || m<0 || m>9)
	        return;
	        
	        if(n==0)
	        {
	            arr[l][m] = 1;
	            return ;
	        }
	         followTheKnight(arr , l-1, m+2, n-1);
	         followTheKnight(arr , l-1, m-2, n-1); 
	         followTheKnight(arr , l+1, m+2, n-1);
	         followTheKnight(arr , l+1, m-2, n-1);
	         followTheKnight(arr , l+2, m+1, n-1);
	         followTheKnight(arr , l+2, m-1, n-1);
	         followTheKnight(arr , l-2, m+1, n-1);
	         followTheKnight(arr , l-2, m-1, n-1);
	}

	static int [][] arr = new int[10][10];

}
