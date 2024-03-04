package Ficha_extra_ciclos;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        int valor;
        // ler entradas
        Scanner input = new Scanner(System.in);

        System.out.println("indique um valor");

        valor = input.nextInt();

        for ( int i=1; i<=valor; i++){

            if (i==1 || i%3==0){

            System.out.println(i);}


        }


    }
}
