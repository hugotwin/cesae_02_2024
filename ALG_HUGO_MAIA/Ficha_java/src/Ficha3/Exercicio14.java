package Ficha3;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {

        // criar variavel
        int valor, quantidade, contador = 0, valor_max = 0;
        String ordenacao;

        // entrada de variaveis

        Scanner input = new Scanner(System.in);
        System.out.println("quantidade de numeros ");
        quantidade = input.nextInt();

        while (contador < quantidade) {


            valor = input.nextInt();

            System.out.println(valor);

            if (valor > valor_max) {

                ordenacao = "Crescente";
            } else {
                ordenacao = "Não ordenada";
            }

            valor_max = valor;

            contador++;

            if (contador == quantidade) {

                System.out.println(ordenacao);
            }


        }


    }
}
