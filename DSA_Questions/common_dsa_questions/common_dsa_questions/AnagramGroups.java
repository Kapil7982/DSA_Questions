package common_dsa_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramGroups {

	public static void main(String[] args) {
		
		String[] strs1 = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result1 = groupAnagrams(strs1);
        System.out.println(result1);

        
        String[] strs2 = {""};
        List<List<String>> result2 = groupAnagrams(strs2);
        System.out.println(result2);

        
        String[] strs3 = {"a"};
        List<List<String>> result3 = groupAnagrams(strs3);
        System.out.println(result3);
	}

	private static List<List<String>> groupAnagrams(String[] strs) {
		
		if (strs == null || strs.length == 0)
            return new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);

            if (!map.containsKey(sortedStr))
                map.put(sortedStr, new ArrayList<>());

            map.get(sortedStr).add(str);
        }

        return new ArrayList<>(map.values());
	}

}
