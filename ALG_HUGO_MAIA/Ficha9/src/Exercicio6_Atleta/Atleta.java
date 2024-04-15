package Exercicio6_Atleta;

public class Atleta {

    private String nome;
    private String modalidade;
    private double altura;
    private double peso;
    private String pais_origem;

    /**
     * Construtor de atleta
     * @param nome
     * @param modalidade
     * @param altura
     * @param peso
     * @param pais_origem
     */
    public Atleta(String nome, String modalidade, double altura, double peso, String pais_origem) {
        this.nome = nome;
        this.modalidade = modalidade;
        this.altura = altura;
        this.peso = peso;
        this.pais_origem = pais_origem;
    }

    public String getNome() {
        return nome;
    }

    public String getModalidade() {
        return modalidade;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public String getPais_origem() {
        return pais_origem;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setPais_origem(String pais_origem) {
        this.pais_origem = pais_origem;
    }
}
