package common_dsa_questions;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingTwoQueues {
	
	private Queue<Integer> queue1;
	private Queue<Integer> queue2;
	
	public StackUsingTwoQueues() {
		
		queue1 = new LinkedList<>();
		queue2 = new LinkedList<>();
		
	}
	
	public void push(int x)
	{
		queue1.add(x);
	}
	
	public int pop() {
		
		if(queue1.isEmpty())
		{
			throw new IllegalStateException("Stack is Empty!");
		}
		
		while(queue1.size() > 1)
		{
			queue2.add(queue1.remove());
		}
		
		int top = queue1.remove();
		
		
		Queue<Integer> temp = queue1;
		queue1 = queue2;
		queue2 = temp;
		
		return top;
	}
	
	public int top() {
		
		if(queue1.isEmpty())
		{
			throw new IllegalStateException("Stack is Empty!");
		}
		
		while(queue1.size() > 1)
		{
			queue2.add(queue1.remove());
		}
		
		int top = queue1.remove();
		
		queue2.add(top);
		
		Queue<Integer> temp = queue1;
		queue1 = queue2;
		queue2 = temp;
		
		return top;
	}
	
	public boolean isEmpty() {
		
		return queue1.isEmpty();
	}

	public static void main(String[] args) {
		
		StackUsingTwoQueues stack = new StackUsingTwoQueues();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		
		System.out.println("Top element :" + stack.top());
		System.out.println("Pop element :" + stack.pop());
		System.out.println("Top element :" + stack.top());
		System.out.println("Pop element :" + stack.pop());
		System.out.println("Is Stack Empty :" + stack.isEmpty());
		System.out.println("Pop element :" + stack.pop());
		System.out.println("Is Stack Empty :" + stack.isEmpty());
		
	}

}
