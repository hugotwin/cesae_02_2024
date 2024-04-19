package Exercicio1;

import Exercicio1.Enum.TipoDieta;

public class Animal extends SerVivo{


    private boolean fome = false;
    private double peso_Kg;
    private double inteligência;// (0 - 100)
    private TipoDieta dieta;
    private String barulho;


    public Animal(String nome, String especie, String pais_origem, int idade, double peso_Kg, double inteligência, TipoDieta dieta, String barulho) {
        super(nome, especie, pais_origem, idade);
        this.peso_Kg = peso_Kg;

        if(inteligência<0 || inteligência>100){
            throw new IllegalArgumentException();
        }
        this.inteligência = inteligência;
        this.dieta = dieta;
        this.barulho = barulho;
    }


    public String getBarulho() {
        return barulho;
    }

    public double getPeso_Kg() {
        return peso_Kg;
    }

    public boolean isFome() {
        return fome;
    }

    public TipoDieta getDieta() {
        return dieta;
    }

    public double getInteligência() {
        return inteligência;
    }


    public void setFome(boolean fome) {
        this.fome = fome;
    }
}
