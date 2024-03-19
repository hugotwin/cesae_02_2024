package Ficha7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercicio6 {

    public static void pessoa_mais_velha(String caminho) throws FileNotFoundException {
        File ficheiro = new File(caminho);
        Scanner conteudo = new Scanner(ficheiro);
        int max = 0 , contador=0, valor=0;
        String nome="";





        conteudo.nextLine();

        while (conteudo.hasNextLine()) {


            String linha = conteudo.nextLine();
            linha = linha.replace(";", "");
            String[] linhas = linha.split(",");

                if (Integer.parseInt(linhas[1])>max||max==0)
                {
                    max=Integer.parseInt(linhas[1]);
                    nome=linhas[0];



                }



        }

        System.out.println(nome);


    }


    public static void main(String[] args) {

        try {
            pessoa_mais_velha("C:\\Users\\softdev\\Desktop\\cesae_02_2024\\ALG_HUGO_MAIA\\Ficha_java\\src\\Ficha7\\idades.txt");
        } catch (Exception e) {
            System.out.println(e);
        }
    }


}
