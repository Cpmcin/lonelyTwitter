package ca.ualberta.cs.lonelytwitter;

/**
 * Created by dezfuli on 1/16/18.
 */
import java.util.Date;

/**
 * Represents a normal tweet
 * @author cameronmcintyre
 * @see Tweet
 * @see ImportantTweet
 * @version 1.5
 */

public class NormalTweet extends Tweet {
    /**
     *
     * @param message Sets the message for a normal tweet
     */
    NormalTweet(String message){
        super(message);
    }

    /**
     *
     * @param message Sets message for normal tweet
     * @param date Sets date for normal tweet
     */

    NormalTweet(String message, Date date){
        super(message, date);
    }

    /**
     *
     * @return returns false because the tweet is typed as not important
     */
    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
