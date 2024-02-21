package Ficha3;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {

        // criar  variaveis

        int valor=0, contador=-1, somatorio=0;

        Scanner input = new Scanner(System.in);



        while( valor !=-1){

            somatorio+=valor;
            contador=contador+1;
            System.out.println(contador+" : " +somatorio);
            System.out.println("indique um valor , -1 para sair");
            valor = input.nextInt();

        }


        System.out.println("media : " + (somatorio/contador));

    }
}
