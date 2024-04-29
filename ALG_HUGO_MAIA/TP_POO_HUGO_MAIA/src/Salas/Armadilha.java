package Salas;

import Entidade.Heroi;
import Outros.Cores;

import java.util.Random;

/**
 * Classe para cria uma armadilhaque interage com o heroi
 */
public class Armadilha {

    private Heroi heroi;

    /**
     * Construtor da classe armadilha
     */
    public Armadilha() {


    }

    /**
     * Funcao que cria um totem almadicioado
     * @param heroi recebe como parametro
     * @return um boolean
     */
    public boolean totemAmaldicoado(Heroi heroi){



    Random rand = new Random();
    int valor = rand.nextInt(1,31);// sai um numero entre 0 e 9


    heroi.setVidaAtual_hp(heroi.getVidaAtual_hp()-valor);


    if (heroi.getVidaAtual_hp()<=0) { // se o numero for 5 ou 6 o que iquevale a 20% de hipoteses de encontrar o item escondido
        System.out.println(Cores.BG_RED);
        System.out.println("****************************************************************************************");
        System.out.println(   Cores.caveira + " Caiste numa Armadilha perdeste "+valor+" em vida " + Cores.caveira);
        System.out.println("****************************************************************************************\n");

        if(heroi.getVidaAtual_hp()<=0){
        System.out.println(Cores.BG_PURPLE);
        System.out.println("****************************************************************************************");
        System.out.println("O " + heroi.getNome() + " PERDEU " + Cores.derrota + Cores.derrota + Cores.derrota);
        System.out.println("****************************************************************************************\n");

        return false;


    }}

        System.out.println(Cores.BG_RED);
        System.out.println("****************************************************************************************");
        System.out.println(   Cores.caveira + " Caiste numa Armadilha perdeste "+valor+" em vida " + Cores.caveira);
        System.out.println("****************************************************************************************\n");

        return true;

    }



}
