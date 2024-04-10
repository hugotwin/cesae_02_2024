package produto;

public class Main {

    public static void main(String[] args) {

        Produto bola = new Produto("bola", 5,100 );

        System.out.println(bola.getStock());

        bola.verificarStock(45);



        System.out.println(bola.venda(45));
        System.out.println(bola.getStock());



    }
}
