package test;

import static org.junit.Assert.*;

import org.assigment1.MovieTicketArray;
import org.junit.Test;

public class MovieTicketArrayTest {
	
	MovieTicketArray movie = new MovieTicketArray(10);
	
	@Test
	public void testGetSize() {
		movie.giveTicket(1);
		movie.giveTicket(2);
		assertEquals(10, movie.getQueueSize());
	}

	@Test
	public void testQueueEmpty() {
		assertEquals(true, movie.queueEmpty());
	}

	@Test
	public void testEnterMovieBox() {
		movie.giveTicket(1);
		movie.giveTicket(2);
		movie.giveTicket(3);
		assertEquals(1, movie.enterMovieBox());
	}

}
