package Ficha2;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        //criar variaveis
        int chegada;

        //ler as variaveies d entrada

        Scanner input_= new Scanner(System.in);
        System.out.println("indique em que lugar chegou");
        chegada = input_.nextInt();

        switch (chegada){
            case 1:
                System.out.println("Ganhou 10 pontos ");
                break;
            case 2:
                System.out.println("Ganhou 8 pontos ");
                break;
            case 3:
                System.out.println("Ganhou 6 pontos ");
                break;
            case 4:
                System.out.println("Ganhou 5 pontos ");
                break;
            case 5:
                System.out.println("Ganhou 4 pontos ");
                break;
            case 6:
                System.out.println("Ganhou 3 pontos ");
                break;
            case 7:
                System.out.println("Ganhou 2 pontos ");
                break;
            case 8:
                System.out.println("Ganhou 1 pontos ");
                break;
            default:
                System.out.println("não recebe pontos");

        }






    }
}
