package Ficha_extra_funcoes;




public class Exercicio6 {

    public static double somatorio(int valor)

    {
        int contador =0 , contador_a=1, soma=0;
        double value_;

        value_=valor;

        while (value_>=1)
        {
            value_ *=0.1;
            contador++;

        }

        value_=valor;
        for ( int i =(contador-1) ; i>=0; i--)
        {
            value_=valor%(10);
            valor=valor/10;
            soma+=value_;
            contador_a++;
        }

         return soma;
    }

    public static void main(String[] args) {


        System.out.println(somatorio(361));

    }


}
