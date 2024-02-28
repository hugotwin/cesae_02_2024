package Ficha5;

import java.util.Random;
import java.util.Scanner;

public class exercicio09 {
    public static void main(String[] args) {
        int [][] value = new int[5][5];
        int n, soma =0;
        Random rd = new Random();
        //rd.nextInt(100);

        Scanner input = new Scanner(System.in);



        for(int i=0 ; i<5;i++ ){

            for ( int j=0; j<5; j++){


                n=rd.nextInt(100);

                soma+=n;
                value[i][j]=n;
                System.out.println(n);
            }
        }


        for (int [] valor : value) {
            for (int r : valor) {

                System.out.print(r+", ");

            }
            System.out.println("");
        }

        System.out.println(soma);





    }
}
