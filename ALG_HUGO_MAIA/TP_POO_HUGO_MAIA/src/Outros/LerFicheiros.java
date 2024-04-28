package Outros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LerFicheiros {



    public void ler(String caminho) throws FileNotFoundException{


            int contador = 0;
            File file = new File(caminho);
            Scanner conteudo = new Scanner(file);

            //conteudo.nextLine();

            // contar linhas
            while (conteudo.hasNextLine()) {

                System.out.println(conteudo.nextLine());
                //contador++;

            }
            /* criar array
            String[] array = new String[contador];
            File file2 = new File(caminho);
            Scanner conteudo2 = new Scanner(file2);
            contador = 0;

            // colocar linhas na string
            while (conteudo2.hasNextLine()) {
                array[contador] = conteudo2.nextLine();
                contador++;

            }*/



    }



}
