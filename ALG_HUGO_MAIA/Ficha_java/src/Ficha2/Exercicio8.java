package Ficha2;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        // ler variaveis de entrada
        Double nota1, nota2, nota3, media, n1=0.25, n2= 0.35, n3= 0.4;
        Scanner input_ = new Scanner(System.in);
        System.out.println("insira a nota 1");
        nota1 = input_.nextDouble();
        System.out.println("insira a nota 2");
        nota2 = input_.nextDouble();
        System.out.println("insira a nota 3");
        nota3 = input_.nextDouble();

        media =nota1*n1+nota2*n2+nota3*n3;
        if ( media <= 9.5){
            System.out.println("Reprovado");

        }else {
            System.out.println("Aprovado");
        }


    }
}
