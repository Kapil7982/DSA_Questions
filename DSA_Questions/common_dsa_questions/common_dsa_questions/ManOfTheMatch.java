package common_dsa_questions;

public class ManOfTheMatch {

	public static void main(String[] args) {
		
		
//		int n = 2;
//				
//		int[] arr = {1, 2, 0, 0, 1, 1, 6, 6, 4, 1, 6, 1};
		
//		int n =3;
//				
//		int[] arr = {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 6, 6, 6, 1, 4, 4};
////				
//		}
		int n =1;
				
		int[] arr = {0, 1, 0, 1, 0, 0};
		
		int ab = 0;
        int virat = 0;
        boolean abStrike = true;
        int ballCount = 0;

        for(int j=0; j<6*n; j++) 
        {
            if(abStrike) 
            {
                ab += arr[j];
            } 
            else 
            {
                virat += arr[j];
            }
            
            ballCount++;
             
            if(ballCount % 6 == 0 && ballCount != 0) 
            {
                abStrike = !abStrike;
            }

            if(arr[j] == 1 || arr[j] == 3) 
            {
                abStrike = !abStrike;
            }
        }

        if(ab > virat) 
        {
            System.out.println("AB de Villiers");
        } 
        else if(ab < virat) 
        {
            System.out.println("Virat Kohli");
        } 
        else 
        {
            System.out.println("Tie");
        }

	}

}
