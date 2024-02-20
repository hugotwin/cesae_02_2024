package Ficha2;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        // criar variaveis
        int saldo, retirar;
        // ler variaveis
        Scanner input = new Scanner( System.in);
        System.out.println("insira o seu saldo");
        saldo = input.nextInt();
        System.out.println("indique quanto deseja retirar");
        retirar = input.nextInt();

        if ( (saldo-retirar)<0){
            System.out.println("não é possivel a operação");
            System.out.println("saldo atcual : " + saldo);

        }else {
            System.out.println("valor em saldo " + (saldo-retirar));
            System.out.println("valor retirado -"+retirar);

        }
    }
}
