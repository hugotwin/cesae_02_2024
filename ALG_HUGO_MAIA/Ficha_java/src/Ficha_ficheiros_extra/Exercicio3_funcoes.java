package Ficha_ficheiros_extra;

import javax.imageio.IIOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
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
        Scanner conteudo = new Scanner(ficheiro);

        while (validacao != true) {
            System.out.println("insira o seu user :");
            String user = input.nextLine();
            System.out.println("insira a sua password :");
            String password = input.nextLine();

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

            switch (opcao) {
                case "1":
                    System.out.println("1 -  Novo Cliente: " +
                            "\n2 - Atualizar Contactos do Cliente: ");
                    File ficheiro = new File("C:/Users/softdev/Desktop/cesae_02_2024/ALG_HUGO_MAIA/Ficha_java/src/Ficha_ficheiros_extra/Ex_03 Hotel Temático/clientesHotel.csv");
                    Scanner conteudo = new Scanner(ficheiro);
                    String dados;
                    opcao = input.nextLine().trim().toLowerCase();

                            switch (opcao)
                            {   case "1":
                                while(conteudo.hasNextLine()){
                                    String linha = conteudo.nextLine();
                                    String [] linhas= linha.split(";");
                                    dados = Integer.toString(Integer.parseInt(linhas[0])+1);}
                            }
                                System.out.println("nome :");
                                dados =";"+input.nextLine();
                                System.out.println("data nascimento :");
                                dados =";"+input.nextLine();
                                System.out.println("telefone :");
                                dados =";"+input.nextLine();
                                System.out.println("mail :");
                                dados =";"+input.nextLine();


                                FileWriter escrita =  new FileWriter(ficheiro, true);
                                escrita.write(dados);


                                break;

                                case "2":

                                    break;

                                default:
                                    break;





                            }




                    break;
               /**
                case "2":
                    System.out.println("");
                    break;

                case "3":

                    break;
                case "4":

                    break;

                case "5":

                    break;

                default:

                    System.out.println("Escolha uma opcao valida :");
                    break;
                */

            }


        }



}






