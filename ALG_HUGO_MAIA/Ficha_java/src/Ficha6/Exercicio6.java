package Ficha6;

import java.util.Scanner;

import static Ficha6.Exercicio5.*;

public class Exercicio6 {

    public static void main(String[] args) {

        int size;
        Scanner input = new Scanner(System.in);
        System.out.println("Qual o tamanho do vetor que deseja");
        size = input.nextInt();


        int[] vetor = new int[size];

        for (int n = 0; n < vetor.length; n++) {
            System.out.println("indique um valor");
            size = input.nextInt();
            vetor[n] = size;


        }
        String opcao;

        do {

            System.out.println("Indique uma opção \n" +
                    "1) Maior Elemento\n" +
                    "2) Menor Elemento\n" +
                    "3) Crescente?\n");
            opcao = input.nextLine().toLowerCase();


            switch (opcao) {
                case "1":
                    System.out.println(max_value(vetor));
                    break;
                case "2":
                    System.out.println(min_value(vetor));
                    break;
                case "3":
                    System.out.println(crescente(vetor));
                    break;
                default:
                    continue;

            }
            System.out.println("deseja continuar se não carregue en não");
        } while (!opcao.equals("n"));


    }
}
