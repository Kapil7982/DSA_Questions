package common_dsa_questions;

class Bag{

  public static void main(String[] args)
  {
	  String str = "aabbc";
	 
	  String bag = "abc";
	  
	  int[] bagFreq = new int[26];
	  
      for(char c : str.toCharArray()) 
      {
          bagFreq[c - 'a']++;
      }
      
      boolean canForm = true;
      for(char c : str.toCharArray()) 
      {
          if(bagFreq[c - 'a'] > 0) 
          {
              bagFreq[c - 'a']--;
          } 
          else 
          {
              canForm = false;
              break;
          }
      }

      System.out.println(canForm ? "Yes" : "No");
	  
  }
}
