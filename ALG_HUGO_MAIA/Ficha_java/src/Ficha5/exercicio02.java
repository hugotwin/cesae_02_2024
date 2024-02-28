package Ficha5;

import java.util.Scanner;

public class exercicio02 {

    public static void main(String[] args) {

        // criar variaveis
        int[] valores = new int [12];
        int soma=0, valor =0, contador=0;
        Scanner input = new Scanner(System.in);

        for ( int i=0;i<12;i++){
            System.out.println("indique os valores da  comissão mesal mês : "+(i+1));
            valor= input.nextInt();
            soma+=valor;
            valores[i]=valor;
            }

       for(int n : valores){

            System.out.println(valores[contador]+", ");
            contador++;
        }


        for(int j =0; j<12; j++) {

            System.out.println(valores[j]);

        }



    }
}
