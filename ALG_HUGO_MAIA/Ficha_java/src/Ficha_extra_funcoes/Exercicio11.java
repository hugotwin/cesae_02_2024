package Ficha_extra_funcoes;

import java.util.Scanner;

public class Exercicio11 {
/**

    public static String jogoVelha() {
        int coluna, linha, a_vex = 0, contador = 0, contador1 = 0, contador2 = 0;
        String jogador1 = " X | ";
        String jogador2 = " * | ";
        String verdadeiro="";


        String[][] array = new String[3][3];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {

            for (int n = 0; n < 3; n++) {

                array[i][n] = "" + i + "" + n + "| ";

            }
        }


        for (int i = 0; i < 3; i++) {

            for (int n = 0; n < 3; n++) {

                System.out.print(array[i][n]);
                ;

            }
            System.out.println("");
        }


        while (contador < 9) {


<<<<<<< HEAD
            if (a_vex == 0) {
                while (verdadeiro<1){
                System.out.println("jogador 1 escolha uma posição linha ");
=======
            if (a_vex == 0 ){

                while (!verdadeiro.equals(jogador1)){
                System.out.println("jogador 1 escolha uma posição linha - insira um numero ");
>>>>>>> 6dd8f85d2dc7ccea069e2ccf6054ef53922b9087
                linha = input.nextInt();
                System.out.println("jogador 1 escolha uma posição coluna - insira um numero");
                coluna = input.nextInt();
                a_vex = 1;
<<<<<<< HEAD

                if( array[linha][coluna] == jogador1){

                    verdadeiro=-1;

=======
                if(linha>=3 || coluna>=3 || linha <0 || coluna <0 || array[linha][coluna].equals(jogador1) || array[linha][coluna].equals(jogador2) ){
>>>>>>> 6dd8f85d2dc7ccea069e2ccf6054ef53922b9087

                    System.out.println("\nEscolha outra linha e coluna a que escolheu ja foi inserida, " +
                            "\nou insira um valor correcto de linha e coluna");

                }else {
                    array[linha][coluna] = jogador1;
                    verdadeiro=jogador1;

                }

<<<<<<< HEAD
                verdadeiro=0;

=======
                }
                verdadeiro="";
>>>>>>> 6dd8f85d2dc7ccea069e2ccf6054ef53922b9087


            } else {

                while (!verdadeiro.equals(jogador1)) {

                    System.out.println("jogador 2 escolha uma posição linha ");
                    linha = input.nextInt();
                    System.out.println("jogador 2 escolha uma posição coluna ");
                    coluna = input.nextInt();
                    a_vex = 0;
                    if( linha>=3 || coluna>=3 || linha <0 || coluna <0 || array[linha][coluna] == jogador1 || array[linha][coluna] == jogador2 ){

                        System.out.println("\nEscolha outra linha e coluna a que escolheu ja foi inserida, " +
                                "\nou insira um valor correcto de linha e coluna");
                    }else {
                        array[linha][coluna] = jogador2;
                        verdadeiro=jogador1;
                    }
<<<<<<< HEAD



                }
                verdadeiro=0;
=======
                }
                verdadeiro="";
>>>>>>> 6dd8f85d2dc7ccea069e2ccf6054ef53922b9087
            }
            contador++;




            for (int i = 0; i < 3; i++) {

                for (int n = 0; n < 3; n++) {


                    if (array[i][n] != null) {

                        if (array[i][n].equals(jogador1)) {
                            contador1++;
                            System.out.println("jogadas do jogador 1 _" + contador1);
                            if (contador1 >= 3) {
                                return "jogador 1 ganhou";
                            }
                        }

                        if (array[i][n].equals(jogador2)) {
                            contador2++;
                            System.out.println("jogadas do jogador 2 :" + contador2);
                            if (contador2 >= 3) {
                                return "jogador 2 ganhou";
                            }
                        }

                    }


                }
                contador1 = 0;
                contador2 = 0;

            }

            contador1 = 0;
            contador2 = 0;

            for (int i = 0; i < 3; i++) {

                for (int n = 0; n < 3; n++) {


                    if (array[i][n] != null) {

                        if (array[n][i].equals(jogador1)) {
                            contador1++;
                            System.out.println("jogadas do jogador 1 _" + contador1);
                            if (contador1 >= 3) {
                                return "jogador 1 ganhou-";
                            }
                        }

                        if (array[n][i].equals(jogador2)) {
                            contador2++;
                            System.out.println("jogadas do jogador 2 :" + contador2);
                            if (contador2 >= 3) {
                                return "jogador 2 ganhou-";
                            }
                        }


                    }


                }

                contador1 = 0;
                contador2 = 0;
            }

            contador1 = 0;
            contador2 = 0;

            if (array[0][0] == array[1][1] && array[2][2] == jogador1 && array[1][1] == array[2][2]) {

                return "ganhou jogador 1*";

            }
            if (array[0][0] == array[1][1] && array[2][2] == jogador2 && array[1][1] == array[2][2]) {

                return "ganhou jogador 2*";
            }



            for (String[] n : array) {

                for (String i : n) {
                    System.out.print(i);

                }
                System.out.println("");

            }

            if (contador == 9) {
                return "empate";
            }

        }

        return "";
    }

    public static void main(String[] args) {

        System.out.println(jogoVelha());


    }
 */
}
