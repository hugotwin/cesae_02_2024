package Entidade;

import ItemHeroi.*;
import Outros.Cores;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/**
 * Classe Vendedor para interafir a classe heroi com o ItemHeroi
 */

public class Vendedor {


    private ArrayList<ItemHeroi> listaItemHeroi;

    /**
     * Construtor da classe vendedor
     */
    public Vendedor() {
        this.listaItemHeroi = new ArrayList<ItemHeroi>();
    }

    /**
     * Funcao que imprime os itens da loja aletoriamente
     */
    public void imprimirloja() {

        ArrayList<Integer> numerosSaidos = new ArrayList<Integer>();
        Random rand = new Random();
        if (listaItemHeroi.isEmpty()) {
            System.out.println(Cores.BG_YELLOW);
            System.out.println("Lista vazia");
            System.out.println(Cores.RESET);
            return;
        }

        int n = 0;

        while (n < 10) {
            int valor = rand.nextInt(listaItemHeroi.size());
            if (!numerosSaidos.contains(valor))// evita aparecer os mesmos itens
            {
                numerosSaidos.add(valor);
                n++;
            }}

            Collections.sort(numerosSaidos);


            for(Integer integer :numerosSaidos)
            {

                System.out.println(Cores.BG_GREEN);
                System.out.println("*********************************************************************************");
                System.out.println("-----------Item nª :" + integer+"-----------------");
                listaItemHeroi.get(integer).mostrarDetalhes();
                System.out.println(Cores.RESET);


            }


    }

    public void addItemHeroi(ItemHeroi itemHeroi) {

        listaItemHeroi.add(itemHeroi);

    }


    /**
     * Funca para efectuar a venda dos intemHeroi
     * @param heroi
     */
    public void vender(Heroi heroi) { // vender item recebe po heroi como parametro e escolha

        Scanner input = new Scanner(System.in);

        this.imprimirloja();
        System.out.println(Cores.BG_YELLOW);
        boolean run = true;
        int index_arma =0;
        while(run) {
            try {
                System.out.println("***************************************************************************************");
                System.out.print(" Escolha um item  da loja , indique o numero do item ---> ");
                index_arma = Integer.parseInt(input.nextLine());
                System.out.println("****************************************************************************************\n");
                run= false;

            } catch (Exception e ){
                System.out.println(" Escolha um dos itens ");
            }
        }
        boolean validacao = false;

        for(String heroiatual : this.listaItemHeroi.get(index_arma).getHeroisPermitidos()){

            if(heroi.getNome().equals(heroiatual)){ validacao = true; }

        }
        if (validacao){

        if (heroi.getOuro() >= this.listaItemHeroi.get(index_arma).getPreco_moedas_ouro() && listaItemHeroi.get(index_arma) instanceof ArmaPrincipal) {// verifica se o heroi tem ouro

            // verifica se a arma principal

            heroi.setArmaPrincipal((ArmaPrincipal) listaItemHeroi.get(index_arma));//  faz o casting e substituir a arma principal

            heroi.diminuirOuro(listaItemHeroi.get(index_arma).getPreco_moedas_ouro());// reduz a quantidade de ouro no heroi
            this.listaItemHeroi.remove(index_arma);// retira a arama da lista do vendedor
            System.out.println("****************************************************************************************");
            System.out.println("Obrigado pela compra do item : "+listaItemHeroi.get(index_arma).getNome());
            System.out.println("****************************************************************************************\n");


        } else if (heroi.getOuro() >= this.listaItemHeroi.get(index_arma).getPreco_moedas_ouro()) {

            heroi.adicionarItem((Consumivel) listaItemHeroi.get(index_arma));//depois verificar o casting
            heroi.diminuirOuro(listaItemHeroi.get(index_arma).getPreco_moedas_ouro());

            System.out.println("****************************************************************************************");
            System.out.println("Obrigado pela compra do item : "+listaItemHeroi.get(index_arma).getNome());
            System.out.println("****************************************************************************************\n");
            this.listaItemHeroi.remove(index_arma);
        } else {
            System.out.println(Cores.BG_RED);
            System.out.println("****************************************************************************************");
            System.out.println(" Não tem ouro para fazer a compra "+ Cores.semDinheiro);
            System.out.println("****************************************************************************************\n");

        }

        }else{
            System.out.println(Cores.BG_YELLOW);
            System.out.println("****************************************************************************************");
            System.out.println("Não pode comprar este item por favor escolha outro");
            System.out.println("****************************************************************************************\n");
    }
    }


}
