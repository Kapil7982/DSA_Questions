package common_dsa_questions;

public class EdiblePlants {

	public static void main(String[] args) {
		
		//String ed = "xY";
		
		String ed = "abc";
		
		int n = ed.length();
		
		//String pl = "AYxxXY";
		
		String pl = "ABCxyz";
		
		int m = pl.length();
		
		int count = ediblePlants(n,m,ed, pl);
        System.out.println(count);

	}

	private static int ediblePlants(int n, int m, String ed, String pl) {
		
        int count = 0;
        
        for(int i=0; i<m; i++) 
        {
            char ch = pl.charAt(i);
            
            if(ed.indexOf(ch) != -1) 
            {
                count++;
            }
        }
        
        return count;
	}

}
