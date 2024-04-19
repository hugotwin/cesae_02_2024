package Exercicio2;

public class Camiao extends Veiculo{

    private double capacidadeCarga;

    public Camiao(String marca, String modelo, int ano_fabrico, int potencia, int cilindrada, double litros100Km, TipoCombustivel tipoCombustivel,double capacidadeCarga) {
        super(marca, modelo, ano_fabrico, potencia, cilindrada, litros100Km, tipoCombustivel);

        this.capacidadeCarga=capacidadeCarga;
    }



    public String viagem(double distancia_km, double carga_km)
    {  double consumo = super.calcularConsumo();
        double custo =0;
        if(carga_km>this.capacidadeCarga)
        {
            return "viagem não aceite";
        }

        custo = (super.calcularConsumo()*distancia_km*2.10+(0.1*carga_km/100))/100;

        return "consumo ao 100 : "+consumo+"\n custo da viagem : "+custo+"";

        }


    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println();
    }



}
