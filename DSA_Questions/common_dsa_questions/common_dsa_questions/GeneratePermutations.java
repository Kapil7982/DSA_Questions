package common_dsa_questions;
import java.util.*;

public class GeneratePermutations {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3};
		
		int n = arr.length;
		
		System.out.println(generatePermutation(arr));

	}

	public static List<List<Integer>> generatePermutation(int[] a)
	{
	    
	       List<List<Integer>> list = new ArrayList<>();
	       
	       generatePermutations(a,0, list);
	       
	       return list;
	}

	public static void generatePermutations(int[] a, int start, List<List<Integer>> list)
	{
	      if(start == a.length -1)
	      {
	          List<Integer> per = new ArrayList<>();
	          
	          for(int num : a)
	          {
	              per.add(num);
	          }
	          list.add(per);
	          return ;
	      }
	      
	      for(int i=start; i<a.length; i++)
	      {
	          swap(a, start, i);
	          generatePermutations(a, start+1, list);
	          swap(a, start, i);
	      }
	 }
	
	public static void swap(int[] a, int i, int j)
	{
	      int temp = a[i];
	      a[i] = a[j];
	      a[j]= temp;
	}

}
