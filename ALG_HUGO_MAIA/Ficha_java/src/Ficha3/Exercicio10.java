package Ficha3;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
       // criar variavel
       int valor, valor_min=2 ;
       // ler variaveis
        Scanner input = new Scanner(System.in);

        System.out.println("indique um valor ");

        valor = input.nextInt();

        while (valor !=valor_min){
            if (valor%valor_min==0){
                System.out.println(valor);
            }
            valor--;
        }
        System.out.println(valor_min=2);

    }
}
