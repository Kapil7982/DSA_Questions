package common_dsa_questions;

public class MinMovesBracketSequence {

	public static void main(String[] args) {
		
//		String str = ")(";
		
//		String str = "()()";                    4
		
		String str = ")))((((())";
		
		int n = str.length();
		
		int count=0;
		
		int res=0;
		
		for(int i=0; i<n; i++)
		{
			if(str.charAt(i) == '(')
			{
				count++;
			}
			else
			{
				count--;
			}
			if(count<0)
			{
			   res++;
			   count=0;
			}
		}
		
		System.out.println(res);

	}

}
