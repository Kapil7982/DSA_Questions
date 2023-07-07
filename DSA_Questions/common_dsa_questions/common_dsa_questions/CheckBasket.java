package common_dsa_questions;

public class CheckBasket {

	public static void main(String[] args) {
		
		//String[] str = {"banana","banana","banana"};
		
		
		String[] str = {"apple", "orange", "banana", "orange"};
		
		int n = str.length;
		
		for(int i=0; i<n; i++)
        {
            if(n==1)
            {
                System.out.println("Single Type");
                return;
            }
            else if(str[i].equals(str[i+1]))
            {
                System.out.println("Single Type");
                return;
            }
            else
            {
                System.out.println("Mixed Basket");
                return;
            }
        }
	}

}
