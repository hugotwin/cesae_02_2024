package Ficha5;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class exercio_02_ {

    public static void main(String[] args) {

        ArrayList values = new ArrayList();
        int n=1;

        Scanner input = new Scanner(System.in);

        while (n!=0){

            System.out.println("indique o valor");
            n= input.nextInt();
            values.add(n);

            System.out.println("");
        }

        for ( int j=0; j<values.size(); j++){

            System.out.println(values.get(j));

        }






    }
}
