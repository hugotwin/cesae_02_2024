package Exercicio3;

public abstract class Document {

    protected String autor;
    protected String nome;
    protected String extensao;


    public Document(String autor, String nome, String tipoFicheiro) {
        this.autor = autor;
        this.nome = nome;

        if (tipoFicheiro.equals("texto")){this.extensao=".txt";}
        if (tipoFicheiro.equals("folha calculo")){this.extensao=".xlsx";}
        if (tipoFicheiro.equals("apresentação")){this.extensao=".pptx";}
    }

    public abstract void open();

    public abstract void save();

    public abstract  void close();








}
