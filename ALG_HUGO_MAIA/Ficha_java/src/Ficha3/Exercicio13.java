package Ficha3;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {

        //ler variaveis
        int valor_max, valor_min, incremento=5;

        // entrada

        Scanner input = new Scanner(System.in);

        System.out.println("valor minimo");
        valor_min=input.nextInt();
        System.out.println("valor maximo");
        valor_max=input.nextInt();



        while (valor_min<=valor_max){
            System.out.println(valor_min);
            valor_min+=incremento;
        }







    }
}
