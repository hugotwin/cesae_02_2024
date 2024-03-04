package Ficha6;

import java.util.Scanner;

public class Exercicio2 {


    public  static void numeros()
    {
        Scanner input = new Scanner(System.in);

        int valor=0;
        int contador = 0 ;


        while( valor>=0)

        {
            System.out.println("Indique um valor");
            valor = input.nextInt();

            contador=0;

            while(contador<valor)

            {
                System.out.println("*");
                contador++;
            }


        }
    }

    public static void main(String[] args) {


       numeros();



    }
}
