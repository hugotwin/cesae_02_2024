package Ficha7;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercicio1 {


    public static void lerFicheiro(String caminho) throws FileNotFoundException {

        File file = new File(caminho);
        Scanner texto = new Scanner(file);

        System.out.println(texto.nextLine());
        System.out.println(texto.nextLine());

        texto.close();


    }

    public static void main(String[] args) {
        try {
            lerFicheiro("C:\\Users\\softdev\\Desktop\\cesae_02_2024\\ALG_HUGO_MAIA\\Ficha_java\\src\\Ficha7\\texto.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

    }


}
