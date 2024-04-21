package ItemHeroi;

public class ConsumivelCombate extends Consumivel{

    private int ataqueInstantaneo;

    /**
     * Contrutor da classe consumivel que herda de consumivel
     *
     * @param nome              nome do intem
     * @param preco_moedas_ouro po custo do item
     */
    public ConsumivelCombate(String nome, int preco_moedas_ouro, int ataqueInstantaneo) {
        super(nome, preco_moedas_ouro);

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
}
