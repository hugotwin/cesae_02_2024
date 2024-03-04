package Ficha3;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {

        int num, multiplicador =1;

        Scanner input = new Scanner(System.in);
        System.out.println("insirar o valor");

        num = input.nextInt();

        while (num>0){

            multiplicador *=num;
            num--;



        }
            System.out.println(multiplicador);

    }
}
