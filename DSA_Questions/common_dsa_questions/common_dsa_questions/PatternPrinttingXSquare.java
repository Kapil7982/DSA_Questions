package common_dsa_questions;

public class PatternPrinttingXSquare {

	public static void main(String[] args) {
		
		//int n = 7;
		
		int n = 3;
		
		patternPrinttingXSquare(n);
	}

	private static void patternPrinttingXSquare(int n) {
		
		for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++) 
            {
                if(i == 0 || i == n - 1 || j == 0 || j == n - 1 || i == j || i == n - 1 - j)             
                    System.out.print("* ");         
                else
                    System.out.print("  ");
                  
            }
      
            System.out.println();
        }
		
	}

}
