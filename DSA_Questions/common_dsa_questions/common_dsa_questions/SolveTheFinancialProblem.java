package common_dsa_questions;


public class SolveTheFinancialProblem {

	public static void main(String[] args) {
		
		int[] arr = {100,60,70,65,80,85};
		
		
		int n = arr.length;
		
		solveTheFinancialProblem(n,arr);
	}

	private static void solveTheFinancialProblem(int n, int[] arr) {
		
		int[] st = new int[n];
		int[] S = new int[n];
		int top = 0;
		st[top] = 0;
		S[0] = 1;

		for (int i = 1; i < n; i++) {
		    while (top >= 0 && arr[st[top]] <= arr[i]) {
		        top--;
		    }
		    S[i] = (top < 0) ? (i + 1) : (i - st[top]);
		    top++;
		    st[top] = i;
		}
		for(int i = 0; i < S.length; i++) 
		{
		    System.out.print(S[i] + " ");
		}
		
	}

}
