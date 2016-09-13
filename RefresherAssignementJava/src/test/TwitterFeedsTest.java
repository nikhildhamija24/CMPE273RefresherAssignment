package test;

import static org.junit.Assert.*;

import org.assigment1.TwitterFeeds;
import org.junit.Test;

public class TwitterFeedsTest {
	
	TwitterFeeds tf = new TwitterFeeds();

	@Test
	public void testGetNumberOfTweets() {
		tf.addTweet(1, "I'm loving the new iphone7");
		tf.addTweet(1, "#airpods.. I hate them");
		tf.addTweet(2, "RioOlympics");
		assertEquals(2, tf.getNumberOfTweets(1));
	}

	@Test
	public void testGetTotalNumberOfUserFeeds() {
		tf.addTweet(1, "I'm loving the new iphone7");
		tf.addTweet(1, "#airpods.. I hate them");
		tf.addTweet(2, "RioOlympics in Rio De jenirio brazil");
		tf.addTweet(3, "Twitter is best");
		tf.addTweet(4, "CMPE-273 is too difficult");
		assertEquals(4, tf.getTotalNumberOfUserFeeds());
	}

}
