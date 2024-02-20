package Ficha2;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        // criar variaveis
        int escolha;
        //ler variavel
        Scanner input = new Scanner(System.in);
        System.out.println("Escolha uma opçao - 1/2/3/4 " +
                "\n 1) Criar" +
                "\n 2) Actualizar" +
                "\n 3) Eliminar" +
                "\n 4) Opção não valida" +
                "\n ---------------------");
        escolha = input.nextInt();
        if (escolha == 1) {
            System.out.println("criar");
        } else if (escolha == 2) {
            System.out.println("actualizar");
        } else if (escolha == 3) {
            System.out.println("Eliminar");
        } else {
            System.out.println("Opção não valida");
        }
    }
}
