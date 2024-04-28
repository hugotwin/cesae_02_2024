package Salas;

import Entidade.*;
import Outros.Cores;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Classe caminho do labirinto cria um caminho especifico no labirinto
 */
public class Caminho {

    private String nomeCaminho;
    private String nomeSala1;
    private String nomeSala2;
    private String nomeSala3;


    private int  numeroInimigos;

    private Heroi heroi;

    private ArrayList<Entidade> listaInimigos;

    private SalaTotem totem;

    private SalaItemEspecial itemEspecial;
    private Armadilha armadilha;


    /**
     * Cnstrutor da classe caminho
     * @param nomeCaminho
     * @param nomeSala1
     * @param nomeSala2
     * @param nomeSala3
     * @param numeroInimigos
     * @param heroi
     * @param listaInimigos
     */
    public Caminho(String nomeCaminho, String nomeSala1, String nomeSala2, String nomeSala3, int numeroInimigos, Heroi heroi, ArrayList<Entidade> listaInimigos) {
        this.nomeCaminho = nomeCaminho;
        this.nomeSala1 = nomeSala1;
        this.nomeSala2 = nomeSala2;
        this.nomeSala3 = nomeSala3;
        this.numeroInimigos = numeroInimigos;
        this.heroi = heroi;
        this.listaInimigos = listaInimigos;
        this.totem = new SalaTotem();
        this.armadilha = new Armadilha();
        this.itemEspecial=new SalaItemEspecial();

    }

    /**
     * Funcao que cria uma itercao entre o heroi e o caminnho
     * @return boolean
     */
    public boolean accao() {

        Random rand = new Random();
        boolean resultado = true;
        Scanner input = new Scanner(System.in);
        System.out.println(Cores.BG_YELLOW);
        System.out.println("****************************************************************************************");
        System.out.println("                     Você escolheu "+this.nomeCaminho);
        System.out.println("****************************************************************************************");
        System.out.println("****************************************************************************************");
        System.out.println("--------------------Você entrou na Sala 1 - "+this.nomeSala1+".-----------------------");
        System.out.println("****************************************************************************************\n");


        for (int n = 0; n < numeroInimigos; n++) { // cria um numero aletorio de inimigos e tambem um inimigo aleatorio

            NPC inimigo = (NPC) listaInimigos.get(rand.nextInt(0,5));
            resultado = heroi.atacar(inimigo);
            if (!resultado) {
                return false;
            }
            resultado = armadilha.totemAmaldicoado(heroi);
            if (!resultado) {
                return false;
            }
            itemEspecial.itemEspecial(heroi);
            if (!resultado){return false;}


        }

        System.out.println(Cores.BG_CYAN);
        System.out.println("****************************************************************************************");
        System.out.println("----------------Parabéns  consegiu sobreviver a sala "+this.nomeSala1+"--------------------");
        System.out.println("****************************************************************************************\n");


        //------------------------------------------------------------------
        boolean running = true;
        int escolha =0;

        while (running)
        {
            try {


                System.out.println(Cores.BG_GREEN);
                System.out.println("****************************************************************************************");
                System.out.println("O que você deseja fazer?");
                System.out.println("1. Avançar para a próxima sala.");
                System.out.println("2. Usar uma pocao.");
                System.out.println("3. Ver o inventário.");
                System.out.println("4. Ver o Status.");
                System.out.print("Opção ->");
                escolha = Integer.parseInt(input.nextLine());
                System.out.println("****************************************************************************************\n");
            }catch (Exception e){
                System.out.println(Cores.BG_RED);
                System.out.println("");
            }


            switch (escolha) {
                case 1:
                    System.out.println("****************************************************************************************");
                    System.out.println("Você escolheu avançar para a próxima sala.");
                    System.out.println("****************************************************************************************\n");
                    running = false;
                    break;
                case 2:
                    heroi.usarPocao();
                    break;
                case 3:
                    if(heroi.getInventarioConsumiveis().isEmpty()){
                        System.out.println("****************************************************************************************");
                        System.out.println("A lista de consumiveis esta vazia");
                        System.out.println("****************************************************************************************\n");
                    }else{heroi.getInventarioConsumiveis_(); }
                    break;
                case 4:
                    heroi.status();
                    break;
                default:
                    System.out.println("****************************************************************************************");
                    System.out.println("Opção inválida. Por favor, escolha  uma das opções .");
                    System.out.println("****************************************************************************************\n");
            }
        }

        System.out.println(Cores.BG_GREEN);
        System.out.println("****************************************************************************************");
        System.out.println("----------------Você avançou para a Sala 2 - "+this.nomeSala2+"--------------------");
        System.out.println("****************************************************************************************\n");

        for (int n = 0; n < numeroInimigos; n++) { // cria um numero aletorio de inimigos e tambem um inimigo aleatorio

            NPC inimigo = (NPC) listaInimigos.get(rand.nextInt(0,5));
            itemEspecial.itemEspecial(heroi);
            if (!resultado) {
                return false;
            }
            resultado = heroi.atacar(inimigo);
            if (!resultado) {
                return false;
            }
            resultado = totem.totemAmaldicoado(heroi);
            if (!resultado){return false;}

            itemEspecial.itemEspecial(heroi);
            if (!resultado) {
                return false;
            }



        }
        System.out.println(Cores.BG_CYAN);
        System.out.println("****************************************************************************************");
        System.out.println("----------------Parabésns  consegiu sobreviver a sala "+this.nomeSala2+"--------------------");
        System.out.println("****************************************************************************************\n");


        running = true;


        while (running) {

            try {
                System.out.println(Cores.BG_GREEN);
                System.out.println("****************************************************************************************");
                System.out.println("O que você deseja fazer?");
                System.out.println("1. Avançar para a próxima sala.");
                System.out.println("2. Usar uma pocao.");
                System.out.println("3. Ver o inventário.");
                System.out.println("4. Ver o Status.");
                System.out.print("Opção ->");
                escolha = Integer.parseInt(input.nextLine());
                System.out.println("****************************************************************************************\n");
            }catch (Exception e){

            }

            switch (escolha) {
                case 1:

                    System.out.println("****************************************************************************************");
                    System.out.println("Você escolheu avançar para a próxima sala.");
                    System.out.println("****************************************************************************************\n");
                    running = false;
                    break;
                case 2:
                    heroi.usarPocao();
                    break;
                case 3:
                    if(heroi.getInventarioConsumiveis().isEmpty()){
                        System.out.println("****************************************************************************************");
                        System.out.println("A lista de consumiveis esta vazia");
                        System.out.println("****************************************************************************************\n");
                    }else{heroi.getInventarioConsumiveis_(); }
                    break;
                case 4:
                    heroi.status();
                    break;
                default:
                    System.out.println("****************************************************************************************");
                    System.out.println("Opção inválida. Por favor, escolha 1 ou 2.");
                    System.out.println("****************************************************************************************\n");
            }
        }


        System.out.println("         Você chegou à Sala 3 - "+this.nomeSala3+".");

        resultado = armadilha.totemAmaldicoado(heroi);
        if (!resultado) {
            return false;}

        for (int n = 0; n < numeroInimigos; n++) { // cria um numero aletorio de inimigos e tambem um inimigo aleatorio

            NPC inimigo = (NPC) listaInimigos.get(rand.nextInt(0,5));
            itemEspecial.itemEspecial(heroi);
            if (!resultado) {
                return false;
            }
            resultado = heroi.atacar(inimigo);
            if (!resultado){return false;}


        }



        System.out.println(Cores.BG_CYAN);
        System.out.println("****************************************************************************************");
        System.out.println("----------------Parabésns  consegiu sobreviver a sala "+this.nomeSala3+"--------------------");
        System.out.println("****************************************************************************************\n");

        return resultado;
    }


    public String getNomeCaminho() {
        return nomeCaminho;
    }


}
