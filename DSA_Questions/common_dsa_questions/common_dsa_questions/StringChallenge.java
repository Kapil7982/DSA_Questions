package common_dsa_questions;

import java.util.HashSet;
import java.util.Set;

public class StringChallenge {

	public static void main(String[] args) {
		String str = "2hell603 wor6l7d2";
		String str1 = "hell268 w6or2l4d";
		System.out.println(stringChallenge(str));
		System.out.println(stringChallenge(str1));

	}

	private static String stringChallenge(String str) {
		
		String[] words = str.split("\\s+");
        for (String word : words) {
            Set<Character> uniqueDigits = new HashSet<>();
            for (char c : word.toCharArray()) {
                if (Character.isDigit(c)) {
                    uniqueDigits.add(c);
                }
            }
            if (uniqueDigits.size() != 3) {
                return "false";
            }
        }
        return "true";
		
	}

}
