package Ficha6;

import java.util.Scanner;





public class Exercicio7_2 {

    public static void quadrado(String carater)
    {

        int linhas, colunas;



        Scanner input = new Scanner(System.in);
        System.out.println("Indique as colunas");
        colunas = input.nextInt();
        System.out.println("Indique as linhas");
        linhas = input.nextInt();
        String [][] quadrado = new String[colunas][linhas];


        for (int n = 0; n<colunas; n++)
        {
            for(int i =0; i<linhas; i++)

                if (n==0||n==(linhas-1) || i==0 || i == (linhas-1))
                {
                    quadrado[n][i] = carater;
                }else{quadrado[n][i] = " ";}



        }


        for ( String [] n : quadrado)
        {
            for (String i:n)
            {
                System.out.print(i);
            }
            System.out.println("");

        }

    }


    public static void main(String[] args) {

    quadrado("z");



    }
}
