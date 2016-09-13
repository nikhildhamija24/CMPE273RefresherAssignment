package test;

import static org.junit.Assert.*;

import org.assigment1.Container;
import org.junit.Test;

public class ContainerTest {
	Container<Integer> intContainer = new Container<>();
	Container<String> stringContainer = new Container<>();
	@Test
	public void testGetTheElement() {
		intContainer.addElementsToContainer(10);
		Integer element = intContainer.getTheElement();
		assertSame(10, element);
	}
	
	@Test
	public void testGetTheStringElement() {
		stringContainer.addElementsToContainer("Generics");
		String theElement = stringContainer.getTheElement();
		assertSame("Generics", theElement);
	}
	
}
