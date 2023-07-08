package common_dsa_questions;

import java.util.*;

public class LastStoneWeight {

	public static void main(String[] args) {

		int[] arr = { 2, 7, 4, 1, 8, 1 };

		
		System.out.println(lastStoneWeight(arr));

	}

	private static int lastStoneWeight(int[] arr) 
	{
		PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());

		for (int stone : arr) {
			max.offer(stone);
		}

		while (max.size() > 1) {
			int heaviest1 = max.poll();
			int heaviest2 = max.poll();

			int diff = heaviest1 - heaviest2;

			if (diff > 0) {
				max.offer(diff);
			}
		}

		if (max.isEmpty()) {
			return 0;
		} else {
			return max.poll();
		}
	}

}
