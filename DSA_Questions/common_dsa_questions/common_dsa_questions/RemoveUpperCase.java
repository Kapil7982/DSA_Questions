package common_dsa_questions;

public class RemoveUpperCase {

	public static void main(String[] args) {
		
		String str = "MasAi";
		
		int n = str.length();
		
		String bag = "";
        String tag = "";
        for(int i = 0; i <str.length(); i++)
        {
            bag = String.valueOf(str.charAt(i));
            
            if(bag.equals(bag.toUpperCase()))
            {
                continue;
            }
            else 
            {
                tag = tag + str.charAt(i);
            }
        }
        System.out.println(tag);
	}

}
