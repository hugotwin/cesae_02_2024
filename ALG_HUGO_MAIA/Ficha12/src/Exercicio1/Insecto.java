package Exercicio1;

import Exercicio1.Enum.TipoDieta;

import java.util.Random;

public class Insecto extends Animal{

    private boolean venenoso;


    public Insecto(String nome, String especie, String pais_origem, int idade, double peso_Kg, double inteligência, TipoDieta dieta, String barulho,boolean venenoso ) {
        super(nome, especie, pais_origem, idade, peso_Kg, inteligência, dieta, barulho);
        this.venenoso=venenoso;
    }


    public void insectoChateia()
    {
        String [] barulhos ={"bzzz","Tic Tic Tic", " Pssssss "};
        Random rand = new Random();
        int valor = rand.nextInt(3);

        System.out.println(barulhos[valor]);

    }

    public boolean isVenenoso() {
        return venenoso;
    }
}
