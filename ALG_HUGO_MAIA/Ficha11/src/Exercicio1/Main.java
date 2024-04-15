package Exercicio1;

public class Main {


    public static void main(String[] args) {

        JatoParticular jato = new JatoParticular("jhklf5654","747",1999,500000,300, 500,100,4,1000,900,3500,Categoria.HEAVY_JET);
        AviaoCombate combate = new AviaoCombate("s88787","hdgfh", 1998, 500000,300, 500,100,4,1000,900,3500, "Portugal");
        jato.adicionarInstalacao(Instalacoes.CHUVEIRO);
        //jato.getInstalacoes();
        combate.addArmas(Armas.BOMBAS);
        combate.addArmas(Armas.FOGEUETES);
        combate.exibirDetalhes();



    }
}
