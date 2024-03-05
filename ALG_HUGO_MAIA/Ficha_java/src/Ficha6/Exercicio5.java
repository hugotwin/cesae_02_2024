package Ficha6;

public class Exercicio5 {

    public static int max_value(int[] valor){

         int controle =0;

        for(int n :valor){

            if (n>controle){

                controle =n;
            }

        }

        return controle;

    }

}
