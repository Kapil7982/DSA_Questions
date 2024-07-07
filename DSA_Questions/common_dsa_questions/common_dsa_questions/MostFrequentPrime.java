package common_dsa_questions;

import java.util.HashMap;

public class MostFrequentPrime {

	public static void main(String[] args) {
		
		int[][] mat = {
				{9,7,8},
				{4,6,5},
				{2,8,6}
				};
		
		System.out.println(mostFrequentPrime(mat));
	}

	private static int mostFrequentPrime(int[][] mat) {
		
		HashMap<String,Integer> hm=new HashMap<>();
        int max=-1;
        String num="";
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                int k=0;
                StringBuilder s1=new StringBuilder();
                
                for (k=j;k<mat[0].length;k++)
                {
                    s1.append(mat[i][k]);
                    if(isPrime(s1.toString())==1)
                    hm.put(s1.toString(),hm.getOrDefault(s1.toString(),0)+1);
                }
                s1.setLength(0);
                
                for (int x=i,y=j;x<mat.length&&y<mat[0].length;x++,y++)
                {
                    s1.append(mat[x][y]);
                    if(isPrime(s1.toString())==1)
                    hm.put(s1.toString(),hm.getOrDefault(s1.toString(),0)+1);
                }
                s1.setLength(0);
               
                for (k=i;k<mat.length;k++)
                {  
                    s1.append(mat[k][j]);
                    if(isPrime(s1.toString())==1)
                    hm.put(s1.toString(),hm.getOrDefault(s1.toString(),0)+1);
                }
                s1.setLength(0);
                
                for (int x=i,y=j;x<mat.length&&y>=0;x++,y--)
                {
                    s1.append(mat[x][y]);
                    if(isPrime(s1.toString())==1)
                    hm.put(s1.toString(),hm.getOrDefault(s1.toString(),0)+1);
                }
                s1.setLength(0);
                
                for (k=j;k>=0;k--)
                {
                    s1.append(mat[i][k]);
                    if(isPrime(s1.toString())==1)
                    hm.put(s1.toString(),hm.getOrDefault(s1.toString(),0)+1);
                }
                s1.setLength(0);
                
                for (int x=i,y=j;x>=0&&y>=0;x--,y--)
                {
                    s1.append(mat[x][y]);
                    if(isPrime(s1.toString())==1)
                    hm.put(s1.toString(),hm.getOrDefault(s1.toString(),0)+1);
                }
                s1.setLength(0);
                
                for (k=i;k>=0;k--)
                {
                    s1.append(mat[k][j]);
                    if(isPrime(s1.toString())==1)
                    hm.put(s1.toString(),hm.getOrDefault(s1.toString(),0)+1);
                }
                s1.setLength(0);
                
                for (int x=i,y=j;x>=0&&y<mat[0].length;x--,y++)
                {
                    s1.append(mat[x][y]);
                    if(isPrime(s1.toString())==1)
                    hm.put(s1.toString(),hm.getOrDefault(s1.toString(),0)+1);
                }
                s1.setLength(0);                      
            }
        }  
               
        for (String key:hm.keySet())
        {
            if (hm.get(key)>max)
            {
                max=hm.get(key);
                num=key;
            }
            else if(hm.get(key)==max)
            {
                int mnu=Math.max(Integer.parseInt(num),Integer.parseInt(key));
                num=String.valueOf(mnu);
            }
        }              
        if (num.equals("")) 
        return -1;
        return Integer.parseInt(num);

	}
	
	public static int isPrime(String s1)
    {
        int n=Integer.parseInt(s1);
        if(n<=10)
            return 0;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
                return 0;
        }
        return 1;
    }

}
