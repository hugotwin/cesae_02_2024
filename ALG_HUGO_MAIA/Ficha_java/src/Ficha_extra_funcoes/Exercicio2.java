package Ficha_extra_funcoes;

import java.util.Scanner;

public class Exercicio2 {


    public static double media()
    {
       int quantidade=0, n=0;
       double soma=0;
        Scanner input = new Scanner(System.in);
        System.out.println("indique a quantidade de numeros que deseja inserir");
        quantidade = input.nextInt();
        double [] valores = new double[quantidade];

        while( n<quantidade)
        {
            System.out.println("Insira o numero ");
            valores[n]= input.nextInt();
            n++;
        }
        for(int r=0; r<quantidade; r++)
        {
            soma+=valores[r];

        }
        soma=soma/quantidade;








        return soma;


    }


    public static void main(String[] args) {

        System.out.printf("%.2f",media());

    }
}
