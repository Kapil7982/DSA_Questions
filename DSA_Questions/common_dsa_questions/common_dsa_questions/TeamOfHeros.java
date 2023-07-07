package common_dsa_questions;

public class TeamOfHeros {

	public static void main(String[] args) {
		
		int[] arr = {10,11,13,17,21};
		
		int n = arr.length;
		
		//int k = 31;
		
		int k = 44;
		
		int [] ans = teamOfHeroes(n,k, arr);
        
        if(ans[0] == -1 && ans[1]==-1) 
        {
            System.out.println("No");
        }
       else 
       {
           System.out.println("Yes");
        }

	}

	private static int[] teamOfHeroes(int n, int k, int[] arr) {
		
		int l = 0;
        int h = n-1;
        
        int [] bag = {-1,-1};
        
        while(l<h)
        {
            int sum = arr[l] + arr[h];
            
            if (sum == k)
            {
                bag[0] = l;
                bag[1] = h;
                return bag;
                
            }
            else if(sum>k) 
            {
                h --;
            }
            else 
            { 
                l++;
            }
        }
        return bag;
	}
}
