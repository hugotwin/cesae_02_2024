package Entidade;

import ItemHeroi.ArmaPrincipal;
import ItemHeroi.Consumivel;
import ItemHeroi.ConsumivelCombate;
import ItemHeroi.Pocao;
import Outros.Cores;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Classe abstracta que sera super classe de Arqueiro, cavaleiro, feiticeiro
 */
public abstract class Heroi extends Entidade {



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
     * FUNCAO de interacao entre duas  entidades
     * @return um boolean
     */
    //public abstract boolean atacar();

    public int getOuro() {
        return this.ouro;
    }

    /**
     * Funccao que diminui a quantidade ouro
     * @param ouro
     */
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
            System.out.println(Cores.BG_GREEN);
            System.out.println("*****************************************************************************************************************************************");
            System.out.println("----------------Item nº : " + inventarioConsumiveis.indexOf(consumivelAtual)+"------------------");
            consumivelAtual.mostrarDetalhes();
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------\n");

        }

    }


    public ArrayList<Consumivel> getInventarioConsumiveis() {
        return inventarioConsumiveis;
    }

    /**
     * Funcao que remove um consumivel do inventario
     * @param consumivel
     */
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
            try {
                int count = 0;
                Scanner index_pocao = new Scanner(System.in);
                System.out.println(Cores.BG_CYAN);
                System.out.println("----------Lista de pocoes-----------");

                for (Consumivel consumivelAtual : getInventarioConsumiveis())// apresenta a lista de item na lista posso alterar so para apresentar as pocoes
                {
                    if (consumivelAtual instanceof Pocao) {

                        System.out.println("****************************************************************************************");
                        System.out.println("pocao nª : " + this.getInventarioConsumiveis().indexOf(consumivelAtual));
                        consumivelAtual.mostrarDetalhes();
                        System.out.println("****************************************************************************************");
                        count++;
                    }
                }
                if (count == 0) {
                    System.out.println(Cores.BG_YELLOW);
                    System.out.println("****************************************************************************************");
                    System.out.println("lista de itens não tem pocoes");
                    System.out.println("****************************************************************************************");
                } else {

                    System.out.println("Indique qual a pocao quer usar indique o nª do item" +
                            "\n-Se quiser sair coloque um numero negativo ");



                    int opcao = index_pocao.nextInt();
                    if(opcao<0){run=false;}

                    if (this.getInventarioConsumiveis().get(opcao) instanceof Pocao && opcao >= 0) {

                        Pocao pocao = (Pocao) this.getInventarioConsumiveis().get(opcao);
                        System.out.println("****************************************************************************************");
                        System.out.println("A sua vida atual :" + getVidaAtual_hp());
                        System.out.println("A sua forca atual :" + getForca());

                        System.out.println("------------------Depois de usar a pocao a sua vida e forca serão-------------------------");

                        if (((getVidaAtual_hp() + pocao.getVida_curar()) > getVidaMax_maxHp())) {

                            System.out.println("A sua vida sera :" + getVidaMax_maxHp());
                            System.out.println("A sua forca atual :" + (getForca() + pocao.getAumento_forca()));
                            System.out.println("****************************************************************************************");
                        } else {

                            System.out.println("A sua vida sera :" + (getVidaAtual_hp() + pocao.getVida_curar()));
                            System.out.println("A sua forca atual :" + (getForca() + pocao.getAumento_forca()));
                            System.out.println("****************************************************************************************");
                        }
                        boolean running =true;
                        int continuar =0;
                        while (running) {

                            try {
                                System.out.println("****************************************************************************************");
                                System.out.println("Deseja continuar:" +
                                        "\n Sim escolha 1," +
                                        "\n Não escolha 2");
                                System.out.print("Opção ->");
                                continuar = Integer.parseInt(index_pocao.nextLine());
                                System.out.println("****************************************************************************************");
                                running = false;
                            }catch (Exception e){

                                System.out.println("  Escolha uma das opções   ");
                            }

                        }

                        if (continuar == 1) {
                            System.out.println("****************************************************************************************");
                            if (((getVidaAtual_hp() + pocao.getVida_curar()) > getVidaMax_maxHp())) {
                                aumentoForca(pocao.getAumento_forca());
                                setVidaAtual_hp(getVidaMax_maxHp());
                                System.out.println("Pocao consumida");
                                setForca(getForca()+pocao.getAumento_forca());
                                System.out.println("Forca :" + getForca());
                                System.out.println("Vida atual:" + getVidaAtual_hp());
                                System.out.println("****************************************************************************************");
                                removeInventarioConsumiveis(pocao);


                            } else {
                                System.out.println("****************************************************************************************");
                                aumentoForca(pocao.getAumento_forca());
                                aumentoVidaAtual_hp(pocao.getVida_curar());
                                System.out.println("Pocao consumida");
                                setForca(getForca()+pocao.getAumento_forca());
                                System.out.println("Forca :" + getVidaAtual_hp());
                                setVidaAtual_hp(getVidaAtual_hp()+pocao.getVida_curar());
                                System.out.println("Vida atual :" + getVidaAtual_hp());
                                System.out.println("****************************************************************************************");
                                removeInventarioConsumiveis(pocao);
                            }
                        }

                    }
                }
               boolean  running = true;
                int sair=0;
                while (running) {
                    try {
                        System.out.println("****************************************************************************************");
                        System.out.println("Quer continuar a usar pocoes ou sair" +
                                "\n 1 - Continuar" +
                                "\n 2 - Sair ");
                        System.out.print("Opção ->");
                        sair = Integer.parseInt(index_pocao.nextLine());
                        System.out.println("****************************************************************************************");
                        running = false;
                    }catch (Exception e){
                        System.out.println("Escolha uma opcão valida");
                    }
                }
                if (sair == 2) {
                    run = false;

                    System.out.println("****************************************************************************************");
                    System.out.println("    Saiu");
                    System.out.println("****************************************************************************************");

                }
            }catch (Exception e){
                System.out.println("Escolha uma opcão valida");
            }
        }


    }

    /**
     * Funcao abstrata
     * @param npc
     * @return
     */
    public abstract boolean atacar(NPC npc);

    public void setOuro(int ouro) {
        this.ouro = ouro;
    }

    /**
     * Funcao que imprime o inventario de consumiveis e o index na lista
     */
    public void getConsumivelCombate() {

        for(Consumivel  consumivelAtual : inventarioConsumiveis)

        {
            if (consumivelAtual  instanceof ConsumivelCombate){
            System.out.println(Cores.BG_GREEN);
            System.out.println("*****************************************************************************************************************************************");
            System.out.println("----------------Item nº : " + inventarioConsumiveis.indexOf(consumivelAtual)+"------------------");
            ((ConsumivelCombate) consumivelAtual).mostrarDetalhesAtaque();
            System.out.println("***************************************************************************************************************************************");

            System.out.println(Cores.RESET);
        }}

    }

    /**
     * Funcao que conta o numero de itens de combate
     * @return o numero inteiro
     */
    public int countConsumivelCombate(){
       int count =0;
        for(Consumivel consumivelAtual : inventarioConsumiveis){

            if(consumivelAtual instanceof  ConsumivelCombate) {
                count++;
            }
        }

      return count;
    }

    /**
     * Funcao que imprime o status do heroi
     */
    public void status(){

        System.out.println("********************************** STATUS *************************************************");
        System.out.println("Nome : "+this.getNome());
        System.out.println("Nivel : "+this.nivel);
        System.out.println("Ouro : " +this.ouro);
        System.out.println("Arma Principal : "+this.armaPrincipal.getNome());
        System.out.println("Forca : "+this.getForca());
        System.out.println("Vida atual : "+this.getVidaAtual_hp());
        System.out.println("*********************************************************************************************");

    }






}
