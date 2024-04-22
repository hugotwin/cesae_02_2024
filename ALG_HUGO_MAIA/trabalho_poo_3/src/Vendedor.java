import ItemHeroi.*;
import Entidade.*;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Vendedor {


    private ArrayList<ItemHeroi> listaItemHeroi;

    /**
     * Construtor da classe vendedor
     */
    public Vendedor() {
        this.listaItemHeroi = new ArrayList<ItemHeroi>();
    }

    /**
     * Funcao que imprimi os itens da loja aletoriamente
     */
    public void imprimirloja() {

        ArrayList<Integer> numerosSaidos = new ArrayList<Integer>();
        Random rand = new Random();
        if (listaItemHeroi.isEmpty()) {
            System.out.println("Lista vazia");
            return;
        }
        int n = 0;
        while (n < 10) {
            int valor = rand.nextInt(listaItemHeroi.size());
            if (!numerosSaidos.contains(valor))// evita aparecer os mesmos itens
            {
                System.out.println("*******************************************************************");
                System.out.println("Item nª :" + valor);
                listaItemHeroi.get(valor).mostrarDetalhes();
                numerosSaidos.add(valor);
                n++;
            }
        }

        System.out.println("Escolha o item pelo item numero :");


    }


    public void addItemHeroi(ItemHeroi itemHeroi) {

        listaItemHeroi.add(itemHeroi);

    }

    public void removeItemHeroi(ItemHeroi itemHeroi) {

        listaItemHeroi.remove(itemHeroi);
    }


    public void vender(Heroi heroi) { // vender item recebe po heroi como parametro e escolha

        Scanner input = new Scanner(System.in);

        this.imprimirloja();

        System.out.println("----------------");

        System.out.println("Escolha um item  da loja , indique o numero do item");
        int index_arma = input.nextInt();

        if (heroi.getOuro() >= this.listaItemHeroi.get(index_arma).getPreco_moedas_ouro() && listaItemHeroi.get(index_arma) instanceof ArmaPrincipal) {// verifica se o heroi tem ouro

            // verifica se a arma principal

            heroi.setArmaPrincipal((ArmaPrincipal) listaItemHeroi.get(index_arma));//  faz o casting e substituir a arma principal

            heroi.diminuirOuro(listaItemHeroi.get(index_arma).getPreco_moedas_ouro());// reduz a quantidade de ouro no heroi
            listaItemHeroi.remove(index_arma);// retira a arama da lista do vendedor
            System.out.println("Obrigado pela compra do item : "+listaItemHeroi.get(index_arma).getNome());

        } else if (heroi.getOuro() >= this.listaItemHeroi.get(index_arma).getPreco_moedas_ouro()) {

            heroi.adicionarItem((Consumivel) listaItemHeroi.get(index_arma));//depois verificar o casting
            heroi.diminuirOuro(listaItemHeroi.get(index_arma).getPreco_moedas_ouro());
            System.out.println("Obrigado pela compra do item : "+listaItemHeroi.get(index_arma).getNome());

        } else {
            System.out.println("Não tem ouro para fazer a compra");
        }


    }


}
