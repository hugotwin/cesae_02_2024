package Ficha1;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        // criar variaveis
        double lado1, lado2, area , perimetro;
        //ler o valor das variaveis

        Scanner input_ = new Scanner( System.in);
        System.out.println("insira o comprimentoo do 1 lado :");
        lado1= input_.nextInt();
        System.out.println("Insira o comprimento do lado 2 :");
        lado2= input_.nextInt();

        // efectuar calculos

        area = lado2*lado1;
        perimetro= (2*lado2)+(2*lado1);

        System.out.println(" a area do rectangulo é : " + area);
        System.out.println("O perimetro do rectangulo é : " + perimetro );





    }
}
