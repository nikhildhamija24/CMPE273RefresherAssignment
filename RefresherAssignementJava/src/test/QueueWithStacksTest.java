package test;

import static org.junit.Assert.*;

import org.assigment1.QueueWithStacks;
import org.junit.Test;

public class QueueWithStacksTest {
	
	QueueWithStacks qs = new QueueWithStacks();
	
	@Test
	public void testGetSize() {
		
		qs.addToQueue(1);
		qs.addToQueue(2);
		assertEquals(2, qs.getSize());
	}

	@Test
	public void testIsEmpty() {
		assertEquals(true, qs.isEmpty());;
	}

	@Test
	public void testRemoveFromQueue() {
		qs.addToQueue(1);
		qs.addToQueue(2);
		qs.addToQueue(3);
		assertNotEquals(3, qs.removeFromQueue());
	}

}
