package Entidade;

public abstract class Entidade {


    private final int VALOR_INICIAL_VIDA;

    private int vidaMax_maxHp;
    private int vidaAtual_hp;
    private int forca;
    private String nome;


    /**
     * Contrutor da classe abstrata Entidade
     * @param VALOR_INICIAL_VIDA
     * @param nome
     * @param forca
     */
    public Entidade(int VALOR_INICIAL_VIDA, String nome, int forca) {// constante final
        this.VALOR_INICIAL_VIDA = VALOR_INICIAL_VIDA;
        this.nome = nome;
        this.vidaMax_maxHp = VALOR_INICIAL_VIDA;
        this.vidaAtual_hp = VALOR_INICIAL_VIDA;
        this.forca = forca;
    }

    /**
     * Funcao que mostra os detalhes
     */
    public void mostrarDetalhes() {

        System.out.println("---------------Detalhes---------------------");
        System.out.println("Nome : " + this.nome);
        System.out.println("Vida máxima : " + this.vidaMax_maxHp);
        System.out.println("Vida actual: " + this.vidaAtual_hp);
        System.out.println("Força " + this.forca);
        System.out.println("------------------------------------");

    }

    public void aumentoForca(int forca) {
        this.forca += forca;
    }

    public void aumentoVidaAtual_hp(int vidaAtual_hp) {
        this.vidaAtual_hp += vidaAtual_hp;
    }

    public int getVidaMax_maxHp() {
        return vidaMax_maxHp;
    }

    public int getVidaAtual_hp() {
        return vidaAtual_hp;
    }

    public int getForca() {
        return forca;
    }

    public void setVidaAtual_hp(int vidaAtual_hp) {
        this.vidaAtual_hp = vidaAtual_hp;
    }
}
