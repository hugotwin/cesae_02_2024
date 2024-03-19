package Ficha7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
//--------------------------------------------------------------
public class Exercicio9 {


    /**
     * funcao de psquisar musica
     * @throws FileNotFoundException
     */


    public static void pesquisar_tipo()throws FileNotFoundException

    {
        Scanner input = new Scanner(System.in);

        System.out.println( "Escolha o geneero\n" +
                "rock\n" +
                "pop\n" +
                "Grunge\n" +
                "Heavy Metal\n" +
                "Folk\n" +
                "Alternative Rock\n" +
                "Psychedelic Rock\n" +
                "Rock and Roll\n");
        String escolha = input.nextLine();


        File ficheiro = new File("C:/Users/softdev/Desktop/cesae_02_2024/ALG_HUGO_MAIA/Ficha_java/src/Ficha7/exercicio_09.csv");

        Scanner conteudo = new Scanner(ficheiro);

        conteudo.nextLine();

        while(conteudo.hasNextLine())
        {

            String linhas = conteudo.nextLine();
            String []  linha = linhas.split(",");
            if (linha[2].toLowerCase().trim().equals(escolha.toLowerCase().trim()))
            {
                System.out.println(linha[0]+" - "+linha[1]+" - "+linha[2]+" - "+linha[3]);

            }


        }



    }
//------------------------------------------

    /**
     * funcão de pesquisar artistas
     * @throws FileNotFoundException
     */
    public static void pesquisar_artista()throws FileNotFoundException

{
    Scanner input = new Scanner(System.in);

    System.out.println( "Escolha o artista");


    File ficheiro = new File("C:/Users/softdev/Desktop/cesae_02_2024/ALG_HUGO_MAIA/Ficha_java/src/Ficha7/exercicio_09.csv");

    Scanner conteudo = new Scanner(ficheiro);

    conteudo.nextLine();

    while(conteudo.hasNextLine())
    {

        String linhas = conteudo.nextLine();
        String []  linha = linhas.split(",");

        System.out.println("-"+linha[1]+")");

    }



    Scanner conteudo2 = new Scanner(ficheiro);

    conteudo2.nextLine();

    String escolha = input.nextLine();


    while(conteudo2.hasNextLine())
    {

        String linhas = conteudo2.nextLine();
        String []  linha = linhas.split(",");

        if (linha[1].toLowerCase().trim().equals(escolha.toLowerCase().trim()))
        {
            System.out.println(linha[0]+" - "+linha[1]+" - "+linha[2]+" - "+linha[3]);

        }
    }



}

    /**
     * Funcao com maior duracao
     * @return
     * @throws FileNotFoundException
     */

    public static String maiorDuracao()throws FileNotFoundException {


        int max = 0;
        String resultado ="";

        File ficheiro = new File("C:/Users/softdev/Desktop/cesae_02_2024/ALG_HUGO_MAIA/Ficha_java/src/Ficha7/exercicio_09.csv");

        Scanner conteudo = new Scanner(ficheiro);

        conteudo.nextLine();

        while (conteudo.hasNextLine()) {

            String linhas = conteudo.nextLine();
            String[] linha = linhas.split(",");
            String[] tempo = linha[3].split(":");
            int minutos_segundos = Integer.parseInt(tempo[0]) * 60;
            int segundos = Integer.parseInt(tempo[0]);
            int tempo_total = minutos_segundos + segundos;
            System.out.println(tempo_total);



            if (max == 0 || tempo_total > max) {
                max=tempo_total;


                resultado = "musica de ,maior duracao : " + linha[0] + " - " + linha[1] + " - " + linha[2] + " - " + linha[3] + "";

            }


        }
        return resultado;

    }




//--------------------------------------------

    /**
     * Funcao duracao acima
     * @return
     * @throws FileNotFoundException
     */
    public static void duracaoAcima()throws FileNotFoundException {
        Scanner input = new Scanner(System.in);

        System.out.println("indique a duracao minima das musicas  que deseja ouvir em minutos");
        int max = input.nextInt()*60;

        String resultado ="";

        File ficheiro = new File("C:/Users/softdev/Desktop/cesae_02_2024/ALG_HUGO_MAIA/Ficha_java/src/Ficha7/exercicio_09.csv");

        Scanner conteudo = new Scanner(ficheiro);

        conteudo.nextLine();

        while (conteudo.hasNextLine()) {

            String linhas = conteudo.nextLine();
            String[] linha = linhas.split(",");

            String[] tempo = linha[3].split(":");
            int minutos_segundos = Integer.parseInt(tempo[0]) * 60;
            int segundos = Integer.parseInt(tempo[0]);
            int tempo_total = minutos_segundos + segundos;





            if ( tempo_total > max) {


                System.out.println("musica de maior duracao : " + linha[0] + " - " + linha[1] + " - " + linha[2] + " - " + linha[3] + "");

            }


        }


    }

//------------------

    /**
     * Funcao que indica o numero de musicas no ficheiro
     * @return int
     * @throws FileNotFoundException
     */

    public static int numeroMusicas()throws FileNotFoundException {

        int contador=0;

        File ficheiro = new File("C:/Users/softdev/Desktop/cesae_02_2024/ALG_HUGO_MAIA/Ficha_java/src/Ficha7/exercicio_09.csv");
        Scanner conteudo = new Scanner(ficheiro);

        conteudo.nextLine();

        while (conteudo.hasNextLine()) {

           conteudo.nextLine();

           contador++;



        }

        return contador;
    }





    public static void main(String[] args) {


        try{




            System.out.println(numeroMusicas());
        }catch (Exception e)
        {
            System.out.println("");
        }

    }
}
