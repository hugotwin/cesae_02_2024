package Ficha3;

import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {

        int num, num2=0, soma=0, valor=0;

        Scanner input = new Scanner(System.in);
        System.out.println("insirar o valor");

        num = input.nextInt();




        while (num>0){
            valor=num;


                while(num2<(num+1)){

                    soma+=valor;
                    valor-=1;

                num2+=1;

                System.out.println(soma);}

            num-=1;
            num2=0;






            }



    }
}
