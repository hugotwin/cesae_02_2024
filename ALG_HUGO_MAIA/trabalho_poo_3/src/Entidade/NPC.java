package Entidade;

public class NPC extends Entidade {

    private  int ouro;

    /**
     * Construtor da classe NPC
     * @param VALOR_INICIAL_VIDA em inteiro
     * @param nome da personagem
     * @param forca
     * @param ouro
     */
    public NPC(int VALOR_INICIAL_VIDA, String nome, int forca, int ouro) {
        super(VALOR_INICIAL_VIDA, nome, forca);
        this.ouro=ouro;

    }

    public int getOuro() {
        return ouro;
    }

    public void setOuro(int ouro) {
        this.ouro = ouro;
    }
}