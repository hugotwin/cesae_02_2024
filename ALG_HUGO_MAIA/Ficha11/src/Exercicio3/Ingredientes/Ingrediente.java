package Exercicio3.Ingredientes;

import Exercicio3.Enum.UnidadeMedida;

public class Ingrediente {


    private int id;
    private String nome;


    private UnidadeMedida unidade_medida;

    private Double numero_calorias_unidade_medida;


    public Ingrediente(int codigo, String nome, UnidadeMedida unidade_medida, Double numero_calorias_unidade_medida) {
        this.id = codigo;
        this.nome = nome;
        this.unidade_medida = unidade_medida;
        this.numero_calorias_unidade_medida = numero_calorias_unidade_medida;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Double getNumero_calorias_unidade_medida() {
        return numero_calorias_unidade_medida;
    }

    public UnidadeMedida getUnidade_medida() {
        return unidade_medida;
    }
}
