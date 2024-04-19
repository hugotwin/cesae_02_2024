package Exercicio1;

public abstract  class  SerVivo{


private String nome;
private String especie;
private String pais_origem;
private int idade;

    public SerVivo(String nome, String especie, String pais_origem, int idade) {
        this.nome = nome;
        this.especie = especie;
        this.pais_origem = pais_origem;
        this.idade = idade;
    }
}
