package Ficha3;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        // criar variaveis
        int valor, contador=0;

        // ler variaveis
        Scanner input = new Scanner(System.in);
        System.out.println("indique o valor maximo");
        valor = input.nextInt();


        while ( contador<(valor+1)){

            System.out.println(contador);
            contador++;
        }

    }
}

