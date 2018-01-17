package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by cameronmcintyre on 2018-01-16.
 */

public abstract class Mood {
    private Date date;


    Mood(){
        date = new Date();

    }
    Mood(Date date){
        this.date = date;
    }
    public Date getDate(){
        return date;
    }
    public abstract String mood();

}
