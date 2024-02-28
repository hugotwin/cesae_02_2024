package Ficha1;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        // criar variaveis

        double raio, pi=3.1415, area;
        // ler as variaveis
        Scanner input_ = new Scanner(System.in);
        System.out.println("insira o valor do raio :");
        raio = input_.nextInt();
        area = raio*raio*pi;

        System.out.println("A sua área : " + area);
    }
}


