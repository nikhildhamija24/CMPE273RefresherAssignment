package org.assigment1;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

public class QueueWithStacks {
	
	Stack<Integer> stack1;  //rear of the queue
	Stack<Integer> stack2;  //front of the queue
	
	//create 2 empty stacks
	public QueueWithStacks(){
		stack1 = new Stack<>();
		stack2 = new Stack<>();
	}
	
	public int getSize(){
		return stack1.size();
	}
	
	public boolean isEmpty(){
		return stack1.isEmpty() && stack2.isEmpty();
	}
	
	public void addToQueue(int x){
		stack1.add(x);		
	}
	
	public int removeFromQueue(){
		if(isEmpty()){
			throw new NoSuchElementException("Stack UnderFlow");
		}
		while(!stack1.isEmpty()){
			stack2.push(stack1.pop());
		}
		int ele = stack2.pop();
		while(!stack2.isEmpty()){
			stack1.push(stack2.pop());
		}
		return ele;
	}
	public void display(){
		Iterator<Integer> it = stack1.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	
	public static void main(String[] args) {
		QueueWithStacks qs = new QueueWithStacks();
		qs.addToQueue(1);
		qs.addToQueue(2);
		qs.addToQueue(3);
		qs.addToQueue(4);
		qs.addToQueue(5);
		qs.addToQueue(6);
		qs.addToQueue(7);
		qs.display();
		System.out.println("Size" + qs.getSize());
		
		qs.removeFromQueue();
		qs.removeFromQueue();
		qs.display();
		System.out.println("Size"+qs.getSize());
	}

}
