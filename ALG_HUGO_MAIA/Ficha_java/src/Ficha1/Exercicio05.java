package Ficha1;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        // declarar as variaveis
        double valor1, valor2, valor3, media;
        //ler valores

        Scanner input_ = new Scanner(System.in);
        System.out.println("insira o valor 1 :");
        valor1= input_.nextDouble();
        System.out.println("insira o valor 2");
        valor2= input_.nextDouble();
        System.out.println("insira o valor 3");
        valor3=input_.nextDouble();
        media=(valor1*0.2+valor2*0.3+valor3*0.5);

        //apresentar os valores

        System.out.println("media poderada é : " + media);




    }
}
