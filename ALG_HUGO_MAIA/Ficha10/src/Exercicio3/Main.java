package Exercicio3;

public class Main {

    public static void main(String[] args) {


        Peixe peixe1 = new Peixe("albatroz", 50, 50);
        Marisco marisco2 = new Marisco("carangueijo", 10, 50);


        BarcoPesca barco = new BarcoPesca("hbarco", "branco", "1985", 10, 300, Marca_.Devlin);

        System.out.println(barco.pescarMarisco(marisco2));
        System.out.println(barco.pescarPeixe(peixe1));
        System.out.println(barco.valorTotal());
        System.out.println(barco.salarioTripulacao());



    }
}
