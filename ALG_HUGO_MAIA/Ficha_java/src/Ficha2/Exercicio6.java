package Ficha2;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        // criar variaveis

        int num;
        // ler variaveis

        Scanner input_ = new Scanner( System.in);
        System.out.println(" Indique um numero ");
        num = input_.nextInt();

        if ( num%2 ==0){
            System.out.println("numero par");
        }else{
            System.out.println(" numero impar ");
        }


    }
}
