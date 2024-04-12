package common_dsa_questions;

import java.util.HashMap;

public class ArrayChallenge {

	public static void main(String[] args) {
		
		int[] arr = {2,1,1,2,3,3};
		
		int[] arr1 = {5,4,6,7,7,6,4,5};
		
		System.out.println(arrayChallenge(arr));
		System.out.println(arrayChallenge(arr1));
	}

	private static String arrayChallenge(int[] arr) {
		HashMap<Integer, Integer> table = new HashMap<>();

        for (int x = 0; x < arr.length - 1; x += 2) {
            boolean found = false;
            for (Integer key : table.keySet()) {
                if ((key == arr[x] && table.get(key) == arr[x + 1]) || (key == arr[x + 1] && table.get(key) == arr[x])) {
                    table.remove(key);
                    found = true;
                    break;
                }
            }

            if (!found) {
                table.put(arr[x], arr[x + 1]);
            }
        }
        
        if (table.isEmpty()) {
            return "yes";
        }

        StringBuilder convert = new StringBuilder();
        for (Integer key : table.keySet()) {
            convert.append(key).append(",").append(table.get(key)).append(",");
        }
        convert.deleteCharAt(convert.length() - 1);

        return convert.toString();

	}

}
