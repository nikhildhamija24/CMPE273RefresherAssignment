package test;

import static org.junit.Assert.*;

import org.assigment1.StackWithQueue;
import org.junit.Test;

public class StackWithQueueTest {
	
	StackWithQueue swq = new StackWithQueue();
	
	@Test
	public void testIsEmpty() {
		assertEquals(true, swq.isEmpty());
	}

	@Test
	public void testGetSize() {
		swq.pushToStack(1);
		swq.pushToStack(2);
		swq.pushToStack(3);
		assertEquals(3, swq.getSize());
	}

	@Test
	public void testPopFromStack() {
		swq.pushToStack(1);
		swq.pushToStack(2);
		swq.pushToStack(3);
		assertEquals(3, swq.popFromStack());
	}

}
