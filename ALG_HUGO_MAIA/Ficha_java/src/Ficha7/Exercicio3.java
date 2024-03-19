package Ficha7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercicio3 {

    public static void leitura_criacao_ficheiro(String caminho) throws FileNotFoundException {

        File ficheiro = new File(caminho);// criar o caminho para o ficheiro antigo
        Scanner conteudo = new Scanner(ficheiro);// ler o conteudo
        File ficheiro2 = new File("C:\\Users\\softdev\\Desktop\\cesae_02_2024\\ALG_HUGO_MAIA\\Ficha_java\\src\\Ficha7\\exercicio3.txt");// criar o caminho do segundo fi«cheiro
        PrintWriter printWriter_ficheiro2 = new PrintWriter(ficheiro2);// criar o ojeto de escrita do ficheiro


        while (conteudo.hasNextLine())// LER LINHA A LINHA
        {
            printWriter_ficheiro2.println(conteudo.nextLine());// LEITURA LINHA A LINHA

        }


        printWriter_ficheiro2.close();


    }

    public static void main(String[] args) {

        try {
            leitura_criacao_ficheiro("C:\\Users\\softdev\\Desktop\\cesae_02_2024\\ALG_HUGO_MAIA\\Ficha_java\\src\\Ficha7\\texto.txt");

        } catch (FileNotFoundException e) {

            System.out.println(e);

        }


    }


}
