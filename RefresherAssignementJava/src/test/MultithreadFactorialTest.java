package test;

import static org.junit.Assert.*;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.assigment1.MultithreadFactorial;
import org.junit.Test;

public class MultithreadFactorialTest {
	
	MultithreadFactorial mtf = new MultithreadFactorial(5);
	
	@Test
	public void testCall() throws InterruptedException, ExecutionException {
		ExecutorService executor = Executors.newFixedThreadPool(2);
		Future<Integer> future = executor.submit(mtf);
		Integer integer = future.get();
		assertEquals(120, (int)integer);
	}

}
