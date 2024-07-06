package common_dsa_questions;

public class FindJudge {

	public static void main(String[] args) {
		
		int n = 2;
		int[][] trust = {
				{1,2}
				};
		
		System.out.println(findJudge(n,trust));
		
	}

	private static int findJudge(int n, int[][] trust) {
		
		int m = trust.length;
        int indegree[] = new int[n + 1];
        for(int i = 0; i < m; i++){
            indegree[trust[i][1]]++;
        }

        int answer = 0;

        for(int i = 1; i <= n; i++){
            if(indegree[i] == n - 1){
                answer = i;
            }
        }

        for(int i = 0; i < m; i++){
            if(trust[i][0] == answer){
                return -1;
            }
        }

        return answer == 0 ? -1 : answer;
	}
}
