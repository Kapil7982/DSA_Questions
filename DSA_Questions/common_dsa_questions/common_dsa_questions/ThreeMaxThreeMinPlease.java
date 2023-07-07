package common_dsa_questions;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class ThreeMaxThreeMinPlease {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,2,1,6,5};
		
		int n = arr.length;
		
		if(n>5)
		{
			LinkedHashSet<Integer> hset = new LinkedHashSet<>();
			
			Arrays.sort(arr);
			
			for(int i=0; i<n; i++)
			{
				hset.add(arr[i]);
			}
			
			Iterator iterator = hset.iterator();
			for(int j=0; iterator.hasNext(); j++) 
            {
                int value = (int) iterator.next();
                
                if(hset.size()<6)
                {
                    if(j<=2) 
                    {
                        System.out.print(value + " ");
                    }
                    if(j==2) 
                    {
                        System.out.println();
                    }
                    if(j>=2) 
                    {
                        System.out.print(value + " ");
                    }

                }
                else 
                {
                    if(j<=2) 
                    {
                        System.out.print(value + " ");
                    } 
                    else if (j>= hset.size() - 3) 
                    {
                        System.out.print(value + " ");
                    }

                    if(j==2) 
                    {
                        System.out.println();
                    }
                }
            }
        }
        else 
        {
            System.out.println("Not Possible");
        }
		}
 	}


