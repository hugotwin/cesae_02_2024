package Exercicio3;

import java.util.ArrayList;

public class BarcoPesca {


    private String nome, cor, anoFabrico;
    private  int tripulacao;
    private  double capacidadeCarga_Kg;
    private Marca_  marca;
    private ArrayList<Peixe> peixePescado ;
    private ArrayList<Marisco> mariscoPescado;

    public BarcoPesca(String nome, String cor, String anoFabrico, int tripulacao, double capacidadeCarga_Kg, Marca_ marca) {
        this.nome = nome;
        this.cor = cor;
        this.anoFabrico = anoFabrico;
        this.tripulacao = tripulacao;
        this.capacidadeCarga_Kg = capacidadeCarga_Kg;
        this.marca = marca;
        this.peixePescado = new ArrayList<Peixe>();
        this.mariscoPescado = new ArrayList<Marisco>();
    }

    public String pescarPeixe(Peixe peixe)
    {
        double load = 0;

        if(this.peixePescado!=null){
        for(Peixe peixe_list : peixePescado )
        {
            load+=peixe_list.getPeso();

        }}

        if(this.mariscoPescado!=null){
            for(Marisco marisco_list : mariscoPescado )
            {
                load+=marisco_list.getPeso();

            }}

        load+=peixe.getPeso();


        if(load<this.capacidadeCarga_Kg){

            peixePescado.add(peixe);

           ;

        }else{

            return "A capacidade de carga está  no maximo";

        }

        return "the load is "+this.capacidadeCarga_Kg;
    }




    public String pescarMarisco(Marisco marisco)
    {
        double load = 0;

        if(this.peixePescado!=null){
            for(Peixe peixe_list : peixePescado )
            {
                load+=peixe_list.getPeso();

            }}

        if(this.mariscoPescado!=null){
            for(Marisco marisco_list : mariscoPescado )
            {
                load+=marisco_list.getPeso();

            }}


        load+=marisco.getPeso();

        if(load<=this.capacidadeCarga_Kg){

            mariscoPescado.add(marisco);

        }else{

            return "A capacidade de carga está  no maximo";

        }

        return "the load is "+this.capacidadeCarga_Kg;
    }


    /**
     * Funtion that returns the total value of fish
     * @return an integer with the values
     */
    public double valorTotal()
    {

        double valor = 0;

        if(this.peixePescado!=null){
            for(Peixe peixe_list : peixePescado)
            {
                valor+=peixe_list.getPeso()*peixe_list.getPreco_kg();

            }}

        if(this.mariscoPescado!=null){
            for(Marisco marisco_list : mariscoPescado )
            {
                valor+=marisco_list.getPeso()*marisco_list.getPreco_kg();

            }}

        return valor;


    }

    public String salarioTripulacao()
    {
        double valor = this.valorTotal();
        valor = valor*0.6;
        valor= valor/this.tripulacao;

        return "o ordenado de um tripulante "+valor;

    }






}
