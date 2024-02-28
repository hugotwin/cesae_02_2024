package Ficha5;

import java.util.Scanner;

public class exercicio06 {

    public static void main(String[] args) {

        // criar variaveis
        int [] values = new int[10];
        int max=0, valor=0;

        // input data
        Scanner input = new Scanner(System.in);

        for ( int i=0; i<10; i++){

            System.out.println("indique um valor para a posicao  " + i );


            values[i]=input.nextInt();


        }

        for (int j=0 ; j<10; j++){

            System.out.println("insira um valor");
            valor= input.nextInt();

            if(valor%2==0){
                System.out.println("teste1");

                if (valor>max){
                    System.out.println("teste2");


                    max=(valor);

                }

            }

            System.out.println("o valor maximo par : "+ max);
        }

    }
}
