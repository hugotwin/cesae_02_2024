package Ficha1;

import java.util.Scanner;
public class Exercicio02 {
    public static void main(String[] args) {

        //declarar variaveis

        int num1, num2,soma, subtracao, multiplicacao, divisao;

        // efectuar as entrada valor 1
        Scanner input_ = new Scanner(System.in);
        System.out.println("Insira um valor número 1");
        num1= input_.nextInt();
        //efectuar a entrada de valor 2
        System.out.println("Insira o valor 2");
        num2=input_.nextInt();
        //efectuar calclculos
        soma = num1+num2;
        subtracao= num1-num2;
        multiplicacao=num1*num2;
        divisao=num1/num2;

        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(multiplicacao);
        System.out.println(divisao);




    }
}
