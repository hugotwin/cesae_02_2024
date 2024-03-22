package Ficha_ficheiros_extra;

import javax.imageio.IIOException;
import java.io.*;
import java.util.Scanner;

public class Exercicio3_funcoes {

    /**
     * @param caminho
     * @return boolean
     * @throws FileNotFoundException
     */
    public static boolean verificar_acesso(String caminho) throws FileNotFoundException {

        boolean validacao = false;

        Scanner input = new Scanner(System.in);

        File ficheiro = new File(caminho);


        while (validacao != true) {
            System.out.println("insira o seu user :");
            String user = input.nextLine();
            System.out.println("insira a sua password :");
            String password = input.nextLine();
            Scanner conteudo = new Scanner(ficheiro);
            while (conteudo.hasNextLine()) {

                String linha = conteudo.nextLine();
                String[] dados = linha.split(";");
                if (user.equals(dados[0]) && password.equals(dados[1])) {
                    validacao = true;
                }


            }
        }

        return validacao;

    }

    /**
     * funcao de gerir as bases de dados
     *
     * @throws IOException
     */
    public static void gerir_bases_dados() throws IOException {


        boolean run = true;
        while (run) {

            System.out.println("indique a opção : \n1 - Clientes" +
                    "\n2 - Temas" +
                    "\n3 - Quartos " +
                    "\n4 - Autenticação" +
                    "\n5 - Produtos");

            Scanner input = new Scanner(System.in);
            String opcao = input.nextLine().trim().toLowerCase();
            String dados = "";
            switch (opcao) {
                case "1":

                    System.out.println("1 -  Novo Cliente: " +
                            "\n2 - Atualizar Contactos do Cliente: ");

                    File ficheiro = new File("C:/Users/softdev/Desktop/cesae_02_2024/ALG_HUGO_MAIA/Ficha_java/src/Ficha_ficheiros_extra/Ex_03 Hotel Temático/clientesHotel.csv");
                    Scanner conteudo = new Scanner(ficheiro);
                    int contador = 0;

                    opcao = input.nextLine().trim().toLowerCase();


                    switch (opcao) {
                        case "1":
                            // verifica qual é o ultimo indice
                            System.out.println("ok");
                            while (conteudo.hasNextLine()) {
                                String linha = conteudo.nextLine();

                                String[] linhas = linha.split(";");
                                dados = linhas[0].split("-")[0] + "-" + Integer.toString(Integer.parseInt(linhas[0].split("-")[1]) + 1);

                            }


                            System.out.println("nome :");
                            dados += ";" + input.nextLine();
                            System.out.println("data nascimento :");
                            dados += ";" + input.nextLine();
                            System.out.println("telefone :");
                            dados += ";" + input.nextLine();
                            System.out.println("mail :");
                            dados += ";" + input.nextLine();
                            System.out.println(dados);

                            FileWriter escrita = new FileWriter(ficheiro, true);
                            escrita.write(dados);
                            escrita.close();
                            run = false;

                            break;

                        case "2":

                            System.out.println(" indique o id do cliente");
                            String id = input.nextLine();
                            System.out.println("Qual o campo deseja alterar : " +
                                    "\n 1 - telemovel " +
                                    "\n 2 - mail");
                            opcao = input.nextLine();
                            System.out.println("Indique o novo dado");
                            dados = input.nextLine();

                            /// contar o tamano do texto

                            while (conteudo.hasNextLine()) {
                                conteudo.nextLine();
                                contador++;

                            }

                            // criar arry e passar o texto
                            String[] array = new String[contador];

                            File ficheiro_ = new File("C:/Users/softdev/Desktop/cesae_02_2024/ALG_HUGO_MAIA/Ficha_java/src/Ficha_ficheiros_extra/Ex_03 Hotel Temático/clientesHotel.csv");
                            Scanner conteudo_ = new Scanner(ficheiro_);
                            contador = 0;

                            while (conteudo_.hasNextLine()) {
                                array[contador] = conteudo_.nextLine().toString();
                                contador++;
                            }
                            PrintWriter writer = new PrintWriter(ficheiro);

                            /// verificar o campo e alterar o campo
                            for (int n = 0; n < array.length; n++) {
                                String[] linha = array[n].split(";");

                                if (linha[0].equals(id)) {
                                    if (opcao.equals("1")) {
                                        linha[3] = dados;
                                        String linhas = linha[0] + ";" + linha[01] + ";" + linha[2] + ";" + linha[3] + ";" + linha[4];

                                        writer.println(linhas);

                                    } else if (opcao.equals("2")) {
                                        System.out.println("ok");
                                        linha[4] = dados;
                                        String linhas = linha[0] + ";" + linha[01] + ";" + linha[2] + ";" + linha[3] + ";" + linha[4];
                                        writer.println(linhas);
                                    }

                                } else {
                                    writer.println(array[n]);
                                }


                            }
                            writer.close();
                            run = false;
                            break;

                        default:
                            System.out.println(" indique um id correcto");
                            break;

                    }
                    break;


                case "2":

                    System.out.println("Novo tema;");

                    File ficheiro2 = new File("C:/Users/softdev/Desktop/cesae_02_2024/ALG_HUGO_MAIA/ficha_java/src/Ficha_ficheiros_extra/Ex_03 Hotel Temático/temasHotel.csv");
                    Scanner conteudo_tema = new Scanner(ficheiro2);

                    // verifica p ultimo indice
                    while (conteudo_tema.hasNextLine()) {
                        String linha = conteudo_tema.nextLine();
                        String[] linhas = linha.split(";");
                        dados = "\n" + linhas[0].split("-")[0] + "-" + Integer.toString(Integer.parseInt(linhas[0].split("-")[1]) + 1);

                    }

                    System.out.println("nome :");
                    dados += ";" + input.nextLine();
                    System.out.println("multiplicador de preço :");
                    dados += ";" + input.nextLine();

                    FileWriter escrita = new FileWriter(ficheiro2, true);
                    escrita.write(dados);
                    escrita.close();
                    run = false;
                    break;

                case "3":

                    System.out.println("Novo Quarto :");

                    File ficheiro3 = new File("C:\\Users\\softdev\\Desktop\\cesae_02_2024\\ALG_HUGO_MAIA\\Ficha_java\\src\\Ficha_ficheiros_extra\\Ex_03 Hotel Temático\\quartosHotel.csv");
                    Scanner conteudo_quarto = new Scanner(ficheiro3);

                    // verifica p ultimo indice
                    while (conteudo_quarto.hasNextLine()) {
                        String linha = conteudo_quarto.nextLine();
                        String[] linhas = linha.split(";");
                        dados = "\n" + linhas[0].split("-")[0] + "-" + Integer.toString(Integer.parseInt(linhas[0].split("-")[1]) + 1);

                    }

                    System.out.println("tema:");
                    dados += ";" + input.nextLine();
                    System.out.println("tipo de quarto :" +
                            "\n Single, duplo ou suite");
                    dados += ";" + input.nextLine().toUpperCase().trim();

                    FileWriter escrita2 = new FileWriter(ficheiro3, true);
                    escrita2.write(dados);
                    escrita2.close();
                    run = false;
                    break;

                case "4":

                    //---------------------------------


                    System.out.println("1 -  Novas credencias: " +
                            "\n2 - Eliminar credenciais : ");
                    File ficheiro4 = new File("C:\\Users\\softdev\\Desktop\\cesae_02_2024\\ALG_HUGO_MAIA\\Ficha_java\\src\\Ficha_ficheiros_extra\\Ex_03 Hotel Temático\\loginHotel.txt");
                    Scanner conteudo_credencias = new Scanner(ficheiro4);

                    opcao = input.nextLine().trim().toLowerCase();


                    switch (opcao) {
                        case "1":
                            // cria nova credencial
                            while (conteudo_credencias.hasNextLine()) {
                                String linha = conteudo_credencias.nextLine();
                                String[] linhas = linha.split(";");
                                dados = "\n" + linhas[0].split("-")[0] + "-" + Integer.toString(Integer.parseInt(linhas[0].split("-")[1]) + 1);
                            }

                            System.out.println("username :");
                            dados += ";" + input.nextLine();
                            System.out.println("password :");
                            dados += ";" + input.nextLine();

                            FileWriter escrita4 = new FileWriter(ficheiro4, true);
                            escrita4.write(dados);
                            escrita4.close();
                            run = false;

                            break;

                        case "2":

                            System.out.println(" indique username");
                            String id = input.nextLine();
                            contador = 0;


                            while (conteudo_credencias.hasNextLine()) {
                                conteudo_credencias.nextLine();
                                contador++;
                            }
                            String[] array = new String[contador];
                            File ficheiro5 = new File("C:\\Users\\softdev\\Desktop\\cesae_02_2024\\ALG_HUGO_MAIA\\Ficha_java\\src\\Ficha_ficheiros_extra\\Ex_03 Hotel Temático\\loginHotel.txt");
                            Scanner conteudo_credencias_ = new Scanner(ficheiro5);
                            for (String n : array) {
                                n = conteudo_credencias_.nextLine();
                            }


                            run = false;
                            break;

                        default:
                            System.out.println(" indique um id correcto");
                            break;


                    }

                    break;

                case "5":

                    System.out.println("Novo produto;");

                    File ficheiro5 = new File("C:\\Users\\softdev\\Desktop\\cesae_02_2024\\ALG_HUGO_MAIA\\Ficha_java\\src\\Ficha_ficheiros_extra\\Ex_03 Hotel Temático\\produtosHotel.csv");
                    Scanner conteudo_produto = new Scanner(ficheiro5);

                    // verifica p ultimo indice
                    while (conteudo_produto.hasNextLine()) {
                        String linha = conteudo_produto.nextLine();
                        String[] linhas = linha.split(";");
                        dados = linhas[0].split("-")[0] + "-" + Integer.toString(Integer.parseInt(linhas[0].split("-")[1]) + 1);

                    }

                    System.out.println("nome :");
                    dados += ";" + input.nextLine();
                    System.out.println("preço :");
                    dados += ";" + input.nextLine();

                    FileWriter escrita3 = new FileWriter(ficheiro5, true);
                    escrita3.write("\n" + dados);
                    escrita3.close();
                    run = false;
                    break;


                default:

                    System.out.println("Escolha uma opcao valida :");
                    break;


            }


        }


    }

    /**
     * funcao consultar clientes
     *
     * @return
     * @throws FileNotFoundException
     */
    public static String consultarclientes() throws FileNotFoundException {

        Scanner input = new Scanner(System.in);
        String dados = "";
        System.out.println(" Consultar clientes" +
                "\n1 -  idCliente: " +
                "\n2 - telemovel: " +
                "\n3 - por email");
        int contador = 0;
        String opcao = input.nextLine().trim().toLowerCase();
        File ficheiro = new File("C:/Users/softdev/Desktop/cesae_02_2024/ALG_HUGO_MAIA/Ficha_java/src/Ficha_ficheiros_extra/Ex_03 Hotel Temático/clientesHotel.csv");
        Scanner conteudo = new Scanner(ficheiro);

        switch (opcao) {
            case "1":
                System.out.println("indique o id");
                dados = input.nextLine();
                while (conteudo.hasNextLine()) {
                    String linha = conteudo.nextLine();
                    String[] linhas = linha.split(";");
                    if (linhas[0].equals(dados)) {
                        return "" + linhas[1] + " - " + linhas[2] + " - " + linhas[3] + " - " + linhas[4];
                    }
                }
                break;

            case "2":

                System.out.println("indique o telemovel");
                dados = input.nextLine();
                while (conteudo.hasNextLine()) {
                    String linha = conteudo.nextLine();
                    String[] linhas = linha.split(";");
                    if (linhas[3].equals(dados)) {
                        dados = "" + linhas[1] + " - " + linhas[2] + " - " + linhas[3] + " - " + linhas[4];
                    }
                }
                break;

            case "3":

                System.out.println("indique o email");
                dados = input.nextLine();
                while (conteudo.hasNextLine()) {
                    String linha = conteudo.nextLine();
                    String[] linhas = linha.split(";");
                    if (linhas[4].equals(dados)) {
                        dados = "" + linhas[1] + " - " + linhas[2] + " - " + linhas[3] + " - " + linhas[4];
                    }
                }
                break;
            default:

                dados = "valores invalidos";
        }
        return dados;
    }
    //-----------------------------------------------------

public static void consultar_quartos() throws FileNotFoundException{


    Scanner input = new Scanner(System.in);
    String dados = "";

    System.out.println(" Consultar quartos" +
            "\n1 -  Quartos disponivel: " +
            "\n2 - Quarto disponivel por tema : " +
            "\n3 - Quarto disponivel por tipo");


    int contador = 0;
    String opcao = input.nextLine().trim().toLowerCase();
    File ficheiro = new File("C:\\Users\\softdev\\Desktop\\cesae_02_2024\\ALG_HUGO_MAIA\\Ficha_java\\src\\Ficha_ficheiros_extra\\Ex_03 Hotel Temático\\quartosHotel.csv");
    Scanner conteudo_quartos = new Scanner(ficheiro);




    switch (opcao) {
        case "1":
/*
            System.out.println("Consultar, quartos");
            dados = input.nextLine();
            while (conteudo_quartos.hasNextLine()) {

                File ficheiro2 = new File("C:\\Users\\softdev\\Desktop\\cesae_02_2024\\ALG_HUGO_MAIA\\Ficha_java\\src\\Ficha_ficheiros_extra\\Ex_03 Hotel Temático\\reservasHotel.csv");
                Scanner conteudo_reservas = new Scanner(ficheiro2);

                String linha = conteudo_quartos.nextLine();
                String linhas [] = linha.split(";"); /// coluna 0 da o id do quarto
                String quarto = linhas[0];

                while (conteudo_reservas.hasNextLine())
                {

                    String linha_reserva = conteudo_reservas.nextLine();
                    String linhas_reservas [] = linha_reserva.split(";"); /// coluna 0 da o id do quarto
                    String quarto_reservas = linhas_reservas[3];



                }

                String[] linhas = linha.split(";");

                if (linhas[0].equals(dados) ) {
                    dados = "" + linhas[1] + " - " + linhas[2] + " - " + linhas[3] + " - " + linhas[4]+"\n";
                }
            }





*/

            break;

        case "2":
/*
            System.out.println("indique o telemovel");
            dados = input.nextLine();
            while (conteudo.hasNextLine()) {
                String linha = conteudo.nextLine();
                String[] linhas = linha.split(";"); // compara o telefone com os dados
                if (linhas[3].equals(dados)) {
                    dados = "" + linhas[1] + " - " + linhas[2] + " - " + linhas[3] + " - " + linhas[4];
                }
            }*/
            break;

        case "3":
/*
            System.out.println("indique o email");
            dados = input.nextLine();
            while (conteudo.hasNextLine()) {
                String linha = conteudo.nextLine();
                String[] linhas = linha.split(";");
                if (linhas[4].equals(dados)) {
                    dados = "" + linhas[1] + " - " + linhas[2] + " - " + linhas[3] + " - " + linhas[4];
                }
            }*/
            break;
        default:

            dados = "valores invalidos";
    }
   /* return dados;*/









}







}






