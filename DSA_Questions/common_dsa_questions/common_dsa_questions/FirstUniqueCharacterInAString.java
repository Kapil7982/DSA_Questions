package common_dsa_questions;

public class FirstUniqueCharacterInAString {

	public static void main(String[] args) {
		
		//String str = "leetcode";
		
		//String str = "loveleetcode";
		
		String str = "aabb";
		
        System.out.println(firstUniqueCharacterInAString(str));

	}

	private static int firstUniqueCharacterInAString(String str) {
		
		int[] arr = new int[26];
		
		for(int i=0; i<str.length(); i++)
		{
			arr[str.charAt(i) - 'a']++;	
		}
		
		for(int i=0; i<str.length(); i++)
		{
			if(arr[str.charAt(i) - 'a'] == 1)
			{
				return i;
			}
		}
		
		return -1;
	}

}
