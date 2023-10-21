package common_dsa_questions;

public class WordSearch {

	public static void main(String[] args) {
		
		int n = 3;
		int m = 4;
		
		
		char[][] ch = {
		{'A', 'B', 'C', 'E'},
		
		{'S', 'F', 'C', 'S'},
		
		{'A', 'D', 'E', 'E'}
		
		};
		
		//String str = "ABCCED";
		
		//String str = "SEE";
		
		String str = "ABCB";
		
       boolean res = check(ch, str);
        
        if(res) 
        {
            System.out.println("YES");
        } 
        else 
        {
            System.out.println("NO");
        }
	}
	
	public static boolean check(char[][] ch, String word) 
    {
        int r = ch.length;
        int c = ch[0].length;
        
        for(int i=0; i<r; i++) 
        {
            for(int j=0; j<c; j++)
            {
                if(ch[i][j] == word.charAt(0)) 
                {
                    if(dfs(ch, word, i, j, 0)) 
                    {
                        return true;
                    }
                }
            }
        }
        
        return false;
    }
    
    public static boolean dfs(char[][] ch, String word, int i, int j, int in) 
    {
        if(in == word.length()) 
        {
            return true;
        }
        
        if(i < 0 || j < 0 || i >= ch.length || j >= ch[0].length || ch[i][j] != word.charAt(in)) 
        {
            return false;
        }
        
        char temp = ch[i][j];
        
        ch[i][j] = '#'; 
        
        boolean found = dfs(ch, word, i + 1, j, in + 1)
                        || dfs(ch, word, i - 1, j, in + 1)
                        || dfs(ch, word, i, j + 1, in + 1)
                        || dfs(ch, word, i, j - 1, in + 1);
        
        ch[i][j] = temp; 
        
        return found;
    }

}
