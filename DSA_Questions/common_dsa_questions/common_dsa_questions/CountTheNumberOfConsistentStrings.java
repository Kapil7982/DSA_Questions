package common_dsa_questions;

public class CountTheNumberOfConsistentStrings {

	public static void main(String[] args) {


//		String str = "ab";
//        String[] words = {"ad", "bd", "aaab", "baa", "badab"};
//        
//        System.out.println(countTheNumberOfConsistentStrings(str,words));
        
        String str = "abc";
        String[] words = {"a","b","c","ab","ac","bc","abc"};
        
        System.out.println(countTheNumberOfConsistentStrings(str,words));

	}

	private static int countTheNumberOfConsistentStrings(String str, String[] words) {


		int count = 0;

        boolean[] flag = new boolean[26];
        
        for(char ch : str.toCharArray()) 
        {
            flag[ch - 'a'] = true;
        }
        
        for(String word : words) 
        {
            boolean check = true;
            for(char ch : word.toCharArray()) 
            {
                if(!flag[ch - 'a']) 
                {
                    check = false;
                    break;
                }
            }
            if(check) 
            {
                count++;
            }
        }
        
        return count;
	}

}
