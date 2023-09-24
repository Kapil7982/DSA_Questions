package common_dsa_questions;

public class OneStationToAnother {

	public static void main(String[] args) {
		
		
		
//		int[] arr = {47, 63, 41, 40};
//		
//		int s = 41,  d = 40;
		
//		int[] arr = {19, 32, 7, 3};
//		
//		int s = 19 , d = 7;
		
		
		int[] arr = {67, 2, 18};
		
		int s = 2 , d = 18;
		
		
		System.out.println(oneSationToAnother(arr, s, d));

	}

	private static int oneSationToAnother(int[] arr, int s, int d) {
		
		int si = -1;
        int di = -1;

        for(int i=0; i<arr.length; i++) 
        {
            if(arr[i] == s) 
            {
                si = i;
            }
            if(arr[i] == d) 
            {
                di = i;
            }
        }

        int distance = Math.abs(si - di) * 5;
        return distance * 7;
	}

}
