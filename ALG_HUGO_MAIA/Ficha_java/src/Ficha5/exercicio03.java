package Ficha5;

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {

        // criar variaveis
        int [] values = new int[10];
        int max=0;
        // input data
        Scanner input = new Scanner(System.in);

        for ( int i=0; i<10; i++){

            System.out.println("indique um valor para a posicao  " + i );


            values[i]=input.nextInt();


        }
        System.out.println("fim de inserção");
        System.out.println("");


        for (int j=0 ; j<10; j++){


            if ( values[j] >max ){
                max=values[j];
            }
        }

        System.out.println("o valor maximo é : "+ max);



    }
}
