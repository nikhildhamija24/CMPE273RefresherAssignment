package org.assigment1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class TwitterFeeds {
	
	public Map<Integer, HashSet<String>> tweets;
	public TwitterFeeds(){
		tweets = new HashMap<>();
	}
	
	public void addTweet(int id, String tweet){
		if(tweets.containsKey(id)){
			HashSet<String> tweetsSet = tweets.get(id);
			tweetsSet.add(tweet);
		}else{
			HashSet<String> twSet = new HashSet<>();
			twSet.add(tweet);
			tweets.put(id, twSet);
		}
	}
	
	public HashSet<String> removeTweet(int id){
		
			if(tweets.containsKey(id)){
				HashSet<String> setOfTweets = tweets.get(id);
				tweets.remove(id);
				return setOfTweets;
			}else{
				throw new NullPointerException("No data found for the id entered");
			}
		
	}
	
	public int getNumberOfTweets(int id){
		HashSet<String> userTweets = tweets.get(id);
		return userTweets.size();
	}
	
	public int getTotalNumberOfUserFeeds(){
		return tweets.size();
	}
	
	public static void main(String[] args) {
		TwitterFeeds feeds = new TwitterFeeds();
		
		feeds.addTweet(1, "Welcome to Hotel California");
		feeds.addTweet(1, "Its a sunny day");
		feeds.addTweet(2, "Hows it going?");
		feeds.addTweet(2, "Hello! wazzup?");
		feeds.addTweet(3, "Im a programmer");
		feeds.addTweet(4, "Iphone7 released today");
		feeds.addTweet(4, "I like it");
		
		System.out.println(feeds.getNumberOfTweets(1));
		System.out.println(feeds.getTotalNumberOfUserFeeds());
	}

}
