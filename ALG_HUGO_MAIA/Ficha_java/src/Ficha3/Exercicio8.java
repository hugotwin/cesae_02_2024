package Ficha3;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        // criar variaveis
        int valor, n=0, valor_;

        // ler variaveis
        Scanner input = new Scanner(System.in);
        System.out.println("indique o valor ");
        valor = input.nextInt();
        valor_=valor;

        while ( n<6){

            valor_-=1;

            System.out.println(valor_);

            n++;

        }

        n=0;

        while ( n<6){

            valor+=1;

            System.out.println(valor);

            n++;

        }


    }
}
