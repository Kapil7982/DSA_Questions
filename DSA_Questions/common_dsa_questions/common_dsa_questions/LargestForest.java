package common_dsa_questions;

public class LargestForest{
    
    public static void main(String[] args) 
    {
        int n = 5; 
        
        char[][] mat = {
            {'T', 'T', 'T', 'W', 'W'},
            {'T', 'W', 'W', 'T', 'T'},
            {'T', 'W', 'W', 'T', 'T'},
            {'T', 'W', 'T', 'T', 'T'},
            {'W', 'W', 'T', 'T', 'T'}
        };
        
        System.out.println(largestForest(n, mat));
    }
    
    public static int largestForest(int n, char[][] mat) 
    {
        int largest = 0;
        
        boolean[][] flag = new boolean[n][n];
        
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++) 
            {
                if(mat[i][j] == 'T' && !flag[i][j]) 
                {
                    int current = check(mat, flag, i, j, n);
                    largest = Math.max(largest, current);
                }
            }
        }
        
        return largest;
    }
    
    public static int check(char[][] mat, boolean[][] flag, int i, int j, int n) 
    {
        if(i<0 || i>=n || j<0 || j>=n || mat[i][j] == 'W' || flag[i][j]) 
        {
            return 0;
        }
        
        flag[i][j] = true;
        int size = 1;
        
        size += check(mat, flag, i + 1, j, n);
        size += check(mat, flag, i - 1, j, n);
        size += check(mat, flag, i, j + 1, n);
        size += check(mat, flag, i, j - 1, n);
        
        return size;
    }
}
