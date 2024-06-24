package common_dsa_questions;

import java.util.ArrayList;
import java.util.stream.Stream;

public class MergeArrayLists {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		
		ArrayList<Integer> list1 = new ArrayList<>();
		
		list1.add(4);
		list1.add(5);
		list1.add(6);
		
		ArrayList<Integer> mergedList = Stream.concat(list.stream(), list1.stream()).
				                        collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
		
		System.out.println(mergedList);
	}
}
