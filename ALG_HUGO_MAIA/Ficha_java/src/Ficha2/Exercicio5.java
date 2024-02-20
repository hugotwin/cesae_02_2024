package Ficha2;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        // ler variavies
        int num1, num2, max, min;

        // dar entrada das variaveis
        Scanner input_ = new Scanner(System.in);
        System.out.println("Entrada do primero valor");
        num1 = input_.nextInt();
        System.out.println("Entrada do segundo valor");
        num2 = input_.nextInt();

         //  se for o maior é o maximo se for o menor e o minimo
        if ( num1<num2) {
            max= num2;
            min=num1;
        }else{
            max= num1;
            min=num2;

        }
        System.out.println("o maior  : " + max );
        System.out.println("o menor : " + min );





    }
}
