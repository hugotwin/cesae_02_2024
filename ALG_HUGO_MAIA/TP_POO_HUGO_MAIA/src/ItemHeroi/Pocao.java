package ItemHeroi;

/**
 * Classe pocao que sera um item do heroi
 */
public class Pocao extends Consumivel{

    private  int vida_curar;
    private int aumento_forca;


    /**
     * Contrutor da classe abstrata Item Heroi
     *
     * @param nome              nome do intem
     * @param preco_moedas_ouro po custo do item
     */

    public Pocao(String nome, int preco_moedas_ouro, String[] array, int vida_curar, int aumento_força) {
        super(nome, preco_moedas_ouro, array);
        this.vida_curar = vida_curar;
        this.aumento_forca = aumento_força;
    }


    /**
     * Funcao que mostra os detalhes da pocao
     */
    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("Capacidade de curar : " + this.vida_curar);
        System.out.println("Capacidade de aumento de força : " + this.aumento_forca);
        System.out.println("___________________________________________________________");

    }

    public int getAumento_forca() {
        return aumento_forca;
    }

    public int getVida_curar() {
        return vida_curar;
    }
}
