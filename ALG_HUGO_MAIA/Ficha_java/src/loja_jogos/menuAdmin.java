package loja_jogos;


import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import static loja_jogos.login.leitura_sem_cabecalho;


public class menuAdmin {

    /**funcao que indica o total de vendas
     *
      * @return um inteiro
     */
public static int total_vendas()
{
    int valor=0;
    try
    {

       String [] array = leitura_sem_cabecalho("C:\\Users\\softdev\\Desktop\\cesae_02_2024\\ALG_HUGO_MAIA\\Ficha_java\\src\\loja_jogos\\GameStart\\GameStart_Vendas.csv");
        for (int n =0; n< array.length;n++)
        {
            String [] campos = array[n].split(";");
            valor+=Integer.parseInt(campos[5]);
        }

    }catch(FileNotFoundException e ){

    }
    return valor;
}




    public static void menuAdmin_ () {

        Scanner input = new Scanner(System.in);

        System.out.println("\nEntrou com sucesso no menu de Admin");
        System.out.println("\nIndique a opção" +
                "\n1) Consulta de Ficheiros" +
                "\n2) Total de Vendas" +
                "\n3) Total de Lucro" +
                "\n4) Pesquisa de Cliente" +
                "\n5) Jogo mais caro" +
                "\n6) Melhores Clientes" +
                "\n7) Melhor Categoria " +
                "\n8) Pesquisa Vendas" +
                "\n9) Top 5 Jogos" +
                "\n10)Bottom 5 jogos");
        String opcao = input.nextLine();

        switch (opcao) {

            case "1":

                // imprimir o ficheiro desejado
                System.out.println("\nIndique o que deseja ver :" +
                        "\n1) Ficheiro de Vendas" +
                        "\n2) Clientes" +
                        "\n3) Categorias");
                opcao = input.nextLine();

                String caminho = "";

                if (opcao.equals("1")) {
                    caminho = "C:\\Users\\softdev\\Desktop\\cesae_02_2024\\ALG_HUGO_MAIA\\Ficha_java\\src\\loja_jogos\\GameStart\\GameStart_Vendas.csv";

                } else if (opcao.equals("2")) {

                    caminho = "C:\\Users\\softdev\\Desktop\\cesae_02_2024\\ALG_HUGO_MAIA\\Ficha_java\\src\\loja_jogos\\GameStart\\GameStart_Clientes.csv";
                } else if (opcao.equals("3")) {

                    caminho = "C:\\Users\\softdev\\Desktop\\cesae_02_2024\\ALG_HUGO_MAIA\\Ficha_java\\src\\loja_jogos\\GameStart\\GameStart_Categorias.csv";

                } else {
                    System.out.println("Opção invalida");
                }
                try{

                    String[] array = leitura_sem_cabecalho(caminho);
                    for (int n = 0; n < array.length; n++) {

                        System.out.println(array[n].replace(";"," | "));

                    }

                }catch (FileNotFoundException e){
                    System.out.println(e);
                }


                break;
            case "2":
                // total de vendas retoran
                System.out.println(total_vendas());




                break;
            case "3":
                break;
            case "4":
                break;
            case "5":
                break;
            case "6":
                break;
            case "7":
                break;
            case "8":
                break;
            default:

                System.out.println("Escolha uma opcao válida");
                break;


        }


    }

    }


