package loja_jogos;


import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import static loja_jogos.login.*;

public class menuAdmin {

    /**
     * funcao que indica o total de vendas
     *
     * @return um double
     */
    public static double total_vendas() throws FileNotFoundException {
        double valor = 0;
        try {

            String[] array = leitura_sem_cabecalho("src/loja_jogos/GameStart/GameStart_Vendas.csv");
            for (int n = 1; n < array.length; n++) {

                String[] campos = array[n].split(";");

                valor += Double.parseDouble(campos[5]);

            }

        } catch (FileNotFoundException e) {

        }
        return valor;
    }

//-------------------------------------

    /**
     * Funcao que retorna o total de lucro da venda de jogos
     * @return
     * @throws FileNotFoundException
     */

    public static double total_lucro() throws FileNotFoundException {
        double margem = 0;


        String[] array_margem = leitura_sem_cabecalho("src/loja_jogos/GameStart/GameStart_Categorias.csv");
        String[] array_vendas = leitura_sem_cabecalho("src/loja_jogos/GameStart/GameStart_Vendas.csv");
        for (int n = 1; n < array_vendas.length; n++) {

            String[] campos_vendas = array_vendas[n].split(";");

            for (int i = 1; i < array_margem.length; i++) {


                String[] campos_margem = array_margem[i].split(";");


                if (campos_vendas[3].equals(campos_margem[0])) {

                    margem += (Double.parseDouble(campos_vendas[5]) * Double.parseDouble(campos_margem[1]));

                }
            }

        }

        return margem;
    }

    /**
     * Funcao que faz uma pesquisa num ficheiro e compara com um input e da a informacao dessa linha do ficheiro
     *
     * @param id
     * @param caminho
     * @return
     * @throws FileNotFoundException
     */

    public static String pesquisa_(String id, String caminho) throws FileNotFoundException {
        String dados = "";
        String[] array_leitura = leitura_sem_cabecalho(caminho);
        for (int n = 0; n < array_leitura.length; n++) {

            String[] campos = array_leitura[n].split(";");

            if (campos[0].equals(id)) {

                dados = "nome : " + campos[1] +
                        "\ntelemovel : " + campos[2] +
                        "\nmail: " + campos[3];


            }
        }
        return dados;

    }

    /**
     * Funcao que indica o o jogo de maior valor comprado
     *
     * @param caminho
     * @return string com o nome do jogo e valor
     * @throws FileNotFoundException
     */

    public static String maior_valor(String caminho) throws FileNotFoundException {
        double valor = 0;
        String nome = "";


        String[] array = leitura_sem_cabecalho(caminho);
        for (int n = 1; n < array.length; n++) {

            String[] campos = array[n].split(";");

            if (n == 1 || Double.parseDouble(campos[5]) > valor) {

                valor = Double.parseDouble(campos[5]);
                nome = campos[4];
            }

        }


        nome = "O jogo com maior valor foi : " + nome + "\nValor de : " + valor;
        return nome;
    }

    //-----------------------------------------------

    /**
     * Funcao que pesquisa os jogos comprados de um utilizador id
     *
     * @param caminho
     * @param id
     * @throws FileNotFoundException
     */
    public static void pesquisar_jogos(String caminho, int id) throws FileNotFoundException {
        String[] array_vendas = leitura_sem_cabecalho(caminho);
        String[] array_compras = new String[array_vendas.length - 1];
        String[] array_compras_final = new String[array_vendas.length - 1];
        int contador =0;


        for (int n = 1; n < array_vendas.length; n++) {

            String[] campos_vendas = array_vendas[n].split(";");


            if (Integer.parseInt(campos_vendas[1])==(id)) {


                array_compras[contador] = campos_vendas[4];
                contador++;

            }

        }

        for (int i = 0; i < array_compras.length; i++) {
            int contador_ = 0;

            for (int n = 0; n < array_compras_final.length; n++) {

                if (array_compras[i]!=null){
                if (array_compras[i].equals(array_compras_final[n])) {
                    ++contador_;
                }

                }}


            if (contador_<1) {

                array_compras_final[i] = array_compras[i];

            }
        }

        for (String n : array_compras_final) {
            if (n!=null){
            System.out.println(n);
        }
        }


    }


//-----------------------------------------------------------------------------------------------------------

    /**
     * Funcao que indica o numero de melhores clientes escolhidos pelo utilizador imprime o jogos comprados de cada um
     * faz a impressao desses clientes
     *
     * @param caminho_cliente_
     * @param caminho_vendas_
     * @throws FileNotFoundException
     */
    public static void melhores_clientes(String caminho_cliente_, String caminho_vendas_) throws FileNotFoundException {
        double valor = 0;
        String nome = "";
        int contador = 0;
        int id = 0;


        String[] array_cliente = leitura_sem_cabecalho(caminho_cliente_);
        String[] array_vendas = leitura_sem_cabecalho(caminho_vendas_);
        double[] array_valor_cliente = new double[array_cliente.length - 1];
        int[] array_id_cliente = new int[array_cliente.length - 1];

        for (int n = 1; n < array_cliente.length; n++) {

            String[] campos_cliente = array_cliente[n].split(";");

            for (int i = 1; i < array_vendas.length; i++) {

                String[] campos_vendas = array_vendas[i].split(";");


                if (campos_vendas[1].equals(campos_cliente[0])) {

                    valor += Double.parseDouble(campos_vendas[5]);

                }
            }

            array_id_cliente[n - 1] = n;
            array_valor_cliente[n - 1] = valor;
            valor = 0;
        }
        for (int n = 1; n < array_valor_cliente.length; n++) {

            for (int i = 1; i < array_valor_cliente.length; i++) {

                if (array_valor_cliente[i] < array_valor_cliente[i - 1]) {
                    valor = array_valor_cliente[i];
                    array_valor_cliente[i] = array_valor_cliente[i - 1];
                    array_valor_cliente[i - 1] = valor;

                    id = array_id_cliente[i];
                    array_id_cliente[i] = array_id_cliente[i - 1];
                    array_id_cliente[i - 1] = id;


                }
            }
        }

        valor = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Indique o numero de melhores  clientes que deseja ver   :" +
                "serão apresentados do maior para o menor");

        valor = input.nextInt();
        if (valor < array_cliente.length - 1) {

            for (int n = array_cliente.length - 2; n > array_cliente.length - valor; n--) {


                System.out.printf("Valor total gasto por cliente :"+array_valor_cliente[n]);// indica o valor gasto por cliente
                System.out.println(""+pesquisa_("" + array_id_cliente[n] + "", caminho_cliente_));/// indica os dados do cliente
                System.out.println("Lista de jogos comprados :");
                pesquisar_jogos(caminho_vendas_,array_id_cliente[n]);/// indica os jogos comprados por um cliente

                System.out.println("---------------------------------------------------------------------------------------");

            }

        } else {
            System.out.println("numero maximo de maiores clientes invalido");
        }


    }
  //-------------------------------------------------------------

public static String clientes_jogo(String jogo, String caminho_vendas, String caminho_clientes) throws  FileNotFoundException
{
    String clientes="";
    int contador=0;

    String [] array_vendas = leitura_sem_cabecalho(caminho_vendas);
    String [] array_clientes = leitura_sem_cabecalho(caminho_clientes);

    for(int n=1; n<array_vendas.length; n++)
    {
        String [] campos_vendas= array_vendas[n].split(";");

        if (campos_vendas[4].toString().contains(jogo))
        {


            for(int i=1; i<array_clientes.length; i++)
            {
                String [] campos_clientes = array_clientes[i].split(";");

                if (campos_vendas[1].equals(campos_clientes[0]))
                {
                    clientes+=campos_clientes[1]+"-"+campos_clientes[2]+"-"+campos_clientes[3]+"\n";
                }

        }

    }


    }

    return clientes;
}




    //-------------------------------------------

    /**
     * Funcao que retorna a categoria com maior valor de venda e valor
     * @param caminho
     * @return
     * @throws FileNotFoundException
     */
    public static String categoria_maior_venda(String caminho) throws FileNotFoundException {
        double valor = 0, max =0;
        String nome = "", nome_final="";



        String[] array = leitura_sem_cabecalho(caminho);
        for (int n = 1; n < array.length; n++) {

            String[] campos = array[n].split(";");

         for(int i = 1; i < array.length; i++ ){

             String[] campos_ = array[i].split(";");

             if (campos[3].equals(campos_[3])){

                 valor+=Double.parseDouble(campos[5]);
                 nome=campos[3];

             }
         }

         if (n==1 || valor>max)
         {
             max= valor;
             nome_final = nome;

         }
         valor=0;

        }


        nome = "A categoria com maior venda : " + nome_final + "\nValor de : " + max;
        return nome;
    }





    //----------------------------------------------------------------------------------------------------

    /**
     * Funcao Menu utilizador que sera usado no main  loja de jogos
     */

    public static void menuAdmin_() {

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
                    caminho = "C:/Users/softdev/Desktop/cesae_02_2024/ALG_HUGO_MAIA/Ficha_java/src/loja_jogos/GameStart/GameStart_Admins.csv";

                } else if (opcao.equals("2")) {

                    caminho = "src\\loja_jogos\\GameStart\\GameStart_Clientes.csv";
                } else if (opcao.equals("3")) {

                    caminho = "src\\loja_jogos\\GameStart\\GameStart_Categorias.csv";

                } else {
                    System.out.println("Opção invalida");
                }
                try {

                    String[] array = leitura_sem_cabecalho(caminho);
                    for (int n = 0; n < array.length; n++) {

                        System.out.println(array[n].replace(";", " | "));

                    }

                } catch (FileNotFoundException e) {
                    System.out.println(e);
                }


                break;
            case "2":
                try {
                    // total de vendas retoran
                    System.out.printf("%.2f", total_vendas());

                } catch (FileNotFoundException e) {
                    System.out.println(e);
                }


                break;
            case "3":
                // indica o total de lucro
                try {
                    // total de vendas retoran
                    System.out.printf("%.2f", total_lucro());

                } catch (FileNotFoundException e) {
                    System.out.println(e);
                }
                break;

            case "4":

                // pesquida cliente por id
                try {
                    System.out.println("Indique o id do cliente");
                    String id = input.nextLine();
                    System.out.println(pesquisa_(id, "src/loja_jogos/GameStart/GameStart_Clientes.csv"));
                } catch (FileNotFoundException e) {
                    System.out.println(e);
                }

                break;
            case "5":
                // indica o jogo com maior valor vendido
                try {

                    System.out.println(maior_valor("src/loja_jogos/GameStart/GameStart_Vendas.csv"));
                } catch (FileNotFoundException e) {
                    System.out.println(e);
                }


                break;
            case "6":

                // indica o jogo com maior valor vendido
                try {

                    melhores_clientes("C:\\Users\\softdev\\Desktop\\cesae_02_2024\\ALG_HUGO_MAIA\\Ficha_java\\src\\loja_jogos\\GameStart\\GameStart_Clientes.csv", "C:\\Users\\softdev\\Desktop\\cesae_02_2024\\ALG_HUGO_MAIA\\Ficha_java\\src\\loja_jogos\\GameStart\\GameStart_Vendas.csv");
                } catch (FileNotFoundException e) {
                    System.out.println(e);
                }
                break;
            case "7":
                // indica a categoria mais vendida e o valor
                try {

                    System.out.println(categoria_maior_venda( "C:\\Users\\softdev\\Desktop\\cesae_02_2024\\ALG_HUGO_MAIA\\Ficha_java\\src\\loja_jogos\\GameStart\\GameStart_Vendas.csv"));
                } catch (FileNotFoundException e) {
                    System.out.println(e);
                }


                break;
            case "8":


                // indica a categoria mais vendida e o valor
                try {

                    System.out.println("iNdique o jogo");
                    String jogo = input.nextLine();
                    System.out.println(clientes_jogo(jogo,"C:\\Users\\softdev\\Desktop\\cesae_02_2024\\ALG_HUGO_MAIA\\Ficha_java\\src\\loja_jogos\\GameStart\\GameStart_Vendas.csv","C:\\Users\\softdev\\Desktop\\cesae_02_2024\\ALG_HUGO_MAIA\\Ficha_java\\src\\loja_jogos\\GameStart\\GameStart_Clientes.csv"));
                } catch (FileNotFoundException e) {
                    System.out.println(e);
                }
                break;
            default:

                System.out.println("Escolha uma opcao válida");
                break;


        }


    }

}


