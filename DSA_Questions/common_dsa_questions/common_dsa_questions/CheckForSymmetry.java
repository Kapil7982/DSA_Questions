package common_dsa_questions;

import java.util.*;

class CheckForSymmetry {
    public static void main(String[] args) {
        String[] input = {
            "3",
            "4",
            "*.*.",
            ".*.*",
            "*.*.",
            ".*.*",
            "3",
            ".*.",
            "*.*",
            ".*.",
            "3",
            "..*",
            "**.",
            "..*"
        };

        Scanner sc = new Scanner(System.in);
        
        int t = Integer.parseInt(input[0]);
        
        int lineIndex = 1; 
        
        for (int k = 0; k < t; k++) {
            int n = Integer.parseInt(input[lineIndex++]);

            String[] ar = new String[n];
            for (int i = 0; i < n; i++) {
                ar[i] = input[lineIndex++]; 
            }

            int a = n;
            boolean hor = true;
            for (int i = 0; i < a; i++) {
                if (!ar[i].equals(ar[a - 1])) {
                    hor = false;
                    break;
                }
                a--;
            }

            boolean ver = true;
            for (int i = 0; i < n; i++) {
                int b = n;
                for (int j = 0; j < b; j++) {
                    if (ar[i].charAt(j) != ar[i].charAt(b - 1)) {
                        ver = false;
                        break;
                    }
                    b--;
                }
            }

            if (hor && ver) {
                System.out.println("BOTH");
            } else if (hor) {
                System.out.println("HORIZONTAL");
            } else if (ver) {
                System.out.println("VERTICAL");
            } else {
                System.out.println("NO");
            }
        }
    }
}
