package Ficha_01;

import java.util.Scanner;
public class Exercicio07 {
    public static void main(String[] args) {

        // criar varivaeis
        double valor1, valor2, valor3, valorFinal;
        // ler variaveis
        
        Scanner input_ = new Scanner(System.in);
        System.out.println("insiara  o primeiro valor");
        valor1 = input_.nextDouble();
        System.out.println("insiara  o valor2");
        valor2 = input_.nextDouble();
        System.out.println("insiara  o valor3");
        valor3 = input_.nextDouble();

        valorFinal = ((valor1+valor2+valor3)/1.10);




        System.out.println( valorFinal );

    }
}
