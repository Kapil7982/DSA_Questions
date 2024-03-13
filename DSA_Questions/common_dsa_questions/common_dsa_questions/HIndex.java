package common_dsa_questions;

import java.util.Arrays;

public class HIndex {
	
	public static void main(String[] args) {
		
		//int[] citations = {3,0,6,1,5};
		
		int[] citations  = {1,3,1};
		
		System.out.println(hIndex(citations));
		}

	private static int hIndex(int[] citations) {
		
		Arrays.sort(citations);
        int index =0;

        for(int i=0; i<citations.length; i++)
        {
           if(citations[i] >=  citations.length-i)
           {
               index = Math.max(index, citations.length -i);
           }
        }

        return index;
	}
}


