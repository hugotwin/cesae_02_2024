package Ficha3;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        // criar variavel
        int valor_final, incremento, somatorio = 0;
        // ler variaveis
        Scanner input = new Scanner(System.in);

        System.out.println("indique um valor ");

        valor_final = input.nextInt();

        System.out.println("indique o incremento");

        incremento = input.nextInt();


        while (somatorio < valor_final) {

            System.out.println(somatorio);

            somatorio = somatorio + incremento;


        }


    }
}
