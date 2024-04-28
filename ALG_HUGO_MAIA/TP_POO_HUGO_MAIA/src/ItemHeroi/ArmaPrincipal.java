package ItemHeroi;

/**
 * Classe principal que herda de item de Heroi
 */
public class ArmaPrincipal extends ItemHeroi {
    private int ataque;
    private int ataqueEspecial;


    /**
     * Contrutor da classe Arma que herda da classse item heroi
     *
     * @param nome              nome do intem
     * @param preco_moedas_ouro po custo do item
     */

    public ArmaPrincipal(String nome, int preco_moedas_ouro, String[] ListaHeroispermitidos, int ataque, int ataqueEspecial) {
        super(nome, preco_moedas_ouro, ListaHeroispermitidos);
        this.ataque = ataque;
        this.ataqueEspecial = ataqueEspecial;
    }


    /**
     * Construtor da Arma principal
     * @param nome
     * @param preco_moedas_ouro
     * @param heroiPermitido
     * @param ataque
     * @param ataqueEspecial
     */
    public ArmaPrincipal(String nome, int preco_moedas_ouro, String heroiPermitido, int ataque, int ataqueEspecial) {
        super(nome, preco_moedas_ouro, heroiPermitido);
        this.ataque = ataque;
        this.ataqueEspecial = ataqueEspecial;
    }

    /**
     * Funcao que mostra os detalhes do Item heroi
     */
    @Override
    public void mostrarDetalhes() {

        super.mostrarDetalhes();
        System.out.println("Ataque " + this.ataque);
        System.out.println("Ataque Especial" + this.ataqueEspecial);

    }


    public int getAtaque() {
        return ataque;
    }

    public int getAtaqueEspecial() {
        return ataqueEspecial;
    }


    public void mostrarDetalhesAtaque() {
        System.out.println("Nome : "+this.getNome());
        System.out.println("Ataque  : "+ this.ataque);
        System.out.println("Ataque Especial  : "+ this.ataqueEspecial);


    }
}
