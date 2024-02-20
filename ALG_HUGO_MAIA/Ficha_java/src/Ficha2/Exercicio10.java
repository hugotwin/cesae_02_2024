package Ficha2;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {

        // criar as variaveis
        double num1, num2;
        String tipo;
        Scanner input = new Scanner(System.in);
        System.out.println("que tipo de opção aritemética  deseja +,/,*,-");
        tipo = input.next();
        System.out.println("indique o valor 1");
        num1 = input.nextInt();
        System.out.println("indique o segundo valor ");
        num2 = input.nextInt();


        if (tipo.equals("*")) {

            System.out.println("o resultado : " + (num1 * num2));

        } else if (tipo.equals("/")) {
            System.out.println("o resultado : " + (num1 / num2));

        } else if (tipo.equals("-")) {

            System.out.println("o resultado : " + (num1 - num2));

        } else if (tipo.equals("+")) {
            System.out.println("o resultado " + (num1 + num2));

        } else {
            System.out.println("invalida  escolha");
        }


    }
}
