package Ficha6;


import java.util.Scanner;

import static Ficha6.Exercicio3.*;

public class Exercicio7 {

    public static void main(String[] args) {


        /// criar variaveis

        int opcao=6, valor=0;
        boolean running = true;

        Scanner input = new Scanner(System.in);

/*        System.out.println("indica o valor");
        valor = input.nextInt();

        System.out.println("indique a opção:\n" +
                " 1) Par ou impar\n" +
                " 2) Positivo ou negativo \n 3)" +
                " Primo ou não primo \n" +
                " 4) Perfeito ou não perfeito \n" +
                " 5) Triangular ou não triangular" +
                " 6) Trocar de numero") ;
        opcao = input.nextInt();*/

        while (running){




            System.out.println("indica o valor");
            valor = input.nextInt();

            System.out.println("indique a opção:\n" +
                    " 1) Par ou impar\n" +
                    " 2) Positivo ou negativo \n 3)" +
                    " Primo ou não primo \n" +
                    " 4) Perfeito ou não perfeito \n" +
                    " 5) Triangular ou não triangular" +
                    " 6) Trocar de numero");
            opcao = input.nextInt();




                switch (opcao) {
                    case 1:
                        System.out.println(par(valor));
                        running = false;
                        break;
                    case 2:
                        System.out.println(positivo(valor));
                        running = false;
                        break;

                    case 3:
                        System.out.println(primo(valor));
                        running = false;
                        break;
                    case 4:
                        System.out.println(perfeito(valor));
                        running = false;
                        break;

                    case 5:
                        System.out.println(perfeito(valor));
                        running = false;
                        break;

                    case 6:

                        System.out.println("indique um valor");
                        valor = input.nextInt();
                        break;

                    default:

                        System.out.println("indique um a opcao valida : ");
                        opcao = input.nextInt();
                        break;

                }


            }


        }



    }

