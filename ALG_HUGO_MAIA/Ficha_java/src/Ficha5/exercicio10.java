package Ficha5;

import java.util.Random;
import java.util.Scanner;

public class exercicio10 {

    public static void main(String[] args) {

        int [][] value = new int[3][5];
        int n, valor, contador=0;
        Random rd = new Random();
        Scanner input = new Scanner(System.in);
        //rd.nextInt(100);





        for(int i=0 ; i<3;i++ ){

            for ( int j=0; j<5; j++){


                n=rd.nextInt(5);


                value[i][j]=n;
                System.out.print(n);

            }
            System.out.println("");
        }
        System.out.println("indique o valor");

        valor =input.nextInt();


        for(int i=0 ; i<3;i++ ){

            for ( int j=0; j<5; j++){

                if(value[i][j]== valor ){

                    contador++;
                }
            }

        }

        if(contador>0) {
            System.out.println("valor encontra se na matriz : " + valor);
            System.out.println(" ele esta na matriz "+contador+" vezes");}




    }
}
