package Entidade;

import ItemHeroi.ArmaPrincipal;
import ItemHeroi.Consumivel;

import java.util.ArrayList;

public class Heroi extends Entidade {

private int nivel;
private int ouro;
private ArmaPrincipal armaPrincipal;
private ArrayList<Consumivel> inventarioConsumiveis;

    /**
     * Construtor da clase heroi
     * @param VALOR_INICIAL_VIDA
     * @param nome
     * @param forca
     * @param nivel
     * @param ouro
     * @param armaPrincipal
     */
    public Heroi(int VALOR_INICIAL_VIDA, String nome, int forca, int nivel, int ouro, ArmaPrincipal armaPrincipal, ) {
        super(VALOR_INICIAL_VIDA, nome, forca);
        this.inventarioConsumiveis=new <Consumivel>ArrayList();

    }



    public boolean atacar(NPC npc){



    }
    return false;
}
