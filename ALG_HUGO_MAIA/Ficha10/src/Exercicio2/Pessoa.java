package Exercicio2;

public class Pessoa {

    private String nome;
    private int idade;
    private String mail;
    private int telemovel;


    public Pessoa(String nome, int idade, String mail, int telemovel) {
        this.nome = nome;
        this.idade = idade;
        this.mail = mail;
        this.telemovel = telemovel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getTelemovel() {
        return telemovel;
    }

    public void setTelemovel(int telemovel) {
        this.telemovel = telemovel;
    }







}

