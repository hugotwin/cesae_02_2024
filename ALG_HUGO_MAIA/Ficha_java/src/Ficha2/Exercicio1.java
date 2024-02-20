package Ficha2;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        // criar variaveis
        int num1, num2;
        //fazer entrada de variaveis
        Scanner input_ = new Scanner( System.in);
        System.out.print("Entrada de primeiro valor : ");
        num1= input_.nextInt();
        System.out.print("Entrada de segundo valor : ");
        num2= input_.nextInt();

        if (num1<num2){

            System.out.println(num2);
        }else {
            System.out.println(num1);
        }

    }
}
