package common_dsa_questions;

import java.util.LinkedList;
import java.util.Queue;

public class UniqueGift {

	public static void main(String[] args) {
		
		//String str = "abadbc";
		
		String str = "abcabc";
		
		int n = str.length();
		
		int [] arr = new int [26];
        Queue<Character> que = new LinkedList<>();
        StringBuffer bag = new StringBuffer();
        
        for(int i=0; i<n; i++)
        {
            que.add(str.charAt(i));
            int tag = str.charAt(i) - 'a';
            arr[tag]++;
            while(!que.isEmpty())
            {
                if (arr[que.peek()-'a'] > 1) 
                    que.remove();
                else
                {
                    bag.append(que.peek());
                    break;
                }
            }
                if (que.isEmpty())
                    bag.append("#");
            
        }
        System.out.println(bag.toString());
        
	}

}
