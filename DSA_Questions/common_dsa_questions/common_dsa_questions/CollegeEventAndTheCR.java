package common_dsa_questions;

import java.util.*;

public class CollegeEventAndTheCR {
	    
	    static List<List<Integer>> graph;
	    static boolean[] flag;

	    public static void main(String[] args) 
	    {
	        int t = 2; 

	        
	        int n1 = 4;
	        int e1 = 2;
	        int[][] edges1 = {{0, 1}, {1, 2}};
	        
	        System.out.println(collegeEventAndTheCR(n1, e1, edges1));

	       
	        int n2 = 3;
	        int e2 = 0;
	        System.out.println(collegeEventAndTheCR(n2, e2, new int[0][0]));
	    }

	    private static int collegeEventAndTheCR(int n, int e, int[][] edges) 
	    {
	        graph = new ArrayList<>();
	        
	        for(int i=0; i<n; i++) 
	        {
	            graph.add(new ArrayList<>());
	        }

	        for(int i=0; i<e; i++) 
	        {
	            int a = edges[i][0];
	            int b = edges[i][1];
	            graph.get(a).add(b);
	            graph.get(b).add(a);
	        }

	        return collegeEventAndTheCR(n);
	    }

	    private static int collegeEventAndTheCR(int n) 
	    {
	        flag = new boolean[n];
	        
	        int min = 0;

	        for(int i=0; i<n; i++) 
	        {
	            if(!flag[i]) 
	            {
	                min++;
	                dfs(i);
	            }
	        }

	        return min;
	    }

	    private static void dfs(int no) 
	    {
	        flag[no] = true;
	        
	        for(int neighbor : graph.get(no)) 
	        {
	            if (!flag[neighbor]) 
	            {
	                dfs(neighbor);
	            }
	        }
	    }
	}
