import ItemHeroi.ItemHeroi;

import java.util.ArrayList;
import java.util.Random;

public class Vendedor {


   private ArrayList<ItemHeroi> listaItemHeroi;

    /**
     * Construtor da classe vendedor
     */
    public Vendedor() {
        this.listaItemHeroi=new ArrayList<ItemHeroi>();
    }


    public void imprimirloja(){

        ArrayList<Integer> numerosSaidos= new ArrayList<Integer>();
        Random rand = new Random();
        if(listaItemHeroi.isEmpty()){
            System.out.println("Lista vazia");
            return;
        }
        int n=0;
        while(n<10){
        int valor = rand.nextInt(listaItemHeroi.size());
        if(!numerosSaidos.contains(valor))// evita aparecer os mesmos itens
        {
            listaItemHeroi.get(valor).mostrarDetalhes();
            numerosSaidos.add(valor);
            n++;
        }
        }



    }

}
