package Ficha2;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        // criar variaveis de entrada

        double num1, taxa_20=0.2, taxa_30=0.3;

        //ler variaveis
        Scanner input_ = new Scanner( System.in);
        System.out.println("Insira um valor : ");
        num1= input_.nextInt();
        if ( num1<=15000){
            System.out.println(" taxa de 20% : "+ (taxa_20*num1) );

        } else { System.out.println(" taxa de 30% : " + (taxa_30*num1) );

        }

    }
}

