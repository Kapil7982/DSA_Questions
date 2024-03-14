package common_dsa_questions;

public class RichestCustomerWealth {
	
	public static void main(String[] args) {
		
//		int[][] arr = {{1,2,3},
//				{3,2,1}
//		};
		
		int[][] arr = {{1,5},
				{7,3},
				{3,5}
		};
		
		System.out.println(richestCurstomerWealth(arr));
	}

	private static int richestCurstomerWealth(int[][] arr) {
		
		int res =0;
		
		for(int i=0; i<arr.length; i++)
		{
			int temp =0;
			
			for(int j=0; j<arr[i].length; j++)
			{
				temp += arr[i][j];
			}
			res = Math.max(res, temp);
		}
		
		return res;
	}

}
