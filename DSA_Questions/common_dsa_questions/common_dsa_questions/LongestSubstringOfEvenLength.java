package common_dsa_questions;

public class LongestSubstringOfEvenLength {

	public static void main(String[] args) {
		
		// String str = "1241424";
	
		String str = "6693581";
		
		int n = str.length();
		
		int maxLength = 0;

        for(int length=2; length<=n; length += 2) 
        {
            for(int start=0; start<=n-length; start++) 
            {
                int mid = start + length / 2;
                int leftSum = 0;
                int rightSum = 0;

                
                for(int i=0; i<length / 2; i++) 
                {
                    leftSum += str.charAt(start + i) - '0';
                    rightSum += str.charAt(mid + i) - '0';
                }

                if(leftSum == rightSum) 
                {
                    maxLength = length;
                }
            }
        }

        System.out.println(maxLength);
	}

}
