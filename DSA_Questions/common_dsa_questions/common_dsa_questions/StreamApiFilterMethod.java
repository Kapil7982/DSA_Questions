package common_dsa_questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamApiFilterMethod {
	
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Jhon", "David", "Bob", "Alice", "Charlie");
		
		List<String> filterName = names.stream()
				                       .filter(name -> name.startsWith("A"))
				                       .collect(Collectors.toList());
		
		System.out.println(filterName);
	}

}
