package Exercicio2;

public class TacoVaca extends Taco {


    @Override
    public void prepare() {

        System.out.println("A preparar taco");

    }

    @Override
    public void bake() {

        System.out.println("A cozinhar taco");

    }

    @Override
    public void box() {

        System.out.println("A embalar taco");

    }
}
