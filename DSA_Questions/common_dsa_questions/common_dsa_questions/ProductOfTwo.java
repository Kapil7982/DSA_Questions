package common_dsa_questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ProductOfTwo {

	public static void main(String[] args) {
		
		int[] arr = {1,2,2,3,4};
		
		int n = arr.length;
		
		int k = 4;
		
		int count=0;
		
		ArrayList<int[]> bag = new ArrayList<>();
		
		for(int i=0; i<n; i++)
		{
			for(int j=i+1; j<n; j++)
			{
				if(arr[i] * arr[j] == k)
				{
					count++;
					bag.add(new int[] {i,j});
				}
			}
		}
		
		if(count>0)
		{
			System.out.println(count);
		}
		else
		{
			System.out.println(-1);
		}
		
		Collections.sort(bag, new Comparator<int[]>() {
         
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });

        for (int i = 0; i < bag.size(); i++) {
            System.out.println(bag.get(i)[0] + " " + bag.get(i)[1]);
        }
	}

}
