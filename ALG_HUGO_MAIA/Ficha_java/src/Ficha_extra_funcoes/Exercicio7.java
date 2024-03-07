package Ficha_extra_funcoes;




public class Exercicio7 {
    public static double inverter(int valor)

    {
        int contador =0 , contador_a=1, soma=0, multiplicador=1;
        double value_;

        value_=valor;

        while (value_>=1)
        {
            value_ *=0.1;
            contador++;

        }

        value_=valor;
        /*
        for (int i = (contador - 1); i >= 0; i--) {
            value_ = valor % (10);
            valor = valor / 10;
            for (int j = i; j > 0; j--) {
                multiplicador *= 10;
            }
            soma += (value_ * multiplicador);
            contador_a++;
            multiplicador = 1;

        }*/
        for (int i = 0; i <contador; i++) {

            value_ = valor % (10);
            valor = valor / 10;
            soma += (value_ * multiplicador);
            multiplicador *= 10;

        }
        return soma;
    }



    public static void main(String[] args) {

        System.out.println(inverter(123));

    }
}
