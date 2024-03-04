package common_dsa_questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiMapFunction {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		
		List<Integer> list1 = list.stream()
				                 .map(number -> number *2)
				                 .collect(Collectors.toList());
		
		System.out.println(list1);
		
	}
}
