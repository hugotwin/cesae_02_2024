package Ficha1;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        // criar varivaeis
        int valor1, valor2;
        // ler entrada de valores
        Scanner input_= new Scanner(System.in);
        System.out.println("faça a entrada do valor 1");
        valor1= input_.nextInt();
        System.out.println("faça a entrada do valor 2");
        valor2 = input_.nextInt();

        //troca de variveis

        valor2 = valor1+valor2;
        valor1=valor2-valor1;
        valor2=valor2-valor1;



        //valor1=valor2;
        System.out.println("valor 1 :"+ valor1+" valor 2 : "+ valor2 );

    }
}
