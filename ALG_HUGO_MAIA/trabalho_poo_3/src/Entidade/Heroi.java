package Entidade;

import ItemHeroi.ArmaPrincipal;
import ItemHeroi.Consumivel;
import ItemHeroi.Pocao;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Scanner;

public class Heroi extends Entidade {

    private int nivel;
    private int ouro;
    private ArmaPrincipal armaPrincipal;
    private ArrayList<Consumivel> inventarioConsumiveis;

    /**
     * Construtor da clase heroi
     *
     * @param VALOR_INICIAL_VIDA
     * @param nome
     * @param forca
     * @param nivel
     * @param ouro
     * @param armaPrincipal
     */
    public Heroi(int VALOR_INICIAL_VIDA, String nome, int forca, int nivel, int ouro, ArmaPrincipal armaPrincipal) {
        super(VALOR_INICIAL_VIDA, nome, forca);
        this.ouro =ouro;
        this.nivel =nivel;
        this.armaPrincipal=armaPrincipal;
        this.inventarioConsumiveis = new <Consumivel>ArrayList();

    }

    /**
     * FUNCAO de interaxao entre duas  entidades
     * @param npc
     * @return um boolean
     */
    public boolean atacar(NPC npc) {

        System.out.println("");

        return false;
    }

    public int getOuro() {
        return this.ouro;
    }

    public void diminuirOuro(int ouro) {
        this.ouro -= ouro;
    }


    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public ArmaPrincipal getArmaPrincipal() {
        return armaPrincipal;
    }

    public void setArmaPrincipal(ArmaPrincipal armaPrincipal) {
        this.armaPrincipal = armaPrincipal;
    }



    /**
     * Funcao que imprime o inventario de consumiveis e o index na lista
     */
    public void getInventarioConsumiveis_() {

        for(Consumivel  consumivelAtual : inventarioConsumiveis)

        {
            System.out.println("Item nº : " + inventarioConsumiveis.indexOf(consumivelAtual));
            consumivelAtual.mostrarDetalhes();

        }
    }

    public ArrayList<Consumivel> getInventarioConsumiveis() {
        return inventarioConsumiveis;
    }

    public void removeInventarioConsumiveis(Consumivel consumivel)
    {
        this.inventarioConsumiveis.remove(consumivel);
    }


    public void adicionarItem(Consumivel consumivel) {
        this.inventarioConsumiveis.add(consumivel);
    }


    /**
     * Funcao de usar pocao que verifica se existe e aumenta a forca ou a voda do jogador
     */
    public void  usarPocao() {

        boolean run = true;

        while (run) {// de modo a utilizar varias pocoes se deseja

            int count=0;
            Scanner index_pocao = new Scanner(System.in);

            System.out.println("----------Lista de pocoes-----------");

            for (Consumivel consumivelAtual : getInventarioConsumiveis())// apresenta a lista de item na lista posso alterar so para apresentar as pocoes
            {
                if (consumivelAtual instanceof Pocao) {
                    System.out.println("***************************************************************************");
                    System.out.println("pocao nª : " + this.getInventarioConsumiveis().indexOf(consumivelAtual));
                    consumivelAtual.mostrarDetalhes();
                    count++;
                }
            }
            if(count==0){
                System.out.println("lista de itens não tem pocoes");
            }else{

                System.out.println("Indique qual a pocao quer usar indique o nª do item" +
                        "\n-Se quiser sair coloque um numero negativo ");

                int opcao = index_pocao.nextInt();

                if (this.getInventarioConsumiveis().get(opcao) instanceof Pocao && opcao >= 0) {

                    Pocao pocao = (Pocao) this.getInventarioConsumiveis().get(opcao);

                    System.out.println("A sua vida atual :" + getVidaAtual_hp());
                    System.out.println("A sua forca atual :" + getForca());

                    System.out.println("------------------Depois de usar a pocao a sua vida e forca serão-------------------------");

                    if (((getVidaAtual_hp() + pocao.getVida_curar()) > getVidaMax_maxHp())) {

                        System.out.println("A sua vida sera :" + getVidaMax_maxHp());
                        System.out.println("A sua forca atual :" + (getForca() + pocao.getAumento_força()));
                        System.out.println("----------------------------");
                    } else {

                        System.out.println("A sua vida sera :" + (getVidaAtual_hp() + pocao.getVida_curar()));
                        System.out.println("A sua forca atual :" + (getForca() + pocao.getAumento_força()));
                        System.out.println("----------------------------");
                    }

                    System.out.println("Deseja continuar:" +
                            "\n Sim escolha 1," +
                            "\n Não escolha 2");
                    int continuar = index_pocao.nextInt();
                    if (continuar == 1) {
                        if (((getVidaAtual_hp() + pocao.getVida_curar()) > getVidaMax_maxHp())) {

                            aumentoForca(pocao.getAumento_força());
                            setVidaAtual_hp(getVidaMax_maxHp());
                            System.out.println("Pocao consumida");
                            System.out.println("Forca :" + getForca());
                            System.out.println("Forca :" + getVidaAtual_hp());
                            System.out.println("----------------------------");
                            removeInventarioConsumiveis(pocao);


                        } else {
                            aumentoForca(pocao.getAumento_força());
                            aumentoVidaAtual_hp(pocao.getVida_curar());
                            System.out.println("Pocao consumida");
                            System.out.println("Forca :" + getForca());
                            System.out.println("Forca :" + getVidaAtual_hp());
                            System.out.println("----------------------------");
                            removeInventarioConsumiveis(pocao);
                        }
                    }

                }}

            System.out.println("Quer continuar a usar pocoes ou sair" +
                    "\n 1 - Continuar" +
                    "\n 2 - Sair ");
            int sair = index_pocao.nextInt();
            if(sair==2){run=false;
                System.out.println("Saiu");}
        }


    }


}
