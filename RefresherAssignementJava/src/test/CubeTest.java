package test;

import static org.junit.Assert.*;

import org.assigment1.Cube;
import org.assigment1.Shape;
import org.junit.Test;

public class CubeTest {
	
	Shape shp = new Cube("Black", 10, 12, 15);
	
	@Test
	public void testDisplay() {
		String display = shp.display();
		assertEquals("Black", display);
	}

	@Test
	public void testVolume() {
		int volume = shp.volume();
		assertEquals(1800, volume);
	}

}
