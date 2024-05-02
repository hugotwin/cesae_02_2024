package Exercicio2;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("logger.txt");

        try{
        logger.log("log 1 : vvariavel x");}catch (FileNotFoundException e){} catch (IOException e) {
            throw new RuntimeException(e);
        }


        Logger Mylogger = Logger.getLogger("logger.txt");

        try
        {
            Mylogger.log("log 1 : vvariavel x");
        }catch (IOException e)
        {

        }





    }






}
