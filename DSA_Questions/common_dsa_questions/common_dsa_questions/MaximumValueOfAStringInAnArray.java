package common_dsa_questions;

public class MaximumValueOfAStringInAnArray {

	public static void main(String[] args) {
		
//		String[] str = {"alic3","bob","3","4","00000"};
		
		String[] str = {"1","01","001","0001"};
		
		System.out.println(maximumValueOfAStringInAnArray(str));

	}

	private static int maximumValueOfAStringInAnArray(String[] str) {
		
		int max=0;
		
		for(String st : str)
		{
			int res=0;
			
			if(st.matches("\\d+"))
			{
				res = Integer.parseInt(st);
			}
			else
			{
				res = st.length();
			}
			max = Math.max(max,res);
		}
		
		return max;
	}

}
