/*



  *Tweet
  * Version 1.0
 * Copyright © 2018 Team X. CMPUT301. University of Alberta - All Rights Reserved. You may use, distribute, or modify this code under terms and conditions of the Code of Student Behaviour at University of Alberta. You can find a copy of the license in this project. Otherwise please contact contact@abc.ca
 */





package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents a tweet.
 * @author cameronmcintyre
 * @version 1.5
 * @see NormalTweet
 * @see ImportantTweet
 */
public abstract class Tweet implements Tweetable {
    private String message;
    private Date date;

    /**
     * Constructs a tweet object
     * @param message sets the message for a tweet.
     *
     */
    Tweet(String message){

        this.message = message;
        date = new Date();
//        message = message;
    }

    /**
     * Constructs a tweet object
     *
     * @param message tweet message
     * @param date tweet date
     */
    Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    public String getMessage(){
        return message;
    }

    /**
     * Sets tweet message.
     *
     * @param message tweet message
     * @throws TweetTooLongException the tweet message is over 140 characters
     */
    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() < 140){
            this.message = message;
        }
        else{
            throw new TweetTooLongException();
        }
    }

    /**
     *
     * @return returns the date of the tweet
     */
    public Date getDate(){
        return date;
    }

    /**
     *
     * @param date the date to be set for the tweet
     */

    public void setDate(Date date){
        this.date = date;
    }

    /**
     *
     * @return Returns a boolean True or False
     */
    public abstract Boolean isImportant();

    /**
     *
     * @return Returns the date and message of a tweet as strings
     */

    public String toString() {
        return date.toString() + " | " + message;
    }

}
