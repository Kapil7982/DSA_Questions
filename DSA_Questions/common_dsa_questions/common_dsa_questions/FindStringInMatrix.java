package common_dsa_questions;

public class FindStringInMatrix {

	public static void main(String[] args) {
		
		int n = 3;
		
		int m = 4;
		
		String str = "ab";
		
		char[][] matrix = {
				{'a','b','a','d'},
				{'e','a','k','g'},
				{'a','b','g','h'}	
		};
		
        int count=0;
        
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                if(j+str.length()-1 <m)
                {
                    count+= check(matrix, i, j, str, true);
                }
                
                if(i+str.length() -1 <n)
                {
                    count+= check(matrix, i, j, str, false);
                }
            }
        }
        System.out.println(count);

	}

	private static int check(char[][] matrix, int i, int j, String str, boolean flag) {
		
        int k=0; 
        
        while(k< str.length())
        {
            if(matrix[i][j] != str.charAt(k))
            {
                return 0;
            }
            k++;
            if(flag)
            {
                j++;
            }
            else
            {
                i++;
            }
        }
        return 1;
	}

}
