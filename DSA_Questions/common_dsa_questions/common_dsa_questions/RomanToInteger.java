package common_dsa_questions;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

	public static void main(String[] args) {
		
		String str = "III";
		
		Map<Character, Integer> map = new HashMap<>();

        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int res =0;
        for(int i=0; i<str.length(); i++)
        {
            if(i< str.length() -1 && map.get(str.charAt(i)) < map.get(str.charAt(i+1)))
            {
                res -= map.get(str.charAt(i));
            }
            else
            {
                res += map.get(str.charAt(i));
            }
        }
        System.out.println(res);
	}
}
