package Exercicio3;

import java.util.ArrayList;

public class Professor extends Pessoa{

    private ArrayList<AreaFormacao> areasFormacao;
    private int nivelAcademico;

    public Professor(String nome, int anoNascimento, String email, String telemovel, int nivelAcademico) {
        super(nome, anoNascimento, email, telemovel);
        this.areasFormacao = areasFormacao;
        this.nivelAcademico = nivelAcademico;
        this.areasFormacao=new ArrayList<AreaFormacao>();

    }


    @Override
    public String obterFuncao() {

        return null;
    }
    @Override
    public void imprimirHorario() {

    }
}
