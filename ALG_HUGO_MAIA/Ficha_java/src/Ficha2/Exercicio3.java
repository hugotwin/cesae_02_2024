package Ficha2;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        //criar variaveis

        double num1, taxa_20= 0.2, taxa_30= 0.3,  taxa_35=0.35, taxa_40=0.4;

        // ler entrada de variaveis
        Scanner input_ = new Scanner( System.in);
        System.out.print("Indique os seu ordenado :");
        num1 = input_.nextInt();
        if( num1 <= 1500){
            System.out.println("taxa de 20% : " + (num1*taxa_20));
        }else if (num1<=20000) {
            System.out.println("taxa de 30% : " +  ( num1*taxa_30));
        }else if (num1<=25000) {
            System.out.println("taxa de 35% : " + (num1 * taxa_35));
        }else{
            System.out.println("taxa de 40% : " + (num1 * taxa_40));}


    }
}

