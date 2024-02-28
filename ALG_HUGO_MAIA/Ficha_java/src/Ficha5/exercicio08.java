package Ficha5;

import java.util.Random;
import java.util.Scanner;

public class exercicio08 {

    public static void main(String[] args) {

        int [][] value = new int[3][3];
        int n, contador1 =0, conatdor2=0;
        //Random rd = new Random();
        //rd.nextInt(100);

        Scanner input = new Scanner(System.in);



        for(int i=0 ; i<3;i++ ){

            for ( int j=0; j<3; j++){

                System.out.println("faça a entrada do valor");
                //n=rd.nextInt(100);
                n= input.nextInt();

                value[i][j]=n;
            }
        }

        for (int [] valor : value) {
            for (int r : valor) {

                System.out.print(r+", ");


            }
            System.out.println("");
        }






    }
}
