package ItemHeroi;

public class ArmaPrincipal extends ItemHeroi{
    private int ataque;
    private int ataqueEspecial;


    /**
     * Contrutor da classe Arma que herda da classse item heroi
     *
     * @param nome              nome do intem
     * @param preco_moedas_ouro po custo do item
     */
    public ArmaPrincipal(String nome, int preco_moedas_ouro, int ataque, int ataqueEspecial) {
        super(nome, preco_moedas_ouro);
        this.ataque=ataque;
        this.ataqueEspecial=ataqueEspecial;

    }

    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("Atauqe "+ this.ataque);
        System.out.println("Ataque Especial" + this.ataque);
        System.out.println("--------------------------------");
    }
}
