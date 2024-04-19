package Exercicio2;

public class Main {
    public static void main(String[] args) {


        Camiao camiao = new Camiao("opel","camiao",1987, 1300 , 5000, 20,TipoCombustivel.DIESEL, 300);
        camiao.exibirDados();
        System.out.println(camiao.calcularConsumo());
        System.out.println(camiao.viagem(500, 100));

    }






}
