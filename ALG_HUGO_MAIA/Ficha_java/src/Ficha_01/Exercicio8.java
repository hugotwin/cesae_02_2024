package Ficha_01;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        //criar variveis
        int minutos=0,segundos=0, i=0, horas;
        // ler as entradas

        while( i<5) {
            Scanner input_ = new Scanner(System.in);
            System.out.println("insira os minutos da canção");
            minutos += input_.nextInt();
            System.out.println("insira os segundos da canção");
            segundos += input_.nextInt();
            i++;
        }

        segundos = segundos + minutos*60;
        horas = segundos/3600;

        minutos = (segundos -(horas*3600))%60;
        segundos = (segundos - (minutos*60));




        System.out.println(horas+ "h" + minutos +"min " + segundos+ "s");




    }
}
