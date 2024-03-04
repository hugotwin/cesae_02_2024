package Ficha5;

import java.util.ArrayList;
import java.util.Random;

public class exercicio13 {
    public static void main(String[] args) {

        Random input_ = new Random();
        int soma =0;

        // criação dos arrays


       int [][] lista1 = new int[4][4];

        for (int i = 0; i<4;i++)
        {

            for ( int j =0; j<4; j++)
            {


               lista1[i][j]= input_.nextInt(10);



            }
            System.out.println("");


        }
        //---------

        for( int i = 0; i<4;i++)
        {

           for ( int j =0; j<4; j++)
           {


               System.out.print(lista1[i][j]);
               if (i==j)

               {
                   soma+=lista1[i][j];

               }



           }
            System.out.println("");

        }

        System.out.println(soma);

    }
}
