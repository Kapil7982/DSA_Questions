package common_dsa_questions;

public class TheJEE {

	public static void main(String[] args) {
		
		int firstp = 120;
        int firstc = 90;
        int firstm = 70;

       
        int secondp = 90;
        int secondc = 80;
        int secondm = 110;
        
        
        int total_first = firstp + firstc + firstm;
        int total_second = secondp + secondc + secondm;

        if(total_first > total_second) 
        {
            System.out.println("First");
        } 
        else if(total_first < total_second) 
        {
            System.out.println("Second");
        } 
        else 
        {
            
            if(firstm > secondm) 
            {
                System.out.println("First");
            } 
            else if(firstm < secondm) 
            {
                System.out.println("Second");
            } 
            else 
            {
                if (firstp > secondp) 
                {
                    System.out.println("First");
                } 
                else 
                {
                    System.out.println("Second");
                }
            }
        }

	}

}
