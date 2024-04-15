package Exercicio1;


import java.time.Year;
import java.util.Date;

public class Carro {

    private String marca;
    private int ano;
    private String modelo;

    private int potencia;
    private String tipoCombustivel;
    private double litros100KM;

    private TipoCombustivel combustivel;


    public Carro(String marca, String modelo, int ano, TipoCombustivel combustivel, int potencia, double consumo) {

        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.potencia = potencia;
        this.litros100KM = consumo;
        this.combustivel = combustivel;


    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getMarca() {
        return marca;
    }

    public int getAno() {
        return ano;
    }

    public String getModelo() {
        return modelo;
    }

    public int getPotencia() {
        return potencia;
    }

    public String ligar() {
        String som;
        //Year data = new dateTime();


        if ((Year.now().getValue() - this.ano) > 30) {

            if (this.combustivel.equals(TipoCombustivel.DIESEL)) {
                som = "Deita um pouco de fumo… Custa a pegar… O carro está ligado! \n Vrum-vrum-vru";
            } else {
                som = "Custa a pegar… O carro está ligado!” Vrum-vrum-vrum";
            }


        } else {

            if (this.potencia >= 250) {
                som = "Custa a pegar… O carro está ligado!”\n" +
                        "“Vrum-vrum-vrum";
            } else {

                som = "Custa a pegar… O carro está ligado!”\n" +
                        "“Vrum-vrum-vrum";
            }


        }
        return som;
    }




    public Carro[] corrida(Carro carro_adv) {


        if (this.potencia > carro_adv.getPotencia())
        {

            Carro [] resultado = {this};
            return resultado;

        }
        else if (this.potencia < carro_adv.getPotencia())
        {
            Carro [] resultado = {carro_adv};
            return resultado;

        }
        else if (this.potencia == carro_adv.getPotencia())
        {

            if ((Year.now().getValue() - this.ano) > (Year.now().getValue() - carro_adv.getAno()))
            {
                Carro [] resultado = {this};
                return resultado;



            }
            else if ((Year.now().getValue() - this.ano) < (Year.now().getValue() - carro_adv.getAno()))
            {
                    Carro [] resultado = {carro_adv};
                    return resultado;

            }


        }
        Carro [] resultado = {carro_adv, this};
        return resultado;



    }

    /**
     * Funcao que indica o consulo em litros mediante uma distancia
     * @param distancia em km
     * @return o cosumo em litros
     */
    public double consumo(double distancia)
    {
        return this.litros100KM*distancia/100;

    }




}




