package common_dsa_questions;

public class RockPaperScissor {

	public static void main(String[] args) {
		
		String str = "rpsrr";
		
		String str1 = "prrsp";
		
		char rock = 'r';
        char paper = 'p';
        char scissor = 's';
        
        int count=0;
        int count1=0;
        
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i)== rock && str1.charAt(i)==paper)
            {
                count1++;
            }
            if(str.charAt(i)== rock && str1.charAt(i)==scissor)
            {
                count++;
            }
            if(str.charAt(i)== paper && str1.charAt(i)==rock)
            {
                count++;
            }
            if(str.charAt(i)== paper && str1.charAt(i)==scissor)
            {
                count1++;
            }
            if(str.charAt(i)== scissor && str1.charAt(i)==paper)
            {
                count++;
            }
            if(str.charAt(i)== scissor && str1.charAt(i)==rock)
            {
                count1++;
            }
        }
        
        if(count>count1)
        {
            System.out.println("First");
        }
        else if(count1>count)
        {
            System.out.println("Second");
        }
        else
        {
            System.out.println("Draw");
        }
		
		

	}

}
