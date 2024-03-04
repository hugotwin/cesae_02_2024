package Ficha_extra_ciclos;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        // criar entrada

        int valor, r1=0, soma=0, r3=0;
        // ler entradas
        Scanner input = new Scanner(System.in);

        System.out.println("indique um valor");


        valor = input.nextInt();

        soma=0;
        r1=1;




        for (int j=valor;j>2;j--) {






            for (int i = 1; i<=(j-1); i++) {



                soma+=valor;


                System.out.println("j "+j);
                System.out.println("i "+i);

                System.out.println(soma);
                System.out.println("numero voltas "+r1);





            }
            r1--;
            valor=soma;



        }


    }
}
