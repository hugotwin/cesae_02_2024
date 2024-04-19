package Exercicio3.Enum;

import Exercicio3.Ingredientes.Ingrediente;

public class Base extends Ingrediente {

private TipoMassa tipoMassa;


    public Base(int codigo, String nome, Double numero_calorias_unidade_medida, TipoMassa tipoMassa) {
        super(codigo, nome, UnidadeMedida.GRAMAS, numero_calorias_unidade_medida);
        this.tipoMassa=tipoMassa;

    }
}
