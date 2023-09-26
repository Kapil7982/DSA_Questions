package common_dsa_questions;

public class CartTotal {

	public static void main(String[] args) {
		
		int[] price = {100, 20, 40};
		
		int[] quantity = {2, 1, 2};
		
		int n = price.length;
		
		int total =0;
		
		
		for(int i=0; i<n; i++)
		{
			total += price[i]*quantity[i];
		}
		System.out.println(total);
	}
	
}
