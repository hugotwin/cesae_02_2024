package Exercicio3.Ingredientes;

import Exercicio3.Enum.Origem;
import Exercicio3.Enum.TipoVegetal;
import Exercicio3.Enum.UnidadeMedida;

public class Vegetal extends Topping{
    private TipoVegetal tipo;

    public Vegetal(int codigo, String nome, UnidadeMedida unidade_medida, Double numero_calorias_unidade_medida, Origem origem, TipoVegetal  tipo) {
        super(codigo, nome, unidade_medida, numero_calorias_unidade_medida, origem);

        this.tipo=tipo;
    }
}
