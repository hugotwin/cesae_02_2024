package Exercicio3;

public class Marisco {

    private String especie;
    private double peso;
    private double  preco_kg;

    public Marisco(String especie, double peso, double preco_kg) {
        this.especie = especie;
        this.peso = peso;
        this.preco_kg = preco_kg;
    }

    public String getEspecie() {
        return especie;
    }

    public double getPeso() {
        return peso;
    }

    public double getPreco_kg() {
        return preco_kg;
    }
}
