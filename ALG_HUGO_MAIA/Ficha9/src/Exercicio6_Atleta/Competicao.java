package Exercicio6_Atleta;


import java.util.Scanner;

public class Competicao {

    private String nome_competicao;
    private String pais;
    private Atleta[] lista_atletas = {};


    public Competicao(String nome_competicao, String pais) {
        this.nome_competicao = nome_competicao;
        this.pais = pais;
    }


    public void adicionarAtletas() {

        int contador = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Indique um nome");
        String nome = input.nextLine();
        System.out.println("Indique uma modalidade");
        String modalidade = input.nextLine();
        System.out.println("Indique um altura");

        double altura = input.nextDouble();
        System.out.println("Indique um peso");

        double peso = input.nextDouble();

        System.out.println("Indique pais de origem");
         input.nextLine();
        String pais_origem = input.nextLine();

        Atleta novoAtleta = new Atleta(nome, modalidade, altura, peso, pais_origem);


        if (lista_atletas.length == 0) {

            Atleta[] listaNova = new Atleta[1];

            listaNova[0] = novoAtleta;

            lista_atletas = listaNova;


        } else {

            for (Atleta atleta : lista_atletas) {
                if (atleta.getNome().equals(novoAtleta.getNome()) && atleta.getModalidade().equals(novoAtleta.getModalidade())) {

                    contador++;

                }

                if (contador == 0) {

                    Atleta[] listaNova = new Atleta[lista_atletas.length];

                    for (int i = 0; i < lista_atletas.length; i++) {

                        listaNova[i] = lista_atletas[i];

                    }

                    listaNova[lista_atletas.length - 1] = novoAtleta;
                    lista_atletas = listaNova;

                } else {
                    System.out.println("ja existe o atleta na competicao ");
                }
            }

        }


    }

    public void exibirAtletas() {


        for (Atleta atleta : lista_atletas) {

            System.out.println(atleta.getNome());

        }

    }


}
