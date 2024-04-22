package ItemHeroi;

import java.util.ArrayList;

public class ItemHeroi {
    private String nome;
    private int preco_moedas_ouro;
    private ArrayList<String> heroisPermitidos; //que irá guardar o tipo de heróis que podem/sabem usar dito

    /**
     * Contrutor da classe abstrata Item Heroi
     * @param nome nome do intem
     * @param preco_moedas_ouro po custo do item
     */
    public ItemHeroi(String nome, int preco_moedas_ouro) { //IMPORTANTE FALTA DEFINIR O TIPO DE HEROIS
        this.nome = nome;
        this.preco_moedas_ouro = preco_moedas_ouro;
        this.heroisPermitidos = new <String>ArrayList();

    }

    /**
     * Funcao que mostra os detalhes do item do heroi
     */
    public void mostrarDetalhes(){
    System.out.println("----------------------------");
    System.out.println("Nome : " + this.nome);
    System.out.println("Preco : "+this.preco_moedas_ouro);
    for(String heroi : heroisPermitidos ){

        System.out.println("Herois permitido : "+heroi);
    }
}

    public int getPreco_moedas_ouro() {
        return this.preco_moedas_ouro;
    }

    public String getNome() {
        return nome;
    }
}
