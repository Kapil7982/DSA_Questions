package common_dsa_questions;

public class PrintInvertedAsteriskPyramid {

	public static void main(String[] args) {
		
		int n = 8;
		
		printInvertedAsteriskPyramid(n);

	}

	private static void printInvertedAsteriskPyramid(int n) {
		
		    for (int i = n; i >= 1; i--) {
		        for (int j = 1; j <= n - i; j++) {
		            System.out.print(" ");
		        }
		        for (int j = 1; j <= 2 * i - 1; j++) {
		            System.out.print("*");
		        }
		        System.out.println();
		    }
		}

	}


