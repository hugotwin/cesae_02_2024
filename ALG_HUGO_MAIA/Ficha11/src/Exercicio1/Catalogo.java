package Exercicio1;

import java.util.ArrayList;

public class Catalogo {

    private ArrayList<Aviao> lista_aviao;

    public Catalogo() {

        this.lista_aviao= new ArrayList<Aviao>();

    }


    public void addAviao(Aviao aviao)
    {
        this.lista_aviao.add(aviao);
    }

    public void vendeAviao(Aviao aviao)
    {

        if (this.lista_aviao.contains(aviao)){
        this.lista_aviao.remove(aviao);}
        System.out.println("Aviao vendido");
    }



    public void mostrarLista()
    {
        for (Aviao aviao:this.lista_aviao)
        {
            if (aviao instanceof JatoParticular){
                System.out.println(aviao.getModelo());
                System.out.println(aviao.getModelo());
                System.out.println(((JatoParticular) aviao).getCategoria());
                ((JatoParticular) aviao).getInstalacoes();


            }else{

                System.out.println(aviao.getModelo());
                System.out.println(aviao.getAno_fabrico());
                System.out.println(aviao.getModelo());
                ((AviaoCombate) aviao).listaArmas();


            }

        }

    }


}
