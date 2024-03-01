package common_dsa_questions;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		
		int a = 12;
		
		int b = 16;
		
		System.out.println("A before swapping :- "+a);
		System.out.println("B before swapping :- "+b);
		
		a = a^b;
		b = a^b;
		a = a^b;
		
		System.out.println("A after swapping :- "+a);
		System.out.println("B after swapping :- "+b);
		
		
	}
}
