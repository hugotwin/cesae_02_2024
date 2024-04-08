package Exercic_2;

public class Cao {


    private String nome;
    private String raca;
    private String  latido = "AuAuAu";

    /**
     * Construtor de cao
     * @param nome do animal
     * @param raca do animmal
     */
    public Cao(String nome, String raca){

        this.nome = nome;
        this.raca= raca;

    }


    public void setNome(String nome){
        this.nome=nome;

    }

    public void setLatido(String latido) {
        this.latido = latido;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    public String getLatido() {
        return this.latido;
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }




}
