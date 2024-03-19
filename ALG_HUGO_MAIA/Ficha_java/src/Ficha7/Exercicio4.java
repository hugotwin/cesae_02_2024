package Ficha7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercicio4 {


    public static void ler_csv(String caminho) throws FileNotFoundException {
        File file2 = new File(caminho);
        Scanner conteudo = new Scanner(file2);
        while (conteudo.hasNextLine()) {
            System.out.println(conteudo.nextLine());
        }


    }


    public static void main(String[] args) {


        try {

            ler_csv("C:\\Users\\softdev\\Desktop\\cesae_02_2024\\ALG_HUGO_MAIA\\Ficha_java\\src\\Ficha7\\texto.txt");
        } catch (Exception e) {

            System.out.println(e);
        }


    }
}
