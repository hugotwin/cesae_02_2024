package Ficha7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;




public class Exercicio7 {





    public static String lerFicheiro(String caminho) throws FileNotFoundException {

        int numero_linhas=0, numero_palavras=0;

        String [] array = {";",".", "-","*","\"","?","!","'"};

        File ficheiro = new File(caminho);

        Scanner conteudo = new Scanner(ficheiro);

        while(conteudo.hasNextLine())
        {

            String linhas = conteudo.nextLine();

                        String [] palavras = linhas.split("");
                        if(palavras[0].equals("")){
                        for (String n: palavras){

                            if (!n.isEmpty())

                            {
                                numero_palavras++;
                            }

                        }
                     }
            numero_linhas++;
        }

       return "numero de linhas : "+ numero_linhas+" numero de palavras : "+numero_palavras+"";

    }




    public static void main(String[] args) {

        try{

            System.out.println(lerFicheiro("C:/Users/softdev/Desktop/cesae_02_2024/ALG_HUGO_MAIA/Ficha_java/src/Ficha7/exercicio_07.txt"));
        }catch(Exception e){
            System.out.println(e);
        }




    }














}
