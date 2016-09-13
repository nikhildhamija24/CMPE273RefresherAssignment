package org.assigment1;

import java.util.Arrays;

public class MovieTicketArray {
	int front;
	int rear;
	private int maxSize;
	int size;
	int[] movieQueue;
	public MovieTicketArray(int maxSize){
		if(maxSize<=0){
			throw new IllegalArgumentException("There should be atleast 1 ticket for the movie!");
		}
		front = -1;
		rear = -1;
		size=0;
		this.maxSize = maxSize;
		movieQueue = new int[this.maxSize];
	}
	
	public int getQueueSize(){
		return size;
	}
	
	public boolean queueEmpty(){
		return front == -1 && rear == -1;
	}
	
	public void giveTicket(int ticketNumber){
		if(queueEmpty()){
			front ++;
			rear ++;
			size ++;
			movieQueue[rear]=ticketNumber;
		}else if((rear+1)%maxSize == front){
			throw new IllegalStateException("Box is full");
		}else{
			rear = (rear+1)%maxSize;
			size++;
			movieQueue[rear] = ticketNumber;
		}
	}
	
	public int enterMovieBox(){
		int value;
		if(queueEmpty()){
			throw new IllegalStateException("Queue is empty, no is buying tickets today!");
		}else if(front == rear){
			value = movieQueue[front];
			movieQueue[front] = 0;
			front = -1;
			rear = -1;
			size--;
		}else{
			value = movieQueue[front];
			movieQueue[front] = 0;
			front = (front + 1)%maxSize;
			
			size--;
		}
		return value;
	}
	
	public static void main(String[] args) {
		MovieTicketArray mvt = new MovieTicketArray(20);
		mvt.giveTicket(11);
		mvt.giveTicket(12);
		mvt.giveTicket(13);
		System.out.println(mvt.getQueueSize());
		System.out.println(Arrays.toString(mvt.movieQueue));
		mvt.enterMovieBox();
		System.out.println(Arrays.toString(mvt.movieQueue));
	}
	
}
