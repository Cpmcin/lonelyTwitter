package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by cameronmcintyre on 2018-01-16.
 */

public abstract class Tweet implements Tweetable {
    private String message;
    private Date date;
    private ArrayList<Mood> moodList = new ArrayList<Mood>();

    Tweet(String message){
        this.message = message;
        date = new Date();

    }
    Tweet(String message, Date date){
        this.message = message;
        this.date = date;

    }

    public String getMessage(){
        return message;
    }
    public void setMessage(String message) throws TweetTooLongException{
        if(message.length() < 140){
            this.message = message;
        }
        else{
            throw new TweetTooLongException();
        }
    }
    public void addMood(Mood mood){
        moodList.add(mood);
    }
    public Date getDate(){
        return date;
    }
    public void setDate(Date date){
        this.date = date;
    }
    public abstract Boolean isImportant();


}
