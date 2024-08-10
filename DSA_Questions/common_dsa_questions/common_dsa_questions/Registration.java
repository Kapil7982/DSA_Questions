package common_dsa_questions;

import java.util.HashMap;
import java.util.Scanner;

public class Registration {

	public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
    
        HashMap<String, Integer> hm = new HashMap<>();
    
       
        for(int i=0; i<n; i++) 
        {
          String str = sc.nextLine();
    
          
          if(hm.containsKey(str)) 
          {
            
            int j = hm.get(str) + 1;
            
            while(hm.containsKey(str+j)) 
            {
              j++;
            }
            hm.put(str, j);
            System.out.println(str+j);
          } 
          else
          {
            hm.put(str, 0);
            System.out.println("OK");
          }
    }
}

}
