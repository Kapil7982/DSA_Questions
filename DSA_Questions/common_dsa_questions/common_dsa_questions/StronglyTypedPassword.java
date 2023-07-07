package common_dsa_questions;

public class StronglyTypedPassword {

	public static void main(String[] args) {
		
		String[] arr = {"test123", "new@t", "mon*y", "nrupul"};
		
		int n = arr.length;
		
		String bag = "";
		for(int i=0; i<n; i++)
		{
		    String str = arr[i];
		    int j;
		    for(j=0; j<arr[i].length(); j++)
		    {
		        if(str.charAt(j)=='@' || str.charAt(j)=='$' || str.charAt(j)=='#' || str.charAt(j)=='*')
		        {
		            bag = bag + "strong" + " ";
		            break;
		        }
		    }
		    if(j==arr[i].length())
		    {
		        bag = bag + "weak" + " ";
		    }
		}
		System.out.println(bag);

	}

}
