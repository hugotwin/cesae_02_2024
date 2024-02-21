package Ficha2;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        // Criar variavel
        int valor, n_200, n_100, n_50, n_20, n_10, n_5;
        // ler variavel
        Scanner input = new Scanner(System.in);
        System.out.println("indique o valor ");
        valor = input.nextInt();

        if ( valor%5==0){

            n_200=valor/200;
            valor = valor-(n_200*200);
            System.out.println("notas 200 :"+n_200);
            if ( valor !=0){
                n_100= valor/100;
                valor= valor-(n_100*100);
                System.out.println("notas 100 : "+n_100);
            }

            if ( valor !=0){
                n_50=valor/50;
                valor=valor-(n_50*50);
                System.out.println("notas 50 : "+n_50);
            }
            if ( valor !=0){
                n_20=valor/20;
                valor=valor-(n_20*20);
                System.out.println("notas 20 : "+n_20);
            }
            if ( valor !=0){
                n_10=valor/10;
                valor=valor-(n_10*10);
                System.out.println("notas 10 : "+n_10);
            }
            if ( valor !=0){
                n_5=valor/5;
                System.out.println(" notas 5 : "+n_5);
            }




        }






    }
}
