package common_dsa_questions;

public class FaultyDirection {

	public static void main(String[] args) {
		
		//String[] str = {"R","L","R","U","D"};
		
		String[] str = {"L","R","U","D"};
		
		int n = str.length;
		
		System.out.println(falutyDirection(n,str));
		
		

	}

	private static String falutyDirection(int n, String[] str) {
		
		int x = 0;
        int y = 0;
        for (int i = 0; i < n; i++) {
            String c = str[i];
            switch (c) {
                case "L":
                    x--;
                    break;
                case "D":
                    y--;
                    break;
                case "R":
                    x++;
                    break;
                case "U":
                    y++;
                    break;
                default:
                    break;
            }
        }
        if (x == 0 && y == 0) {
            return "Yes";
        }
        return "No";
	}

}
