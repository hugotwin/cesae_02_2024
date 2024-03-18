package Ficha_ficheiros_extra;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Exercicio2 {

    public static void ler_as_palavras()throws FileNotFoundException
    {
        int contador=0, contador2=0, contador_array=0;
        String [] array_palavras = new String [10];
        int [] array_contagem = new int [10];

        File ficheiro = new File("C:/Users/hugot/OneDrive/Ambiente de Trabalho/cesae_02_2024/ALG_HUGO_MAIA/Ficha_java/src/Ficha_ficheiros_extra/exercicio_02.txt");
        Scanner conteudo = new Scanner(ficheiro);



        while (conteudo.hasNext()){

            String palavra = conteudo.next();

            File ficheiro2 = new File("C:/Users/hugot/OneDrive/Ambiente de Trabalho/cesae_02_2024/ALG_HUGO_MAIA/Ficha_java/src/Ficha_ficheiros_extra/exercicio_02.txt");
            Scanner conteudo2 = new Scanner(ficheiro2);





            //----- ciclo de contar a palvra
            while(conteudo2.hasNext()){


                String palavra2=conteudo2.next();


                if(palavra.equals(palavra2))
                {
                    contador++;
                }


            }

            //------- ciclo para verificar se tem a plavra no array, para ordenar ir ao valor mais pequeno e colocar la a palavra

            for (int i =0; i<array_palavras.length; i++) {

                if (palavra.equals(array_palavras[i])) {
                    contador2++;

                }
            }
            System.out.println(contador2);


                if (contador2==0)

                {
                    //------------------ ciclo de organizar a contagem do array
                    for (int n=1; n< array_contagem.length; n++)
                    {
                        if (array_contagem[n]>array_contagem[n-1] && contador_array<=10)

                        {
                            int tem = array_contagem[n-1];
                            array_contagem[n-1]=array_contagem[n];
                            array_contagem[n]=tem;
                            String palavra_temp = array_palavras[n-1];
                            array_palavras[n-1]=array_palavras[n];
                            array_palavras[n]=palavra_temp;

                        }
                    }


                    if (contador_array>=10)

                    {
                        if (array_contagem[9]<contador){

                            array_palavras[9]=palavra;
                            array_contagem[9]=contador;

                        }


                    }else
                    {
                        array_palavras[contador_array] = palavra;
                        array_contagem[contador_array] = contador;
                        contador_array++;
                    }
                    


                }

                contador2=0;

            contador=0;


        }

        for (int n=1; n< array_contagem.length; n++)
        {
            if (array_contagem[n]>array_contagem[n-1] && contador_array<=10)

            {
                int tem = array_contagem[n-1];
                array_contagem[n-1]=array_contagem[n];
                array_contagem[n]=tem;
                String palavra_temp = array_palavras[n-1];
                array_palavras[n-1]=array_palavras[n];
                array_palavras[n]=palavra_temp;

            }
        }




        for(String n : array_palavras){
            System.out.println(n);}

        for(int n : array_contagem){
            System.out.println(n);}


    }




    public static void main(String[] args) {

        try
        {
            ler_as_palavras();

        }catch (Exception e)
        {
            System.out.println(e);
        }



    }

}


