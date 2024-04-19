package Exercicio3.Ingredientes;

import Exercicio3.Enum.Origem;
import Exercicio3.Enum.TipoFrutosMar;
import Exercicio3.Enum.UnidadeMedida;

public class FrutosMar extends Topping {

    private TipoFrutosMar tipo;


    public FrutosMar(int codigo, String nome, UnidadeMedida unidade_medida, Double numero_calorias_unidade_medida, Origem origem, TipoFrutosMar tipo) {
        super(codigo, nome, unidade_medida, numero_calorias_unidade_medida, origem);

        this.tipo=tipo;
    }
}
