package Exercicio3.Ingredientes;

import Exercicio3.Enum.Origem;
import Exercicio3.Enum.TipoCarne;
import Exercicio3.Enum.UnidadeMedida;

public class Carne extends Topping{

    private TipoCarne tipo;


    public Carne(int codigo, String nome, UnidadeMedida unidade_medida, Double numero_calorias_unidade_medida, Origem origem, TipoCarne Tipo) {
        super(codigo, nome, unidade_medida, numero_calorias_unidade_medida, origem);
        this.tipo=tipo;

    }
}
