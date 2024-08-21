package common_dsa_questions;

import java.util.Arrays;

public class MinimumNumberOfPushesToTypeWordII {

	public static void main(String[] args) {
		
		//String word = "abcde";
		
		String word = "aabbccddeeffgghhiiiiii";
		
		System.out.println(minimumPushes((word)));
	}

	private static int minimumPushes(String word) {
		
		int[] freq = new int[26];

        for(char c : word.toCharArray())
         {
            freq[c - 'a']++;
        }

        Arrays.sort(freq);

        int totalPushes = 0;
        int pushFactor = 1;
        int lettersAssigned = 0;

        for(int i=25; i>= 0 && freq[i] > 0; i--) 
        {
            totalPushes += freq[i] * pushFactor;
            lettersAssigned++;
            if(lettersAssigned % 8 == 0) 
            { 
                pushFactor++;
            }
        }

        return totalPushes;
	}

}
