package Ficha7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercicio10 {


    /**
     * Funcao Imprime uma lista de formandos
     * @throws FileNotFoundException
     */
    public static void imprimirFormandos()throws FileNotFoundException {

        File ficheiro = new File("C:/Users/softdev/Desktop/cesae_02_2024/ALG_HUGO_MAIA/Ficha_java/src/Ficha7/exercicio_10.csv");

        Scanner conteudo = new Scanner(ficheiro);
        int contador=0, contador_2=0;
        boolean is_not_in = false;

        conteudo.nextLine();


        while(conteudo.hasNextLine())
        {

           conteudo.nextLine();
            contador++;
        }


        String [] array = new String[contador];

        contador=0;



        Scanner conteudo2 = new Scanner(ficheiro);
        conteudo2.nextLine();



        while(conteudo2.hasNextLine())
        {

            String linha =conteudo2.nextLine();
            String [] linhas = linha.split(",");

                for( int n =0; n< array.length; n++)
                {

                    if ( linhas[0].equals(array[n]))
                    {
                        contador_2++;

                    }
                }
                if (contador_2==0){is_not_in=true; }

                if (is_not_in)

                {
                    array[contador]=linhas[0];
                }

                contador_2=0;
            contador++;
            is_not_in=false;
            }

       for( int n =0; n< array.length; n++)
        {
            System.out.println(array[n]);
        }
    }
  //-----------------------------Informacao de formando--------------------------


    /**
     *
     * @return Informacao de um aluno numa matricula
     * @throws FileNotFoundException
     */
    public static String informacaoFormando()throws FileNotFoundException {

        File ficheiro = new File("C:/Users/softdev/Desktop/cesae_02_2024/ALG_HUGO_MAIA/Ficha_java/src/Ficha7/exercicio_10.csv");

        System.out.println("Indique a matricula:");
        Scanner input = new Scanner(System.in);
        String matricula = input.nextLine();
        String contacto="";

        Scanner conteudo2 = new Scanner(ficheiro);
        conteudo2.nextLine();

        while(conteudo2.hasNextLine())
        {

            String linha =conteudo2.nextLine();
            String [] linhas = linha.split(",");

            if(linhas[1].equals(matricula) && contacto.equals("")){

              contacto ="Nome:"+ linhas[0]+"email : "+linhas[3]+" idade :"+linhas[4];

            }

        }

        return contacto;
    }
//---------------------------------Numeros de alunos num curso
    /**
     *
     * @return Informacao de um aluno numa matricula
     * @throws FileNotFoundException
     */
    public static String numeroFormadosCurso()throws FileNotFoundException {

        File ficheiro = new File("C:/Users/softdev/Desktop/cesae_02_2024/ALG_HUGO_MAIA/Ficha_java/src/Ficha7/exercicio_10.csv");

        System.out.println("Indique o cursor :");
        Scanner input = new Scanner(System.in);
        String curso = input.nextLine();
        String contacto="";
        int contador =0;

        Scanner conteudo2 = new Scanner(ficheiro);
        conteudo2.nextLine();

        while(conteudo2.hasNextLine())
        {

            String linha =conteudo2.nextLine();
            String [] linhas = linha.split(",");

            if(linhas[2].trim().toLowerCase().equals(curso.trim().toLowerCase()) ){

                contacto +=" Nome :"+ linhas[0]+" matricula :"+ linhas[1]+" email :"+linhas[3]+" idade :"+linhas[4]+"\n";
                contador++;

            }

        }
        conteudo2.close();
        ficheiro.

        return contacto+"\n O número de inscritos no curso : "+ contador;
    }
    //---------------------------- ALUNO MAIS VELHO



    public static void alunoVelho() throws FileNotFoundException
    {

        File ficheiro = new File("C:/Users/softdev/Desktop/cesae_02_2024/ALG_HUGO_MAIA/Ficha_java/src/Ficha7/exercicio_10.csv");
        Scanner conteudo = new Scanner(ficheiro);

        conteudo.nextLine();

        while(conteudo.hasNextLine())
        String linha=conteudo.hasNextLine();

        }





    }







    public static void main(String[] args) {
       try{
           //imprimirFormandos();
           //System.out.println(informacaoFormando());
           System.out.println(numeroFormadosCurso());
       } catch (Exception e){
           System.out.println(e);

       }


    }








}
