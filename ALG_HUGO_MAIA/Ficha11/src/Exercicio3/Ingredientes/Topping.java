package Exercicio3.Ingredientes;

import Exercicio3.Enum.Origem;
import Exercicio3.Enum.UnidadeMedida;

public class Topping extends Ingrediente{

    private Origem origem;


    public Topping(int codigo, String nome, UnidadeMedida unidade_medida, Double numero_calorias_unidade_medida, Origem origem) {
        super(codigo, nome, unidade_medida, numero_calorias_unidade_medida);
    }
}
