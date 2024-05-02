package Exercicio2;

import java.io.*;

public class Logger {

   private static String ficheiro;

   private static Logger logger;

    private Logger(String ficheiro) {
        this.ficheiro = ficheiro;
    }

    public static Logger getLogger(String ficheiro) {

            if(logger==null){

                logger   = new Logger(ficheiro);}

                return logger;
        }



    public void log(String messagem) throws IOException {

        File file = new File(this.ficheiro);
       FileWriter escritor = new FileWriter(file,true);

        escritor.append(messagem);
        escritor.close();

    }






    }

