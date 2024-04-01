package loja_jogos;


import java.io.FileNotFoundException;

import java.util.Scanner;

import static loja_jogos.login.*;

public class menuAdmin {

    /**
     * funcao que indica o total de vendas
     *
     * @return um double
     */
    public static String total_vendas() throws FileNotFoundException {
        double valor = 0;
        int numero_vendas=0;
        try {

            String[] array = leitura_sem_cabecalho("src/loja_jogos/GameStart/GameStart_Vendas.csv");
            for (int n = 1; n < array.length; n++) {

                String[] campos = array[n].split(";");

                valor += Double.parseDouble(campos[5]);


            }

            numero_vendas=array.length;
        } catch (FileNotFoundException e) {

        }
        return "O valor total em euros de vendas foi : "+valor+"\nO numero de vendas foi : "+numero_vendas;
    }

//-------------------------------------

    /**
     * Funcao que retorna o total de lucro da venda de jogos
     * @return valor total de lucro
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


                if (campos_vendas[3].trim().toLowerCase().equals(campos_margem[0].trim().toLowerCase())) {

                    margem += (Double.parseDouble(campos_vendas[5]) * Double.parseDouble(campos_margem[1])/100);

                }
            }

        }

        return margem;
    }

    /**
     * Funcao que faz uma pesquisa num ficheiro de clientes  e retorna a informacao dos clientes
     *
     * @param id
     * @param caminho
     * @return String os dados do cliente
     * @throws FileNotFoundException
     */

    public static String pesquisa_(String id, String caminho) throws FileNotFoundException {
        String dados = "";
        String[] array_leitura = leitura_sem_cabecalho(caminho);
        for (int n = 0; n < array_leitura.length; n++) {// passa pelo o arrau e compara o id

            String[] campos = array_leitura[n].split(";");

            if (campos[0].equals(id)) {

                dados = "\nnome : " + campos[1] +
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
        for (int n = 1; n < array.length; n++) {// verifica o jogo com maoir comprado

            String[] campos = array[n].split(";");

            if (n == 1 || Double.parseDouble(campos[5]) > valor) {

                valor = Double.parseDouble(campos[5]);
                nome = campos[4];
            }

        }


        nome = "O jogo com maior valor foi -"+ nome +"-\nValor de : " + valor;
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
        String[] array_vendas = leitura_sem_cabecalho(caminho);// array das vendas
        String[] array_compras = new String[array_vendas.length - 1];// valores de compras com duplicado
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


        String[] array_cliente = leitura_sem_cabecalho(caminho_cliente_);// array de clientes
        String[] array_vendas = leitura_sem_cabecalho(caminho_vendas_);// array de vendas
        double[] array_valor_cliente = new double[array_cliente.length - 1];// array valor por cliente
        int[] array_id_cliente = new int[array_cliente.length - 1];// array id clientes para associar ao valor

        // cria arrays sem duplicados
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

        // faz ordenacao dos arrays
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
        System.out.println("Indique o numero de melhores  clientes que deseja ver :" +
                " serão apresentados do maior para o menor ");

        valor = input.nextInt();
        if (valor < array_cliente.length) {

            for (int n = array_cliente.length-2; n > array_cliente.length - valor-2; n--) {


                System.out.printf("Valor total gasto por cliente : "+array_valor_cliente[n]);// indica o valor gasto por cliente
                System.out.println(""+pesquisa_("" + array_id_cliente[n] + "", caminho_cliente_));/// indica os dados do cliente
                System.out.println("Lista de jogos comprados : ");
                pesquisar_jogos(caminho_vendas_,array_id_cliente[n]);/// indica os jogos comprados por um cliente

                System.out.println("---------------------------------------------------------------------------------------");

            }

        } else {
            System.out.println("numero maximo de maiores clientes invalido ");
        }


    }
  //-------------------------------------------------------------

    /**
     * Funcao que apresenta os clinetes  que comprarm determinado jogo
     * @param jogo
     * @param caminho_vendas
     * @param caminho_clientes
     * @return
     * @throws FileNotFoundException
     */
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
     * Funcao que retorna a categoria com maior lucro
     * @param caminho_vendas
     * @param caminho_categoria
     * @return a categoria com maoir lucro e o valor
     * @throws FileNotFoundException
     */
    public static String categoria_maior_lucro(String caminho_vendas,String caminho_categoria) throws FileNotFoundException {
        double valor = 0, max =0;
        String nome = "", nome_final="";


// colocar aqui a fazer a iteracao pela array das categorias


        String[] array = leitura_sem_cabecalho(caminho_vendas);
        String[] array_categoria = leitura_sem_cabecalho(caminho_categoria);

       for (int i = 1; i<array_categoria.length; i++){
           String[] categorias = array_categoria[i].split(";");

        for (int n = 1; n < array.length; n++) {

            String[] campos = array[n].split(";");



             if (campos[3].equals(categorias[0])){

                 valor+=Double.parseDouble(campos[5])*Double.parseDouble(categorias[1])/100;
                 nome=campos[3];



             }
         }

         if (i==1 || valor>max)
         {
             max= valor;
             nome_final = nome;

         }
         valor=0;

        }


        nome = "A categoria com maior lucro : " + nome_final + "\nValor de : " + max;
        return nome;
    }

    /**
     * Funcao que da  os top 5 jogos que deram mais lucro
     * @param caminho_margem_
     * @param caminho_vendas_
     * @throws FileNotFoundException
     */
    //-----------------------------------------------------------------------------------------
    public static void top_five(String caminho_margem_, String caminho_vendas_) throws FileNotFoundException {
        double valor = 0;
        String nome = "";
        int contador = 0;
        int id = 0;


        String[] array_margem = leitura_sem_cabecalho(caminho_margem_);
        String[] array_vendas = leitura_sem_cabecalho(caminho_vendas_);
        double[] array_vendas_jogo = new double[array_vendas.length - 1];// array com valor total de cada jogo
        String[] array_nome_jogo = new String[array_vendas.length - 1];// array com o nome do jogos
        String[] array_categoria_jogo = new String[array_vendas.length - 1];// array com o nome do jogos
        double[] array_margem_jogo = new double[array_vendas.length - 1];// array com o nome do jogos

        // criar array de jogo sem duplicados

        for (int i = 1; i < array_vendas.length; i++) {
            int contador_ = 0;

            String[] campos_vendas = array_vendas[i].split(";");


            for (int n = 0; n < array_nome_jogo.length; n++) {

                if (array_nome_jogo[n] != null) {
                    if (campos_vendas[4].equals(array_nome_jogo[n])) {
                        ++contador_;
                    }

                }
            }


            if (contador_ < 1) {

                array_nome_jogo[i] = campos_vendas[4];
                array_categoria_jogo[i] = campos_vendas[3];
            }
        }


        // cria array com a soma por cada jogo
        for (int i = 0; i < array_nome_jogo.length; i++) {
            int soma = 0;

            for (int n = 1; n < array_vendas.length; n++) {

                String[] campos_vendas = array_vendas[i].split(";");

                if (array_nome_jogo[i] != null) {
                    if (campos_vendas[4].equals(array_nome_jogo[i])) {
                        soma += Double.parseDouble(campos_vendas[5]);
                    }

                }

                array_vendas_jogo[i] = soma;

            }
            soma=0;
        }


            // multiplicar a array de vendas por  pela margem categoria

            for (int t = 0; t < array_vendas_jogo.length; t++) {

                double margem =0;

                for (int n = 1; n < array_margem.length; n++) {

                    String[] campos_margem = array_margem[n].split(";");

                        if (campos_margem[0].equals(array_categoria_jogo[t])) {

                            margem = (Double.parseDouble(campos_margem[1])/100);
                        }



                }
                array_vendas_jogo[t] = array_vendas_jogo[t]*margem;
                array_margem_jogo[t] =margem;

            }

            // ordenar os array do maior para o menor


        for (int n = 0; n < array_vendas_jogo.length; n++) {

            for (int i = 1; i < array_vendas_jogo.length; i++) {

                if (array_vendas_jogo[i] < array_vendas_jogo[i - 1]) {
                    valor = array_vendas_jogo[i];
                    array_vendas_jogo[i] = array_vendas_jogo[i - 1];
                    array_vendas_jogo[i - 1] = valor;

                    nome = array_nome_jogo[i];
                    array_nome_jogo[i] = array_nome_jogo[i - 1];
                    array_nome_jogo[i - 1] = nome;

                    nome = array_categoria_jogo[i];
                    array_categoria_jogo[i] = array_categoria_jogo[i - 1];
                    array_categoria_jogo[i - 1] = nome;


                }
            }
        }



            for (int  n = array_nome_jogo.length-1; n>array_nome_jogo.length-5;n--) {

                System.out.println("Categoria : "+array_categoria_jogo[n]);
                    System.out.println("nome : "+array_nome_jogo[n]);
                    System.out.println("Lucro : "+array_vendas_jogo[n]);

                System.out.println("----------------------------------------------------");
                }


    }

    /**
     * Funcao que da o 5 jogos que deram menos lucro
      * @param caminho_margem_
     * @param caminho_vendas_
     * @throws FileNotFoundException
     */
    public static void bottom_five(String caminho_margem_, String caminho_vendas_) throws FileNotFoundException {
        double valor = 0;
        String nome = "";
        int contador = 0;
        int id = 0;


        String[] array_margem = leitura_sem_cabecalho(caminho_margem_);
        String[] array_vendas = leitura_sem_cabecalho(caminho_vendas_);
        double[] array_vendas_jogo = new double[array_vendas.length - 1];// array com valor total de cada jogo
        String[] array_nome_jogo = new String[array_vendas.length - 1];// array com o nome do jogos
        String[] array_categoria_jogo = new String[array_vendas.length - 1];// array com o nome do jogos
        double[] array_margem_jogo = new double[array_vendas.length - 1];// array com o nome do jogos

        // criar array de jogo sem duplicados

        for (int i = 1; i < array_vendas.length; i++) {
            int contador_ = 0;

            String[] campos_vendas = array_vendas[i].split(";");


            for (int n = 0; n < array_nome_jogo.length; n++) {

                if (array_nome_jogo[n] != null) {
                    if (campos_vendas[4].equals(array_nome_jogo[n])) {
                        ++contador_;
                    }

                }
            }


            if (contador_ < 1) {

                array_nome_jogo[i] = campos_vendas[4];
                array_categoria_jogo[i] = campos_vendas[3];
            }
        }


        // cria array com a soma por cada jogo
        for (int i = 0; i < array_nome_jogo.length; i++) {
            int soma = 0;

            for (int n = 1; n < array_vendas.length; n++) {

                String[] campos_vendas = array_vendas[i].split(";");

                if (array_nome_jogo[i] != null) {
                    if (campos_vendas[4].equals(array_nome_jogo[i])) {
                        soma += Double.parseDouble(campos_vendas[5]);
                    }

                }

                array_vendas_jogo[i] = soma;

            }
            soma=0;
        }


        // multiplicar a array de vendas por  pela margem categoria

        for (int t = 0; t < array_vendas_jogo.length; t++) {

            double margem =0;

            for (int n = 1; n < array_margem.length; n++) {

                String[] campos_margem = array_margem[n].split(";");

                if (campos_margem[0].equals(array_categoria_jogo[t])) {

                    margem = (Double.parseDouble(campos_margem[1])/100);
                }



            }
            array_vendas_jogo[t] = array_vendas_jogo[t]*margem;
            array_margem_jogo[t] =margem;

        }

        // ordenar os array do maior para o menor


        for (int n = 0; n < array_vendas_jogo.length; n++) {

            for (int i = 1; i < array_vendas_jogo.length; i++) {

                if (array_vendas_jogo[i] < array_vendas_jogo[i - 1]) {
                    valor = array_vendas_jogo[i];
                    array_vendas_jogo[i] = array_vendas_jogo[i - 1];
                    array_vendas_jogo[i - 1] = valor;

                    nome = array_nome_jogo[i];
                    array_nome_jogo[i] = array_nome_jogo[i - 1];
                    array_nome_jogo[i - 1] = nome;

                    nome = array_categoria_jogo[i];
                    array_categoria_jogo[i] = array_categoria_jogo[i - 1];
                    array_categoria_jogo[i - 1] = nome;


                }
            }
        }



        contador =0;

        for (int  n = 0; n<array_nome_jogo.length;n++) {

            if (array_nome_jogo[n]!=null && contador<5 ){
            System.out.println("Categoria : "+array_categoria_jogo[n]);
            System.out.println("nome : "+array_nome_jogo[n]);
            System.out.println("Lucro : "+array_vendas_jogo[n]);

            System.out.println("----------------------------------------------------");
            contador++;
        }
    }


    }


    //----------------------------------------------------------------------------------------------------

    /**
     * Funcao Menu utilizador que sera usado no main  loja de jogos
     */

    public static void menuAdmin_() {

        Scanner input = new Scanner(System.in);
        boolean run = true;
        System.out.println("\nEntrou com sucesso no menu de Admin");


        while (run) {

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
                    "\n10)Bottom 5 jogos"+
                    "\n11)Sair");
            String opcao = input.nextLine();



        switch (opcao) {



                case "1":

                    // imprimir o ficheiro desejado
                    System.out.println("\nIndique o que deseja ver :" +
                            "\n1) Ficheiro de Vendas" +
                            "\n2) Clientes" +
                            "\n3) Categorias");
                    opcao = input.nextLine().trim().toLowerCase();

                    String caminho = "";

                    if (opcao.equals("1")) {
                        caminho = "src/loja_jogos/GameStart/GameStart_Vendas.csv";

                    } else if (opcao.equals("2")) {

                        caminho = "src/loja_jogos/GameStar/GameStart_Clientes.csv";
                    } else if (opcao.equals("3")) {

                        caminho = "src/loja_jogos/GameStart/GameStart_Categorias.csv";

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
                        System.out.printf(total_vendas());

                    } catch (FileNotFoundException e) {
                        System.out.println(e);
                    }


                    break;
                case "3":
                    // indica o total de lucro
                    try {
                        // total de vendas retoran
                        System.out.println("O total do lucro foi :");
                        System.out.printf("%.2f", total_lucro());
                        System.out.print(" euros.");
                        System.out.println("");

                    } catch (FileNotFoundException e) {
                        System.out.println(e);
                    }
                    break;

                case "4":

                    // pesquida cliente por id
                    try {
                        System.out.println("Indique o id do cliente ");
                        String id = input.nextLine().trim().toLowerCase();
                        System.out.println(pesquisa_(id, "src/loja_jogos/GameStart/GameStart_Clientes.csv"));
                    } catch (FileNotFoundException e) {
                        System.out.println(e);
                    }

                    break;
                case "5":
                    // indica o jogo com maior valor vendido  que os clientes compraram
                    try {

                        String jogo =maior_valor("src/loja_jogos/GameStart/GameStart_Vendas.csv");
                        System.out.println(jogo);
                        jogo =jogo.split("-")[1];

                        System.out.println(clientes_jogo(jogo, "src/loja_jogos/GameStart/GameStart_Vendas.csv", "src/loja_jogos/GameStart/GameStart_Clientes.csv"));

                    } catch (FileNotFoundException e) {
                        System.out.println(e);
                    }


                    break;
                case "6":

                    // indica o jogo com maior valor vendido
                    try {

                        melhores_clientes("src/loja_jogos/GameStart/GameStart_Clientes.csv", "src\\loja_jogos\\GameStart\\GameStart_Vendas.csv");
                    } catch (FileNotFoundException e) {
                        System.out.println(e);
                    }
                    break;
                case "7":
                    // indica a categoria mais vendida e o  maior lucro
                    try {

                        System.out.println(categoria_maior_lucro("src/loja_jogos/GameStart/GameStart_Vendas.csv", "src/loja_jogos/GameStart/GameStart_Categorias.csv"));
                    } catch (FileNotFoundException e) {
                        System.out.println(e);
                    }


                    break;
                case "8":


                    // indica a categoria mais vendida e o valor
                    try {

                        System.out.println("iNdique o jogo");
                        String jogo = input.nextLine().trim();
                        System.out.println(clientes_jogo(jogo, "src/loja_jogos/GameStart/GameStart_Vendas.csv", "src/loja_jogos/GameStart/GameStart_Clientes.csv"));
                    } catch (FileNotFoundException e) {
                        System.out.println(e);
                    }
                    break;

                case "9":
                    try {
                        top_five("src/loja_jogos/GameStart/GameStart_Categorias.csv", "src/loja_jogos/GameStart/GameStart_Vendas.csv");
                    } catch (FileNotFoundException e) {
                        System.out.println(e);
                    }
                    break;

                case "10":
                    try {
                        bottom_five("src/loja_jogos/GameStart/GameStart_Categorias.csv", "src/loja_jogos/GameStart/GameStart_Vendas.csv");
                    } catch (FileNotFoundException e) {
                        System.out.println(e);
                    }

                    break;
                case "11":

                    run=false;
                    break;

                default:

                    System.out.println("Escolha uma opcao válida");
                    break;


            }


        }
    }
}


