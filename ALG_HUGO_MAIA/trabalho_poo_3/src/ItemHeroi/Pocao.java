package ItemHeroi;

public class Pocao extends Consumivel{

    private  int vida_curar;
    private int aumento_força;


    /**
     * Contrutor da classe abstrata Item Heroi
     *
     * @param nome              nome do intem
     * @param preco_moedas_ouro po custo do item
     */
    public Pocao(String nome, int preco_moedas_ouro, int vida_curar, int aumento_força) {
        super(nome, preco_moedas_ouro);
        this.vida_curar= vida_curar;
        this.aumento_força=aumento_força;
    }

    /**
     * Funcao que mostra os detalhes da pocao
     */
    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("Capacidade de curar : " + this.vida_curar);
        System.out.println("Capacidade de aumento de força : " + this.aumento_força);
        System.out.println("___________________________________________________________");

    }

    public int getAumento_força() {
        return aumento_força;
    }

    public int getVida_curar() {
        return vida_curar;
    }
}
