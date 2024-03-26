package loja_jogos;


import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import static loja_jogos.login.*;

public class menuAdmin {

    /**funcao que indica o total de vendas
     *
      * @return um double
     */
public static double total_vendas()throws FileNotFoundException
{
    double valor=0;
    try
    {

       String [] array = leitura_sem_cabecalho("src/loja_jogos/GameStart/GameStart_Vendas.csv");
        for (int n =1; n< array.length;n++)
        {

            String [] campos = array[n].split(";");

            valor+=Double.parseDouble(campos[5]);

        }

    }catch(FileNotFoundException e ){

    }
    return valor;
}

//-------------------------------------



    public static double total_lucro()throws FileNotFoundException
    {
        double margem=0;


            String [] array_margem = leitura_sem_cabecalho("src/loja_jogos/GameStart/GameStart_Categorias.csv");
            String [] array_vendas = leitura_sem_cabecalho("src/loja_jogos/GameStart/GameStart_Vendas.csv");
            for (int n =1; n< array_vendas.length;n++)
            {

                String [] campos_vendas = array_vendas[n].split(";");

                for (int i =1; i< array_margem.length;i++){


                    String [] campos_margem = array_margem[i].split(";");


                    if (campos_vendas[3].equals(campos_margem[0])) {

                        margem += (Double.parseDouble(campos_vendas[5])*Double.parseDouble(campos_margem[1]));

                    }
                }

            }

        return margem;
    }

    /**
     * Funcao que faz uma pesquisa num ficheiro e compara com um input e da a informacao dessa linha do ficheiro
     * @param id
     * @param caminho
     * @return
     * @throws FileNotFoundException
     */

public static String pesquisa_(String id, String caminho) throws FileNotFoundException{
    String dados="";
    String [] array_leitura = leitura_sem_cabecalho(caminho);
    for(int n =0 ; n<array_leitura.length; n++){

        String [] campos = array_leitura[n].split(";");

        if(campos[0].equals(id)){

           dados = "nome : "+campos[1] +
                   "\ntelemovel : "+campos[2] +
                   "\nmail: "+campos[3];


        }
    }
    return dados;

}

    /**
     * Funcao que indica o ojogo de maior valor comprado
     * @param caminho
     * @return string com o nome do jogo e valor
     * @throws FileNotFoundException
     */

    public static String maior_valor(String caminho)throws FileNotFoundException
    {
        double valor=0;
        String nome = "";


            String [] array = leitura_sem_cabecalho(caminho);
            for (int n =1; n< array.length;n++)
            {

                String [] campos = array[n].split(";");

                if(n==1||Double.parseDouble(campos[5])>valor){

                    valor = Double.parseDouble(campos[5]);
                    nome = campos[4];
                }

            }


        nome= "O jogo com maior valor foi : "+nome+"\nValor de : "+valor;
        return nome;
    }

//-----------------------------------------------------------------------------------------------------------

    public static void melhores_clientes(String caminho_cliente,String caminho_vendas)throws FileNotFoundException
    {
        double valor=0;
        String nome = "";
        int contador=0;
        String id ="";


        String [] array_cliente = leitura_sem_cabecalho(caminho_cliente);
        String [] array_vendas = leitura_sem_cabecalho(caminho_vendas);
        double []  array_valor_cliente = new double[array_cliente.length-1];
        String []  array_id_cliente = new String[array_cliente.length-1];

        for (int n =1; n< array_cliente.length;n++)
        {

           String [] campos_cliente = array_cliente[n].split(";");

            for (int i =1; i< array_vendas.length;i++){

                String [] campos_vendas = array_vendas[i].split(";");




                if (campos_vendas[1].equals(campos_cliente[0])) {

                    valor += Double.parseDouble(campos_vendas[5]);
                    //id=campos_vendas[1];


                }



            }


            array_id_cliente[n-1] = id;

            System.out.println(valor);

        }
        valor=0;
        id="";


        for (int i =1; i<array_valor_cliente.length;i++ )
        {

            if (array_valor_cliente[i]>array_valor_cliente[i-1])
            {
                valor =array_valor_cliente[i-1];
                array_valor_cliente[i-1]=array_valor_cliente[i];
                array_valor_cliente[i]=valor;

                id=array_id_cliente[i-1];
                array_id_cliente[i-1]=array_id_cliente[i];
                array_id_cliente[i]=id;


            }


        }
        valor=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Indique o numero de melhores  clientes que deseja ver   :" +
                "serão apresentados do maior para o menor");

        valor = input.nextInt();
        if (valor < array_cliente.length-1){

            for(int n = 0; n<valor; n++) {

                //System.out.println(pesquisa_(Integer.parseInt(array_id_cliente[n]).toString(),"src/loja_jogos/GameStart/GameStart_Clientes.csv"));
                System.out.println(array_id_cliente[n]);

            }

        }else {
            System.out.println("numero maximo de maiores clientes invalido");}






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
                    caminho = "src/loja_jogos/GameStart/GameStart_Admins.csv";

                } else if (opcao.equals("2")) {

                    caminho = "src\\loja_jogos\\GameStart\\GameStart_Clientes.csv";
                } else if (opcao.equals("3")) {

                    caminho = "src\\loja_jogos\\GameStart\\GameStart_Categorias.csv";

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
                try{
                // total de vendas retoran
                System.out.printf("%.2f",total_vendas());

        } catch (FileNotFoundException e){
            System.out.println(e);
        }



                break;
            case "3":
                    // indica o total de lucro
                try{
                    // total de vendas retoran
                    System.out.printf("%.2f",total_lucro());

                } catch (FileNotFoundException e){
                    System.out.println(e);
                }
                break;

            case "4":

                // pesquida cliente por id
                try {
                    System.out.println("Indique o id do cliente");
                    String id = input.nextLine();
                    System.out.println(pesquisa_(id, "src/loja_jogos/GameStart/GameStart_Clientes.csv"));
                }catch (FileNotFoundException e){
                    System.out.println(e);
                }

                break;
            case "5":
                // indica o jogo com maior valor vendido
                try {

                    System.out.println(maior_valor("src/loja_jogos/GameStart/GameStart_Vendas.csv"));
                }catch (FileNotFoundException e){
                    System.out.println(e);
                }




                break;
            case "6":

                // indica o jogo com maior valor vendido
                try {

                    melhores_clientes("src/loja_jogos/GameStart/GameStart_Clientes.csv","src/loja_jogos/GameStart/GameStart_Vendas.csv");
                }catch (FileNotFoundException e){
                    System.out.println(e);
                }
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


