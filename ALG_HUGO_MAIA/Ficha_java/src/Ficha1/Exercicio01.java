package Ficha1;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        int num1, num2, soma;

        Scanner input = new Scanner(System.in);
        System.out.println("Insira o primeiro valor :");
        num1= input.nextInt();
        System.out.println("Insira o segundo valor :");
        num2 = input.nextInt();

        soma = num1+num2;

        System.out.println("A soma é " + soma);

    }
}
