package Exercicio1;

public class Main {

    public static void main(String[] args) {
        Carro carro = new Carro("opel", "corsa",2000, TipoCombustivel.DIESEL, 235, 5);
        Carro carro2 = new Carro("toyota", "corsa",2000, TipoCombustivel.DIESEL, 235, 5);

        ;



        for (Carro corrida: carro.corrida(carro2))
        {
            System.out.println(corrida.getMarca());

        }


        System.out.println(carro2.consumo(97));


    }






}
