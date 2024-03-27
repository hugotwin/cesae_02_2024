package loja_jogos;

import javax.sound.midi.Soundbank;
import java.io.*;
import java.util.Scanner;

import static loja_jogos.login.leitura_sem_cabecalho;

public class menuCliente {

    /**
     * Funcao verifica se ja existe um cliente se não insere no ficheiro clientes
     *
     * @param caminho
     * @param nome
     * @param contacto
     * @param mail
     * @throws IOException
     */
    public static void criar_Cliente(String caminho, String nome, String contacto, String mail) throws IOException {

        boolean validacao = true;
        int contador = 0;
        Scanner input = new Scanner(System.in);

        File ficheiro = new File(caminho);
        Scanner conteudo = new Scanner(ficheiro);

        conteudo.nextLine();

        while (conteudo.hasNextLine()) {

            String linha = conteudo.nextLine();
            String[] dados = linha.split(";");

            if (contacto.contains(dados[2]) && mail.contains(dados[3])) {
                validacao = false;
            }
            contador++;

        }

        if (validacao) {

            File ficheiro2 = new File(caminho);
            FileWriter escrita = new FileWriter(ficheiro2, true);
            contador++;


            String linha = "\n" + contador + ";" + nome + ";" + contacto + ";" + mail;
            escrita.write(linha);
            escrita.close();

            System.out.println("Cliente inserido com suceso : " +
                    "\nNome : " + nome + "" +
                    "\nContacto : " + contacto + "" +
                    "\nMail : " + mail);

        } else {

            System.out.println("Verifique os dados cliente não foi inserido dados ja foram inseridos");


        }


    }

    /**
     * Funcao que vai receber um valor int e retornar false ou tru para trinagular
     * @param valor
     * @return
     */
    public static boolean triangular(int valor) {
        int contador = 0;

        while (true) {

            for (int i = 0; i <= contador; i++) {
                valor--;
            }

            if (valor < 0) {
                return false;
            } else if (valor == 0) {
                return true;
            }
            contador++;

        }

    }

    /**
     * Funcao que vai indicar os lugares de estacionamento triangulares e multiplos de 5
     * @param valor
     */
    public static void estacionamento(int valor) {

        for (int n = 0; n <= valor; n++) {

            if (triangular(n) && n % 5 == 0) {

                System.out.println(n);
            }


        }


    }

    /**
     * Funcao que apresenta uma lista de jogos
     * @param caminho_vendas_
     * @throws FileNotFoundException
     */
    public static void jogos(String caminho_vendas_) throws FileNotFoundException {
        int contador = 0;

        String[] array_vendas = leitura_sem_cabecalho(caminho_vendas_);
        String[] array_nome_jogo = new String[array_vendas.length - 1];// array com o nome do jogos

        int contador_jogos=0;

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
                contador_jogos++;

            }
        }

        String[] array_jogos = new String[contador_jogos];
        contador_jogos=0;

        for (int n = 0; n < array_nome_jogo.length; n++) {

            if (array_nome_jogo[n] != null) {

                array_jogos[contador_jogos]=array_nome_jogo[n];
                contador_jogos++;


            }
        }

        for(int n=0;  n<array_jogos.length;n++ ){


            System.out.println("Numero : "+(n+1)+" Nome :"+array_jogos[n]);

        }


    }

    /**
     * Funcao que imprime o graficos de jogo escolhidos pelo utilizador
     * @throws FileNotFoundException
     */
    public static void imprimir_graficos()throws FileNotFoundException{
        boolean run = true;


        while (run) {

            System.out.println("Escolha uma opcao : " +
                    "\n1 - Call of Duty" +
                    "\n2 - Fifa" +
                    "\n3 - Hollow Knigth" +
                    "\n4 - MineCraft" +
                    "\n5 - Mortal Komnbat" +
                    "\n6 - Over Cooked " +
                    "\n7 - Witcher" +
                    "\n8 - sair " +
                    "\n -----------");
            String opcao = "";
            Scanner input = new Scanner(System.in);
            opcao = input.nextLine();

            switch (opcao)
            {
                case "1" :
                    String [] array =leitura_sem_cabecalho("C:\\Users\\softdev\\Desktop\\cesae_02_2024\\ALG_HUGO_MAIA\\Ficha_java\\src\\loja_jogos\\GameStart\\CatalogoGrafico\\callOfDuty.txt");
                    for(String n : array ){
                        System.out.println(n);
                    }

                    break;

                case "2" :
                    String [] array_ =leitura_sem_cabecalho("C:\\Users\\softdev\\Desktop\\cesae_02_2024\\ALG_HUGO_MAIA\\Ficha_java\\src\\loja_jogos\\GameStart\\CatalogoGrafico\\fifa.txt");
                    for(String n : array_ ){
                        System.out.println(n);
                    }
                    break;
                case "3" :
                    String [] array__ =leitura_sem_cabecalho("C:\\Users\\softdev\\Desktop\\cesae_02_2024\\ALG_HUGO_MAIA\\Ficha_java\\src\\loja_jogos\\GameStart\\CatalogoGrafico\\hollowKnight.txt");
                    for(String n : array__ ){
                        System.out.println(n);
                    }
                    break;

                case "4" :
                    String [] array___ =leitura_sem_cabecalho("C:\\Users\\softdev\\Desktop\\cesae_02_2024\\ALG_HUGO_MAIA\\Ficha_java\\src\\loja_jogos\\GameStart\\CatalogoGrafico\\minecraft.txt");
                    for(String n : array___ ){
                        System.out.println(n);
                    }
                    break;
                case "5" :
                    String [] array____ =leitura_sem_cabecalho("C:\\Users\\softdev\\Desktop\\cesae_02_2024\\ALG_HUGO_MAIA\\Ficha_java\\src\\loja_jogos\\GameStart\\CatalogoGrafico\\mortalKombat.txt");
                    for(String n : array____ ){
                        System.out.println(n);
                    }
                    break;

                case "6" :
                    String [] array_____ =leitura_sem_cabecalho("C:\\Users\\softdev\\Desktop\\cesae_02_2024\\ALG_HUGO_MAIA\\Ficha_java\\src\\loja_jogos\\GameStart\\CatalogoGrafico\\overcooked.txt");
                    for(String n : array_____ ){
                        System.out.println(n);
                    }
                    break;

                case "7" :
                    String [] array______ =leitura_sem_cabecalho("C:\\Users\\softdev\\Desktop\\cesae_02_2024\\ALG_HUGO_MAIA\\Ficha_java\\src\\loja_jogos\\GameStart\\CatalogoGrafico\\witcher3.txt");
                    for(String n : array______ ){
                        System.out.println(n);
                    }
                    break;

                case "8" :
                    run=false;
                    break;

            }

        }

    }

    public static void jogos_editora(String valor,String opcao ,String caminho_categorias_, String caminho_vendas_) throws FileNotFoundException {

        String nome = "";
        int contador = 0;
        int id = 0;


        String[] array_vendas = leitura_sem_cabecalho(caminho_vendas_);
        String[] array_nome_jogo = new String[array_vendas.length - 1];// array com o nome do jogos

        int contador_jogos=0;

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
                contador_jogos++;

            }
        }
        String[] array_editora = new String[contador_jogos];
        String[] array_categoria = new String[contador_jogos];
        String[] array_jogos = new String[contador_jogos];
        contador_jogos=0;

        for (int n = 0; n < array_nome_jogo.length; n++) {

            if (array_nome_jogo[n] != null) {

                array_jogos[contador_jogos]=array_nome_jogo[n];
                contador_jogos++;


            }
        }


        for(int n=0;  n<array_jogos.length;n++ ){

            for (int i=0; i<array_vendas.length;i++){

                String [] campo_vendas = array_vendas[i].split(";");

                if (campo_vendas[4] == array_jogos[n])
                {
                    array_editora[n] = campo_vendas[2];
                    array_categoria[n] = campo_vendas[3];

                }

            }

        }

        System.out.println(valor);
        if(opcao.equals("5")){

        for(int n=0; n<array_jogos.length;n++ ){

                if (array_editora[n] == valor)
                {
                    System.out.println(array_jogos[n]);

                }

            }

        }else {


            for(int n=0; n<array_jogos.length;n++ ){

                if (array_editora[n] == valor)
                {
                    System.out.println(array_jogos[n]);

                }

            }

        }

    }








    public static void menuCliente_() {
        Scanner input = new Scanner(System.in);

        boolean run = true;


        while (run) {

            System.out.println("\nIndique a opção" +
                    "\n1) Novo Registo" +
                    "\n2) Procurar Estacionamento" +
                    "\n3) Imprimir Catalogo" +
                    "\n4) Imprimir Catalogo Gráficos" +
                    "\n5) Imprimir Catalogo Editora" +
                    "\n6) Imprimir Catalogo Categoria" +
                    "\n7)  Imprimir Jogo Mais Recente " +
                    "\n8)Sair");
            String opcao = input.nextLine();


            switch (opcao) {

                case "1":
                    try {
                        System.out.println("Novo Registo :");
                        System.out.println("nome:");
                        String nome = input.nextLine();
                        System.out.println("Contacto:");
                        String contacto = input.nextLine();
                        System.out.println("Mail:");
                        String mail = input.nextLine();
                        criar_Cliente("C:\\Users\\softdev\\Desktop\\cesae_02_2024\\ALG_HUGO_MAIA\\Ficha_java\\src\\loja_jogos\\GameStart\\GameStart_Clientes.csv", nome, contacto, mail);
                    } catch (FileNotFoundException e) {
                        System.out.println(e);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }

                    break;
                case "2":

                    estacionamento(121);

                    break;
                case "3":
                    try{
                    jogos("C:\\Users\\softdev\\Desktop\\cesae_02_2024\\ALG_HUGO_MAIA\\Ficha_java\\src\\loja_jogos\\GameStart\\GameStart_Vendas.csv");
            }catch (FileNotFoundException e){
                        System.out.println(e);
                    }
                    break;

                case "4":
                    try {
                        imprimir_graficos();
                    }catch (FileNotFoundException e) {
                        System.out.println(e);
                    }
                    break;
                case "5":

                    try {
                        System.out.println("Indique a Editora : ");
                        String valor = input.nextLine();
                        jogos_editora(valor,opcao,"C:\\Users\\softdev\\Desktop\\cesae_02_2024\\ALG_HUGO_MAIA\\Ficha_java\\src\\loja_jogos\\GameStart\\GameStart_Categorias.csv","C:\\Users\\softdev\\Desktop\\cesae_02_2024\\ALG_HUGO_MAIA\\Ficha_java\\src\\loja_jogos\\GameStart\\GameStart_Vendas.csv" );
                    }catch (FileNotFoundException e) {
                        System.out.println(e);}


                        break;
                case "6":

                    break;

                case "7":

                    break;

                case "8":

                    break;

            }


        }


    }

}
