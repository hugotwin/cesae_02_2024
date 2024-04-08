package Exerc_1;

public class Pessoa {


    private String nome;
    private int idade;
    private double altura;

    /**Metodo construtor de pessoas
     * @param nome civil
     * @param idade em anos
     * @param altura (m.)
     */
    public Pessoa(String nome, int idade, double altura )
    {

        this.nome= nome;
        this.idade= idade;
        this.altura = altura;


    }

    public String getNome() {
        return nome;
    }

    public double getAltura() {
        return altura;
    }

    public int getIdade() {
        return idade;
    }
}
