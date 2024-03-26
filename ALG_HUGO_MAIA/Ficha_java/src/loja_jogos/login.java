package loja_jogos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class login {
    /**
     * Funcao que le um ficheiro sem cabeçaho e transforma num array
     *
     * @param caminho caminho do ficheiro
     * @return uma array com a informacao do ficheiro
     * @throws FileNotFoundException
     */
    public static String[] leitura_sem_cabecalho(String caminho) throws FileNotFoundException {

        int contador = 0;
        File file = new File(caminho);
        Scanner conteudo = new Scanner(file);

        //conteudo.nextLine();

        // contar linhas
        while (conteudo.hasNextLine()) {
            conteudo.nextLine();
            contador++;

        }
        // criar array
        String[] array = new String[contador];
        File file2 = new File(caminho);
        Scanner conteudo2 = new Scanner(file2);
        contador = 0;

        // colocar linhas na string
        while (conteudo2.hasNextLine()) {
            array[contador] = conteudo2.nextLine();
            contador++;

        }

        return array;

    }



    /**
     * funcao valida um login
     *
     * @param array            recebe uma array com o contudo de um ficheiro
     * @param posicao_id       posicao para identitificar o usr
     * @param posicao_password posiccao para identificar a password no array
     * @return retorna um boolean que indica se foi validado ou naõ
     */
    public static boolean verificar_login(String[] array, int posicao_id, int posicao_password) {
        Scanner input = new Scanner(System.in);
        System.out.println("indique o user name");
        String user = input.nextLine();
        System.out.println("indique a sua password");
        String password = input.nextLine();
        boolean validado = false;

        for (int n = 0; n < array.length; n++) {
            String[] palavras = array[0].split(";");
            if (palavras[posicao_id].toLowerCase().trim().equals(user.trim().toLowerCase()) && palavras[posicao_password].trim().toLowerCase().equals(password.trim().toLowerCase())) {

                validado = true;
            }
        }

        return validado;
    }

}
