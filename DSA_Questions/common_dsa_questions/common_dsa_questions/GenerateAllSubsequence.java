package common_dsa_questions;

public class GenerateAllSubsequence {

	public static void main(String[] args) {

		String str = "abcd";

		generateAllSubsequence(str, "");

	}

	private static void generateAllSubsequence(String str, String current) {

		System.out.println(current);

        for (int i = 0; i < str.length(); i++) {
        	generateAllSubsequence(str.substring(i + 1), current + str.charAt(i));
        }
	}

}
