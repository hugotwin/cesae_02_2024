package Exercicio2;

public class Veiculo {

   private String  marca;
   private String modelo;
   private int ano_fabrico;
   private int potencia;
   private int cilindrada;

   private TipoCombustivel tipoCombustivel;
   private double litros100Km;


    public Veiculo(String marca, String modelo, int ano_fabrico, int potencia, int cilindrada, double litros100Km,TipoCombustivel tipoCombustivel) {
        marca = marca;
        modelo = modelo;
        this.ano_fabrico = ano_fabrico;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.litros100Km = litros100Km;
        this.tipoCombustivel = tipoCombustivel;
    }


    public void ligar(){

        System.out.println("");

    }

    public void corrida()
    {


    }

    public double calcularConsumo()
    {
        return this.litros100Km;

    }

    public TipoCombustivel getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void exibirDados()
    {
        System.out.println(this.modelo);
        System.out.println(this.marca);
        System.out.println(this.ano_fabrico);
        System.out.println(this.cilindrada);
        System.out.println(this.tipoCombustivel);


    }



}
