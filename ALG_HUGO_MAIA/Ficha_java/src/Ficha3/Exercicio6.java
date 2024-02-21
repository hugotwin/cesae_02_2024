package Ficha3;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {


        // criar variaveis
        int valor_min, valor_max;

        // ler variaveis
        Scanner input = new Scanner(System.in);
        System.out.println("indique o valor de inicio");
        valor_min = input.nextInt();
        System.out.println("indique o valor de fim");
        valor_max = input.nextInt();


        while ( valor_min<(valor_max+1)){

            System.out.println(valor_min);
            valor_min++;
        }



    }
}
