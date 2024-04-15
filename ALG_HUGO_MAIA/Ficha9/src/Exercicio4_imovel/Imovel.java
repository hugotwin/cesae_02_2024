package Exercicio4_imovel;

import Exercicio1.TipoCombustivel;

public class Imovel {

    private String rua;
    private int numero_porta;
    private String cidade;
    private TipoCasa tipo;
    private TipoAcamento acabamento;
    private double area;
    private int numero_quartos;
    private  int numero_casas_banho;
    private double area_piscina;

    /**
     * Construtor do imovel
     * @param rua da morada
     * @param numero_porta
     * @param cidade
     * @param tipo ja definido na classe enum
     * @param acabamento
     * @param area
     * @param numero_quartos
     * @param numero_casas_banho
     * @param area_piscina
     */
    public Imovel(String rua, int numero_porta, String cidade, TipoCasa tipo, TipoAcamento acabamento, double area, int numero_quartos, int numero_casas_banho, double area_piscina) {
        this.rua = rua;
        this.numero_porta = numero_porta;
        this.cidade = cidade;
        this.tipo = tipo;
        this.acabamento = acabamento;
        this.area = area;
        this.numero_quartos = numero_quartos;
        this.numero_casas_banho = numero_casas_banho;
        this.area_piscina = area_piscina;
    }








    public String getRua() {
        return rua;
    }

    public int getNumero_porta() {
        return numero_porta;
    }

    public String getCidade() {
        return cidade;
    }

    public TipoCasa getTipo() {



        return tipo;
    }

    public TipoAcamento getAcabamento() {
        return acabamento;
    }

    public double getArea() {
        return area;
    }

    public int getNumero_quartos() {
        return numero_quartos;
    }

    public int getNumero_casas_banho() {
        return numero_casas_banho;
    }

    public double getArea_piscina() {
        return area_piscina;

    }


    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setNumero_porta(int numero_porta) {
        this.numero_porta = numero_porta;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }


    public void setArea(double area) {
        this.area = area;
    }

    public void setNumero_quartos(int numero_quartos) {
        this.numero_quartos = numero_quartos;
    }

    public void setNumero_casas_banho(int numero_casas_banho) {
        this.numero_casas_banho = numero_casas_banho;
    }

    public void setArea_piscina(double area_piscina) {
        this.area_piscina = area_piscina;
    }


    /**
     * Funcao que calcula o valor da casa
     * @return em euros o valor da cas
     */
    public double valorImovel()
    {
        double valor_casa=0;

        if(this.tipo.equals(TipoCasa.apartamento))
        {
            valor_casa = this.area*1000;
            
            
        } else if (this.tipo.equals(TipoCasa.casa))
        {
            valor_casa = this.area*3000;
        }
        else if (this.tipo.equals(TipoCasa.mansao))
        {
            valor_casa = this.area*5000;
        }

        if (this.acabamento.equals(TipoAcamento.restauro))
        {

            valor_casa=valor_casa*0.5;

        }
        else if (this.acabamento.equals(TipoAcamento.usada))
        {
            valor_casa=valor_casa*0.9;
        }
        else if (this.acabamento.equals(TipoAcamento.nova_alto_acabamento))
        {
            valor_casa=valor_casa*1.25;
        }

        valor_casa+=this.numero_quartos*7500;
        valor_casa+=this.numero_casas_banho*10500;
        valor_casa+=this.area_piscina*1000;

        return valor_casa;


    }

    public void setAcabamento(TipoAcamento acabamento) {
        this.acabamento = acabamento;
    }


    public void exibirDetalhes()

    {
        System.out.println("rua : "+this.rua);
        System.out.println("Numero porta : "+this.numero_porta);
        System.out.println("Cidade : "+this.cidade);
        System.out.println("Tipo : "+this.tipo);
        System.out.println("Acabamento : "+this.acabamento);
        System.out.println("Area : "+this.area);
        System.out.println("Numeros quartos : "+this.numero_quartos);
        System.out.println("Numeros casas de banho: "+this.numero_casas_banho);
        System.out.println("Area de piscina: "+this.area_piscina);
        System.out.println("valor da casa: "+this.valorImovel());

    }



    public Imovel [] comparaPreco(Imovel imovel){

        if (this.valorImovel()>imovel.valorImovel())
        {
            Imovel [] lista = {this};
            return  lista;

        }if (this.valorImovel()==imovel.valorImovel())
        {
            Imovel [] lista = {this};
            return  lista;

        }

        Imovel [] lista = {imovel};
        return  lista;

    }


}
