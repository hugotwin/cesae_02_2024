package Ficha2;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        // criar variavaeis
        int num1, num2, num3;
        // fazer entrada de variaveis

        Scanner input = new Scanner(System.in);
        System.out.println("insere um valor");
        num1= input.nextInt();
        System.out.println("insere um valor");
        num2= input.nextInt();
        System.out.println("insere um valor");
        num3= input.nextInt();

        if ( num1>=num2 && num2>=num3){
            System.out.println("o numero maior " + num1);
        } else if (num2>=num3 && num2>=num1 ) {
            System.out.println("o numero maior " + num2);

        }else{
            System.out.println("o numero maior " + num3);
        }


    }
}
