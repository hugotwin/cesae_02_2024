package Exercicio2;

import java.util.ArrayList;
import java.util.Random;

public class Sorteio {

    private double premio;
    private ArrayList<Pessoa> participantes = new ArrayList<Pessoa>();

    public Sorteio(double premio) {
        this.premio = premio;
    }

    public void addPessoa(Pessoa pessoa)
    {
        if (!(this.participantes==null) && this.participantes.contains(pessoa) || pessoa.getIdade()<18)
        {
            System.out.println("Pessoa ja existe ou pessoa menor de idade");

        }else{this.participantes.add(pessoa);}


    }

    public String  sortearPremio()
    {


        Random rand = new Random();

        // Generate random integers in range 0 to 999
        int rand_int = rand.nextInt(0, this.participantes.size());

        return "Paricipanete "+rand_int+" : "+this.participantes.get(rand_int).getNome();


    }






}
