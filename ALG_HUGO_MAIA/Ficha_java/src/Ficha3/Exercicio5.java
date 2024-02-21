package Ficha3;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {


        // criar variaveis
        int valor, contador = 0;
        String frase;

        // ler variaveis
        Scanner input = new Scanner(System.in);
        System.out.println("indique o valor maximo que se repete a frase");
        valor = input.nextInt();
        System.out.println("indique a frase que quer que se repita");
        frase = input.next();




        while (contador < (valor + 1)) {

            System.out.println(frase);
            contador++;
        }
    }
}
