package common_dsa_questions;

public class AClassicalProblem {

	public static void main(String[] args) {
		
		int n = 15;
		
		for(int i=1; i<=n; i++)
        {
            
            if(i%5==0 && i%7==0)
            {
                System.out.println("MasaiSchool");
            }
            else if(i%5==0)
            {
                System.out.println("Masai");
            }
            else if(i%7==0)
            {
                System.out.println("School");
            }
            else
            {
                System.out.println(i);
            }
        }
	}

}
