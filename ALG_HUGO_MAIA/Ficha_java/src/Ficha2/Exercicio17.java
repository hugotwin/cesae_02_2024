package Ficha2;

import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {

        // criar variaveis

        int saldo;

        // ler variaveis

        Scanner input = new Scanner(System.in);

        System.out.println("indique o saldo médio");
        saldo = input.nextInt();

        if (saldo <= 2000) {
            System.out.println("nenhum credito" +
                    " Saldo médio : " + saldo);
        } else if (saldo > 2000 && saldo <= 4000) {

            System.out.println("O valor de crédito : " + (saldo * 0.2) +
                    " Saldo médio : " + saldo);

        } else if (saldo > 40000 && saldo <= 60000) {
            System.out.println("valor de crédito : " + (saldo * 0.3) +
                    " Saldo médio : " + saldo);

        } else {
            System.out.println("valor de crédito  : " + (saldo * 0.4) +
                    " Saldo médio : " + saldo);

        }


    }
}
