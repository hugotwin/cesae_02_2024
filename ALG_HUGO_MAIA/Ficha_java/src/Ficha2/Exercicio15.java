package Ficha2;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {


        //Criar variaveis
        int num1, num2, num3;
        String escolha;
        //ler variaveis
        Scanner input = new Scanner(System.in);
        System.out.println("insira um valor");
        num1 = input.nextInt();
        System.out.println("insira um valor");
        num2 = input.nextInt();
        System.out.println("insira um valor");
        num3 = input.nextInt();

        System.out.println("Quer ordenar por crescente 'C' ou Decrescente 'D'");
        escolha = input.next();

        if (escolha.toUpperCase().equals("C")) {

            if (num1 > num2 && num2 > num3) {
                System.out.println(num1 + ";" + num2 + ";" + num3);

            } else if (num2 > num1 && num1 > num3) {
                System.out.println(num2 + ";" + num1 + ";" + num3);

            } else if (num3 > num1 && num1 > num2) {
                System.out.println(num3 + ";" + num1 + ";" + num2);

            } else if (num3 > num2 && num2 > num1) {
                System.out.println(num3 + ";" + num2 + ";" + num1);

            } else if (num2 > num3 && num3 > num1) {
                System.out.println(num2 + ";" + num3 + ";" + num1);

            } else if (num1 > num3 && num3 > num2) {
                System.out.println(num1 + ";" + num3 + ";" + num2);
            }
        } else if (escolha.toUpperCase().equals("D")) {

            if (num1 < num2 && num2 < num3) {
                System.out.println(num1 + ";" + num2 + ";" + num3);

            } else if (num2 < num1 && num1 < num3) {
                System.out.println(num2 + ";" + num1 + ";" + num3);

            } else if (num3 < num1 && num1 < num2) {
                System.out.println(num3 + ";" + num1 + ";" + num2);

            } else if (num3 < num2 && num2 < num1) {
                System.out.println(num3 + ";" + num2 + ";" + num1);

            } else if (num2 < num3 && num3 < num1) {
                System.out.println(num2 + ";" + num3 + ";" + num1);

            } else if (num1 < num3 && num3 < num2) {
                System.out.println(num1 + ";" + num3 + ";" + num2);

            }
        }
    }
}
