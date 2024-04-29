package Salas;

import Entidade.Heroi;
import Outros.Cores;

import java.util.Random;
import java.util.Scanner;

/**
 * Funcao que cria um totem especial
 */
public class SalaItemEspecial {

    private Heroi heroi;

    public SalaItemEspecial() {


    }

    /**
     * Funcao que recebe  eum heroi
     * @param heroi
     */
    public void itemEspecial(Heroi heroi){



    Random rand = new Random();
    int valor = rand.nextInt(0,10);// sai um numero entre 0 e 9

    if (valor==5 || valor ==6) { // se o numero for 5 ou 6 o que iquevale a 20% de hipoteses de encontrar o item escondido


        System.out.println("****************************************************************************************");
        System.out.println(Cores.estrela + "Estás cheio de sorte encontraste um item especial,  que ira dar 30 ouro " + Cores.estrela);
        System.out.println("****************************************************************************************\n");

        heroi.setOuro(heroi.getOuro()+30);

    }


    }

}
