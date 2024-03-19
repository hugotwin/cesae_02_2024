package Ficha7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercicio5 {

    public static void somar_numeros(String caminho) throws FileNotFoundException {
        File ficheiro = new File(caminho);
        Scanner conteudo = new Scanner(ficheiro);
        int soma = 0;


        while (conteudo.hasNextLine()) {

            String[] valores = conteudo.nextLine().split(";");
            for (String valor : valores) {

                System.out.println(valor);
                String[] numeros = valor.split(",");

                for (String n : numeros) {
                    soma += Integer.parseInt(n);

                }
                System.out.println(soma);
                soma = 0;


            }


        }


    }

    public static void main(String[] args) {

        try {

            somar_numeros("C:\\Users\\softdev\\Desktop\\cesae_02_2024\\ALG_HUGO_MAIA\\Ficha_java\\src\\Ficha7\\text_csv.csv");

        } catch (Exception e) {
            System.out.println(e);
        }


    }


}
