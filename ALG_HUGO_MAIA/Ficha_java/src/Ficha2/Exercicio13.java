package Ficha2;

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {
        // criar entradas

        int horas, min;
        // ler as entradas

        Scanner input = new Scanner(System.in);
        System.out.println("Horas : ");
        horas = input.nextInt();
        System.out.println("Minutos : ");
        min = input.nextInt();
        if ( horas > 12){
            horas = horas-12;
            System.out.println(horas+":"+min+"PM");
        }else {
            System.out.println(horas + ":" + min + "AM");
        }


    }
}
