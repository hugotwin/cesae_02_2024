package Ficha6;

public class Exercicio5 {

    public static int max_value(int[] valor){

         int controle =0;

        for(int n :valor){

            if (n>controle){

                controle =n;
            }

        }

        return controle;

    }
//-------------------------------------------
    public static int min_value(int [] valor){

        int contador=0, min=0;

        for ( int n :valor)
        {
            if ( contador==0)
            {
                min=n;
            }

            if (n<min)
            {
                min= n;
            }
            contador++;
        }
        return min;
    }


    //--------------------
    public static String crescente(int [] valor){

        int  controle=0;

        for ( int i =0; i<valor.length;i++ )
        {
            if ( i==0){controle=valor[i];}

            if (valor[i]<controle )
            {
                return "Não é crescente";

            }

            controle=valor[i];
        }
        return "è crescente";
    }


}
