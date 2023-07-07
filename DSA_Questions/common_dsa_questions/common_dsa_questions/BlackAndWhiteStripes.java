package common_dsa_questions;

public class BlackAndWhiteStripes {

	public static void main(String[] args) {
		
		//String str = "BBWBW";
		
		String str = "W";
		
		int n = str.length();
		
		//int k = 3;
		
		//int k = 5;
		
		int k =1;
		
		System.out.println(blackAndWhiteStripes(n,k,str));
	}

	private static int blackAndWhiteStripes(int n, int k, String str) {
		
		int min = Integer.MAX_VALUE;
		
		for(int i=0; i<=n-k; i++)
		{
			int count=0;
			
			for(int j=i; j<i+k; j++)
			{
				if(str.charAt(j) == 'W')
				{
					count++;
				}
			}
			
			if(count < min)
			{
				min = count;
			}
		}
		return min == Integer.MAX_VALUE ? k : min;
	}

}
