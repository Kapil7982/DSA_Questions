package common_dsa_questions;

import java.util.HashMap;

public class MakeITUnique {

	public static void main(String[] args) {
		
		String str = "aaaabbbbbcccccdddd";
		
		int n = str.length();
		
		HashMap<Character, Integer> obj = new HashMap<>();
        String bag = "";

        for(int i=0; i<n; i++) 
        {
            char ch = str.charAt(i);
            obj.put(ch, obj.getOrDefault(ch, 0) + 1);
        }

        for(Character key : obj.keySet()) 
        {
            if(obj.get(key) >= 1) 
            {
                bag += key;
            }
        }

        System.out.println(bag);
	}

}
