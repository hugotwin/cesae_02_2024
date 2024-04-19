package Exercicio2;

public class Carro extends Veiculo {


    private int quantidadePassageiros;

    public Carro(String marca, String modelo, int ano_fabrico, int potencia, int cilindrada, double litros100Km, TipoCombustivel tipoCombustivel) {
        super(marca, modelo, ano_fabrico, potencia, cilindrada, litros100Km, tipoCombustivel);
        this.quantidadePassageiros=quantidadePassageiros;
    }





    /**
     * Fumcao que apresenta o custo de uma viagem em euros
     * @param distancia_km
     * @return
     */
    public double calcularCusto(double distancia_km)

    {
        double custo=0;
        if(super.getTipoCombustivel().equals(TipoCombustivel.GASOLINA))
        {
            custo =distancia_km*2.10*super.calcularConsumo()/100;
        }
        if(super.getTipoCombustivel().equals(TipoCombustivel.DIESEL))
        {
            custo =distancia_km*1.95*super.calcularConsumo()/100;
        }
        if(super.getTipoCombustivel().equals(TipoCombustivel.GPL))
        {
            custo =distancia_km*1.15*super.calcularConsumo()/100;
        }
        if(super.getTipoCombustivel().equals(TipoCombustivel.ELETRICO))
        {
            custo =distancia_km*0.12*super.calcularConsumo()/100;
        }

        return custo;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println(this.quantidadePassageiros);


    }
}
