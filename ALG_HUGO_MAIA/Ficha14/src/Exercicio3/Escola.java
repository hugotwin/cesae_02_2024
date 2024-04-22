package Exercicio3;

import java.util.ArrayList;

public class Escola {

    private String nome;
    private String localização;
    private int lotação_maxima_alunos;
    private ArrayList<Professor> listaProfessores;
    private ArrayList<Disciplina> listaDisciplinas;
    private ArrayList<Curso> listaCursos;
    private ArrayList<Aluno> listaAlunos;


    public Escola(String nome, String localização, int lotação_maxima_alunos) {
        this.nome = nome;
        this.localização = localização;
        this.lotação_maxima_alunos = lotação_maxima_alunos;
        this.listaProfessores = new ArrayList<Professor>();
        this.listaDisciplinas = new ArrayList<Disciplina>();
        this.listaCursos = new ArrayList<Curso>();
        this.listaAlunos = new ArrayList<Aluno>();
    }
    






}
