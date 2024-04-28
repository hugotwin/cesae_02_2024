package ItemHeroi;

import java.util.ArrayList;

/**
 * Class do Item heroi que sera iten da classe heroi
 */
public class ItemHeroi {
    private String nome;
    private int preco_moedas_ouro;
    protected ArrayList<String> heroisPermitidos; //que irá guardar o tipo de heróis que podem/sabem usar dito

    /**
     * Construtor da classe ItemHeroi que recebe uma lista de herois
     * @param nome
     * @param preco_moedas_ouro
     * @param ListaHeroispermitidos
     */
    public ItemHeroi(String nome, int preco_moedas_ouro, String[] ListaHeroispermitidos) {
        this.nome = nome;
        this.preco_moedas_ouro = preco_moedas_ouro;
        this.heroisPermitidos = new <String>ArrayList() ;
        for(String nomeAtual :ListaHeroispermitidos){  this.heroisPermitidos.add(nomeAtual);}
    }

    /**
     * Construtor da classe abstrata Item Heroi
     * @param nome nome do intem
     * @param preco_moedas_ouro po custo do item
     */

    public ItemHeroi(String nome, int preco_moedas_ouro,String heroiPermitido) {
        this.nome = nome;
        this.preco_moedas_ouro = preco_moedas_ouro;
        this.heroisPermitidos = new <String>ArrayList() ;
        this.heroisPermitidos.add(heroiPermitido);
    }


    /**
     * Funcao que mostra os detalhes do item do heroi
     */
    public void mostrarDetalhes(){
        System.out.println("*************************************************************************");

        System.out.println("Nome : " + this.nome);
        System.out.println("Preco : "+this.preco_moedas_ouro);

    for(String heroi : heroisPermitidos ){

        System.out.println("Herois permitido : "+heroi);
    }
        System.out.println("---------------------------------------------------------------");
}

    public int getPreco_moedas_ouro() {
        return this.preco_moedas_ouro;
    }

    public String getNome() {
        return nome;
    }


    public ArrayList<String> getHeroisPermitidos() {
        return heroisPermitidos;
    }
}
