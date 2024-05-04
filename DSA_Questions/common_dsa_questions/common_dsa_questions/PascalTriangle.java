package common_dsa_questions;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

	public static void main(String[] args) {
		
		int num = 5;
	    
		List<List<Integer>> triangle = pascalTriangle(num);
		
		for(List<Integer> row : triangle)
		{
			System.out.println(row);
		}
	}

	private static List<List<Integer>> pascalTriangle(int num) {
		
		List<List<Integer>> triangle = new ArrayList<>();
		
		if(num <= 0)
		{
			return triangle;
		}
		
		for(int i=0; i<num; i++)
		{
			List<Integer> row = new ArrayList<>();
			
			for(int j=0; j<=i; j++)
			{
				if(j == 0 || j== i)
				{
					row.add(1);
				}
				else
				{
					row.add(triangle.get(i -1).get(j-1)+ triangle.get(i-1).get(j));
				}
			}
			triangle.add(row);
		}
		return triangle;
	}

}
