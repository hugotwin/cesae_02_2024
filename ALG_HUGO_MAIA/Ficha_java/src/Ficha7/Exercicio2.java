package Ficha7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Exercicio2 {

    public static void criarFicheiro(String caminho) throws FileNotFoundException {
        String conteudo = "criacao d eum ficheiro; \n  sim consegui criar o ficheiro;";
        File ficheiro = new File(caminho);
        PrintWriter printWriter = new PrintWriter(ficheiro);

        printWriter.println(conteudo);


        printWriter.close();


    }


    public static void main(String[] args) {
        try {


            criarFicheiro("C:\\Users\\softdev\\Desktop\\cesae_02_2024\\ALG_HUGO_MAIA\\Ficha_java\\src\\Ficha7\\exemplo.txt");

        } catch (FileNotFoundException e) {
            System.out.println(e);
        }


    }
}
