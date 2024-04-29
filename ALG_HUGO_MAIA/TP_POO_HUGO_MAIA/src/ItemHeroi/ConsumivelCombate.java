package ItemHeroi;

public class ConsumivelCombate extends Consumivel{

    private int ataqueInstantaneo;

    /**
     * construtor que recebe uma lista de herois permitidos
     * @param nome
     * @param preco_moedas_ouro
     * @param ListaHeroispermitidos
     * @param ataqueInstantaneo
     */
    public ConsumivelCombate(String nome, int preco_moedas_ouro, String[] ListaHeroispermitidos, int ataqueInstantaneo) {
        super(nome, preco_moedas_ouro, ListaHeroispermitidos);
        this.ataqueInstantaneo = ataqueInstantaneo;
    }

    /**
     * Construtor que recebe uma String de heroi permitido
     * @param nome
     * @param preco_moedas_ouro
     * @param heroiPermitido
     * @param ataqueInstantaneo
     */
    public ConsumivelCombate(String nome, int preco_moedas_ouro, String heroiPermitido, int ataqueInstantaneo) {
        super(nome, preco_moedas_ouro, heroiPermitido);
        this.ataqueInstantaneo = ataqueInstantaneo;
    }

    /**
     * Funcao que mostra os detalhes do ConsumivelCombate
     */
@Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
    System.out.println("Ataque instantaneo : "+ this.ataqueInstantaneo);

    }

    public int getAtaqueInstantaneo() {
        return ataqueInstantaneo;
    }

    /**
     * Funcao que apresenta os detalhes do consumivel
     */
    public void mostrarDetalhesAtaque() {
        System.out.println("Nome : "+this.getNome());
        System.out.println("Ataque instantaneo : "+ this.ataqueInstantaneo);

    }



}
