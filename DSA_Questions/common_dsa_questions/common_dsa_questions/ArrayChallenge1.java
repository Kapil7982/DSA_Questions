package common_dsa_questions;

public class ArrayChallenge1 {

	public static void main(String[] args) {
		
		int arr[] =  {5, 3, 1, 9, 7, 3, 4, 1};
		
		System.out.println(arrayChallenage(arr));
	}

	private static String arrayChallenage(int[] arr) {
		
        StringBuilder result = new StringBuilder();
        
        
        for(int i=0; i<arr.length; i++) 
        {
            int nearestSmaller = -1; 
            
            
            for(int j=i-1; j>=0; j--) 
            {
                if(arr[j] <= arr[i]) 
                { 
                    nearestSmaller = arr[j]; 
                    break; 
                }
            }
            
            result.append(nearestSmaller).append(" ");
        }
        
        return result.toString();
	}

}
