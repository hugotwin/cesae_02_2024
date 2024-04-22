package Exercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class Curso {
    private String nome;

    private ArrayList<DisciplinaCurso> disciplinaCursoArrayLista;
    private boolean longaDuracao;

    public Curso() {
        this.disciplinaCursoArrayLista = disciplinaCursoArrayLista;

        Scanner input = new Scanner(System.in);
        System.out.println("Nome do curso");
        String nome = input.nextLine();
        this.nome = nome;
        System.out.println("Quantas disciplinas quer adicionar ao curso");
        int numeroDisciplinas = input.nextInt();
        for(int n= 0; n<numeroDisciplinas; n++)
        {
            System.out.println("indique uma  disciplina ");


        }





        this.longaDuracao = longaDuracao;
    }





    /*longaDuracao (false para curta duração (máximo de 100 horas, inclusive) ou true para longa duração
            (mínimo de 101 horas)). Para esta classe crie também os métodos*/






}
