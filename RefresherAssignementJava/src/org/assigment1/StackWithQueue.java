package org.assigment1;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class StackWithQueue {
	Queue<Integer> queue1;
	Queue<Integer> queue2;
	
	public StackWithQueue(){
		queue1 = new LinkedList<>(); 
		queue2 = new LinkedList<>(); 
	}
	
	public boolean isEmpty(){
		return queue1.isEmpty() && queue2.isEmpty();
	}
	
	public void pushToStack(int el){
		if(isEmpty()){
			queue1.add(el);
		}else{
			for(int i=0; i<queue1.size(); i++){
				queue2.add(queue1.remove());
			}
			queue1.add(el);
			for(int i=0; i<queue2.size(); i++){
				queue1.add(queue2.remove());
			}
		}
	}
	
	public int getSize(){
		return queue1.size();
	}
	
	public int popFromStack(){
		if(isEmpty()){
			throw new NoSuchElementException("Stack underlow");
		}
		for(int i=0; i<queue1.size()-1; i++){
			queue2.add(queue1.remove());
		}
		int removed = queue1.remove();
		for(int i=0; i<queue2.size(); i++){
			queue1.add(queue2.remove());
		}
		return removed;
	}
	
	public static void main(String[] args) {
		StackWithQueue swq = new StackWithQueue();
		swq.pushToStack(1);
		swq.pushToStack(2);
		swq.pushToStack(9);
		int swqSize = swq.getSize();
		System.out.println(swqSize);
		
		int popFromStack = swq.popFromStack();
		System.out.println("You popped: "+ popFromStack);
		System.out.println(swq.getSize());
		
	}
}
