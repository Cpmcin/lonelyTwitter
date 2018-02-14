package ca.ualberta.cs.lonelytwitter;

/**
 * Created by cameronmcintyre on 2018-02-13.
 */



import java.util.ArrayList;
public class TweetList {


    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public void add(Tweet tweet){
        if (hasTweet(tweet)){
            throw new IllegalArgumentException();

        }
        else{
            tweets.add(tweet);

        }


    }

    public boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);
    }

    public ArrayList<Tweet> getTweets(){
        return tweets;

    }

    public int getCount(int count){
        return tweets.size();
    }

    public Tweet getTweet(int index){
        return tweets.get(index);
    }
    public void delete(Tweet tweet){
        tweets.remove(tweet);
    }
}
