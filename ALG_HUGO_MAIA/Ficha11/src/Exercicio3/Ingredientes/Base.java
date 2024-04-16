package Exercicio3.Ingredientes;

import Exercicio3.Enum.TipoMassa;
import Exercicio3.Enum.UnidadeMedida;

public class Base extends Ingrediente {

    private TipoMassa tipoMassa;
    private String descricao;


    public Base(int codigo, String nome, UnidadeMedida unidade_medida, Double numero_calorias_unidade_medida, TipoMassa tipoMassa) {
        super(codigo, nome, unidade_medida, numero_calorias_unidade_medida);

        this.tipoMassa= tipoMassa;
    }


}
