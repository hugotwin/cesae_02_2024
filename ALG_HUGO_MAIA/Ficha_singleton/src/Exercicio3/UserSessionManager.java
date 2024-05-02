package Exercicio3;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.Date;
import java.util.Random;

public class UserSessionManager {

    private static UserSessionManager userSessionManager;
    private int sessionToken;
    private long lastAcess;

    private UserSessionManager() {
        Random rand = new Random();
       Date hour = new Date();
        this.sessionToken = rand.nextInt(100);
        this.lastAcess =  hour.getTime();
    }


    public static UserSessionManager getUserSessionManager(){

        if(userSessionManager==null){

            userSessionManager= new UserSessionManager();

        }
        return userSessionManager;
    }


    public int getSessionToken() {
        return sessionToken;
    }

    public long getLastAcess() {
        return lastAcess;
    }


    public void updateLastAcess() {
        Date hour = new Date();
        this.lastAcess =  hour.getTime();
    }
}
