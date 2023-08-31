package common_dsa_questions;

public class CypherSequence {

	public static void main(String[] args) {
		
		int t = 3; 

        int n1 = 3;
        int[] arr1 = {9, 3, 1};
        int[] h1 = {3, 4, 2};
        String[] str1 = {"DDD", "UDUU", "DU"};

        
        int n2 = 2;
        int[] arr2 = {0, 9};
        int[] h2 = {9, 9};
        String[] str2 = {"DDDDDDDDD", "UUUUUUUUU"};

       
        int n3 = 5;
        int[] arr3 = {0, 5, 9, 8, 3};
        int[] h3 = {10, 3, 8, 10, 4};
        String[] str3 = {"UUUUUUUUUU", "UUD", "UUDUUDDD", "UUDUUDUDDU", "UUUU"};

        int[][] arr = {arr1, arr2, arr3};
        int[][] h = {h1, h2, h3};
        String[][] str = {str1, str2, str3};

        for(int i = 0; i < t; i++) 
        {
            int n = arr[i].length;
            int[] currentArr = arr[i];
            int[] currentH = h[i];
            String[] currentStr = str[i];

            for(int j=0; j<n; j++) 
            {
                currentArr[j] = cypherSequence(currentArr[j], currentH[j], currentStr[j].toCharArray());
            }

            for(int j = 0; j < n; j++) 
            {
                System.out.print(currentArr[j] + " ");
            }
            System.out.println();


	}

}

	public static int cypherSequence(int arr, int h, char[] str) {
		
		int k = arr;

        for (int i = 0; i < h; i++) {
            if (str[i] == 'D') {
                if (k == 9)
                    k = 0;
                else
                    k++;
            }
            if (str[i] == 'U') {
                if (k == 0)
                    k = 9;
                else
                    k--;
            }
        }
        return k;
	}
}
