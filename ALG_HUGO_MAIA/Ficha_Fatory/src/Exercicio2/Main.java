package Exercicio2;

public class Main {
    public static void main(String[] args) {

       Taco tacoCarne = Tacofactory.createTaco("vaca");
        Taco tacoFrango = Tacofactory.createTaco("frango");


        tacoCarne.prepare();
        tacoCarne.bake();
        tacoCarne.prepare();



    }


}
