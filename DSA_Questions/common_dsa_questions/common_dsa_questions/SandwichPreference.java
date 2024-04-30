package common_dsa_questions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SandwichPreference {

	public static void main(String[] args) {
		
//		int[] students = {1, 1, 0, 0};
//        int[] sandwiches = {0, 1, 0, 1};
		
		int[] students = {1, 1, 1, 0, 0, 1};
        int[] sandwiches = {1, 0, 0, 0, 1, 1};
        System.out.println(countStudents(students, sandwiches));

	}

	private static int countStudents(int[] students, int[] sandwiches) {
		
		Queue<Integer> studentQueue = new LinkedList<>();
        for (int student : students) {
            studentQueue.offer(student);
        }

        Stack<Integer> sandwichStack = new Stack<>();
        for (int sandwich : sandwiches) {
            sandwichStack.push(sandwich);
        }

        int unableToEat = 0;
        while (!studentQueue.isEmpty() && unableToEat < studentQueue.size()) {
            if (studentQueue.peek() == sandwichStack.peek()) {
                studentQueue.poll();
                sandwichStack.pop();
                unableToEat = 0;
            } else {
                int frontStudent = studentQueue.poll();
                studentQueue.offer(frontStudent);
                unableToEat++;
            }
        }

        return unableToEat;
	}
}
