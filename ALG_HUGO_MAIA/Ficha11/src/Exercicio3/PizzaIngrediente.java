package Exercicio3;

import Exercicio3.Ingredientes.Ingrediente;

public class PizzaIngrediente {

    private Ingrediente ingrediente;

    private double quantidade;

    public PizzaIngrediente(Ingrediente ingrediente, int quantidade) {
        this.ingrediente = ingrediente;
        this.quantidade = quantidade;
    }

    public Ingrediente getIngrediente() {
        return ingrediente;
    }

    public double getQuantidade() {
        return quantidade;
    }


    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }
}
