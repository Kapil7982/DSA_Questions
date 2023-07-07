package common_dsa_questions;

public class CovidAndVowels {

	public static void main(String[] args) {
		
		String str = "dangerouscovid";
		
		int n = str.length();
		
		int count = 0;
	      for(int i=0; i<n; i++)
	      {
	           for(int j=i+1; j<n; j++)
	           {
	               if(covidAndVowels(str,i,j))
	               {
	                   count++;
	               }
	           }
	      }
	      System.out.println(count);
	}

	private static boolean covidAndVowels(String str, int i, int j) {
		
		int [] arr = new int [5];
        for( int r = i; r <= j; r++)
        {
            if ( str.charAt(r) == 'a' || str.charAt(r) == 'A')
            {
               arr[0] = arr[0]+1;
            }
             else if (str.charAt(r)=='i' || str.charAt(r)=='I')
             {
                 arr[1] = arr[1]+1;
             }
             else if (str.charAt(r)=='o' || str.charAt(r)=='O')
             {
                 arr[2] = arr[2]+1;
             }
             else if (str.charAt(r)=='u' || str.charAt(r)=='U')
             {
                arr[3] = arr[3]+1;
             }     
  }
          for ( int x=0; x<4; x++)
          {
             if(arr[x] ==0)
             {
               return false;
             }
          }
         return true;
	}

}
