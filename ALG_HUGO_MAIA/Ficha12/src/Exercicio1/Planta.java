package Exercicio1;

import Exercicio1.Enum.TipoFamilia;

public class Planta extends SerVivo{

    private TipoFamilia familia;
    private  int  grau_defesa;


    public Planta(String nome, String especie, String pais_origem, int idade, TipoFamilia familia, int grau_defesa) {
        super(nome, especie, pais_origem, idade);

        this.familia=familia;
        this.inserirdefesa(grau_defesa);




    }
    public void inserirdefesa(int grau_defesa)
    {
        if(grau_defesa<0 || grau_defesa>6)
        {
            System.out.println("valor invalido");
        }else{

            this.grau_defesa=grau_defesa;

        }


    }

    public TipoFamilia getFamilia() {
        return familia;
    }

    public int getGrau_defesa() {
        return grau_defesa;
    }
}
