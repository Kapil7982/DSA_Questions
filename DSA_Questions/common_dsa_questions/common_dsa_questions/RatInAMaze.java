package common_dsa_questions;

public class RatInAMaze {

	public static void main(String[] args) {
		
		int[][] mat = {{1,0,0,0},
				{1,1,0,1},
				{1,1,0,0},
				{0,1,1,1}
		};
		
		int n = mat.length;
		
		ratInAMaze(mat,0,0,"");
        if(flag == false) System.out.println(-1);

	}
	
	public static boolean flag = false;

	private static void ratInAMaze(int[][] mat, int n, int m, String res) {
		
		if(n<0 || n>= mat.length || m<0 || m>=mat.length || mat[n][m]==0)
        {
            return;
        }
        if(n == mat.length-1 && m == mat.length-1)
        {
            System.out.print(res.toString()+" ");
            flag = true;
            return;
        }
        
        mat[n][m] = 0;
        ratInAMaze(mat,n+1,m,res + "D");
        ratInAMaze(mat,n,m-1,res + "L");
        ratInAMaze(mat,n,m+1,res + "R");
        ratInAMaze(mat,n-1,m,res + "U");
    
        mat[n][m] = 1;
        return;
	}

}
