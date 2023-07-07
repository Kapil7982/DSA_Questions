package common_dsa_questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class JohnNashAndSets {

	public static void main(String[] args) {
		
		int[] a = { 1, 2, 3, 4};
        int[] b = { 1, 2, 3, 4, 5 };
        int n = a.length;
        int m = b.length;

        Arrays.sort(a);
        Arrays.sort(b);

        Set<Integer> bag = new HashSet<Integer>();
        StringBuilder tag = new StringBuilder();

        int i = 0, j = 0;

        while (i < n && j < m) {
            if (a[i] < b[j]) {
                bag.add(a[i]);
                i++;
            } else {
                bag.add(b[j]);
                j++;
            }
        }

        while (i < n) {
            bag.add(a[i]);
            i++;
        }
        while (j < m) {
            bag.add(b[j]);
            j++;
        }

        for (int e : bag) {
            tag.append(e).append(" ");
        }

        System.out.println(tag.toString().trim());
    

	}

}
