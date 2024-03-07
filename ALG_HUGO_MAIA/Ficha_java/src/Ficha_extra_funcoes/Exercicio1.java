package Ficha_extra_funcoes;

public class Exercicio1 {


    public static int  minimo_(int y,int r,int s)
    {

        int valor=0;
        int [] values = new int[3];
        values[0]= y;
        values[1]= r;
        values[2]= s;

        for ( int n=0; n<values.length; n++)
        {
            if(n==0)
            {valor=values[0];
            }else if (valor>values[n])
            {
                valor=values[n];
            }


        }
        return valor;
    }


    public static void main(String[] args) {

        System.out.println(minimo_(-5,-10,3));


    }
}
