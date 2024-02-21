package Ficha3;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {


        // criar variavel
        int valor = 0, contador_0_25 = 0, contador_26_50 = 0, contador_51_75 = 0, contador_76_100 = 0;
        // ler variaveis
        Scanner input = new Scanner(System.in);


        while (valor >= 0) {

            System.out.println("indique um valor ");

            valor = input.nextInt();
            if (valor < 26) {
                contador_0_25++;

            } else if (valor <51 ) {
                contador_26_50++;
            } else if (valor < 76 ) {
                contador_51_75++;
            } else if (valor < 100) {
                contador_76_100++;}

        }

        System.out.println("[00,25] :"+contador_0_25);
        System.out.println("[26,50] :"+contador_26_50);
        System.out.println("[51,75] :"+contador_51_75);
        System.out.println("[76,100] :"+contador_76_100);


    }
}
