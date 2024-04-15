package Exercicio4_imovel;

public class Main {

    public static void main(String[] args) {

        Imovel imovel1= new Imovel("espinho",610, "espinho", TipoCasa.casa, TipoAcamento.usada,120,5,2,0);
        Imovel imovel2= new Imovel("porto",610, "porto", TipoCasa.apartamento, TipoAcamento.usada,120,5,2,0);

        //movel1.exibirDetalhes();


        for(Imovel  movel : imovel1.comparaPreco(imovel2))
        {

            movel.exibirDetalhes();
            System.out.println("---------");

        }




    }


}
