package common_dsa_questions;

public class CheckIfNumbersAreAscendingInaSentence {

	public static void main(String[] args) {
		
		String s1 = "1 box has 3 blue 4 red 6 green and 12 yellow marbles";
        System.out.println(areNumbersIncreasing(s1)); 
        
        String s2 = "hello world 5 x 5";
        System.out.println(areNumbersIncreasing(s2)); 
	}

	private static boolean areNumbersIncreasing(String s) {
		String[] tokens = s.split(" ");
        int prevNumber = Integer.MIN_VALUE;

        for (String token : tokens) {
            if (isNumber(token)) {
                int number = Integer.parseInt(token);
                if (number <= prevNumber) {
                    return false;
                }
                prevNumber = number;
            }
        }

        return true;
	}

	private static boolean isNumber(String s) {
		return s.matches("\\d+");
	}

}
