package org.assigment1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultithreadFactorial implements Callable<Integer> {
	
	private int integer;
	
	public MultithreadFactorial(int integer) {
		this.integer = integer;
	}
	
	@Override
	public Integer call() throws Exception {
		int factorial = 1;
		if(integer == 0 || integer == 1){
			factorial = 1;
		}else{
			for(int i=2; i<=integer; i++){
				factorial *= i;
			}
		}
		return factorial;
	}
	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newFixedThreadPool(3);		
		List<Future<Integer>> fact = new ArrayList<>();
		
		Random random = new Random();
		
		for(int i=1; i<=4; i++){		
			Integer num = random.nextInt(8);
			MultithreadFactorial mtf = new MultithreadFactorial(num);
			Future<Integer> resultset = executor.submit(mtf);
			fact.add(resultset);
		}
		
		for(Future<Integer> fut : fact){
			try {
				System.out.println("Future result is: "+ fut.get() + " and task done is "+fut.isDone());
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		executor.shutdown();
	}

}
