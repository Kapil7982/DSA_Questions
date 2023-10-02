package common_dsa_questions;

public class ArraySplit {

	public static void main(String[] args) {
		
		int[] arr = {10, 4, -8, 7};
		
		System.out.println(arraySplit(arr));

	}

	private static int arraySplit(int[] arr) {
		
		int sum = 0;
        for(int i : arr)
        {
            sum = sum + i;
        }
        int res = 0;
        int localSum = 0;
        for(int i=0; i<arr.length-1;i++)
        {
            localSum = localSum + arr[i];
            if(localSum >= sum-localSum)
            {
                res++;
            }
        }
        return res;
	}

}
