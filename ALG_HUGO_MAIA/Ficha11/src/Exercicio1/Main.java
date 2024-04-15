package Exercicio1;

public class Main {


    public static void main(String[] args) {

        JatoParticular jato = new JatoParticular("jhklf5654","747",1999,500000,300, 500,100,4,1000,900,3500,Categoria.HEAVY_JET);

        jato.adicionarInstalacao(Instalacoes.CHUVEIRO);
        jato.getInstalacoes();


    }
}
