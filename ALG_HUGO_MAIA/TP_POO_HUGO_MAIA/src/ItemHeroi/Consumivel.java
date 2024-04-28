package ItemHeroi;

/**
 * Claase bastrata que extebde Item Heroi e por sua vez sera mae de Pocao e consumivel de combate
 */
public abstract class Consumivel extends ItemHeroi{

    /**
     * Construtor que permite a entrada de 3 parametros um deles uma lista
     * @param nome
     * @param preco_moedas_ouro
     * @param ListaHeroispermitidos
     */
    public Consumivel(String nome, int preco_moedas_ouro, String[] ListaHeroispermitidos) {
        super(nome, preco_moedas_ouro, ListaHeroispermitidos);
    }

    /**
     * Construtor que permite a  entrda de 3 parametros mas so permite um heroi
     * @param nome
     * @param preco_moedas_ouro
     * @param heroiPermitido
     */
    public Consumivel(String nome, int preco_moedas_ouro, String heroiPermitido) {
        super(nome, preco_moedas_ouro, heroiPermitido);
    }





}
