package exercicio3;

public class Animal {




    private String nome;
    private boolean comFome;
    private Alimento tipoAlimentacao;
    public Animal(String nome, Alimento tipoAlimentacao) {
        this.nome = nome;
        this.comFome = true;
        this.tipoAlimentacao = tipoAlimentacao;
    }
    public String getNome() {
        return nome;
    }
    public boolean estaComFome() {
        return comFome;
    }
    public Alimento getTipoAlimentacao() {
        return tipoAlimentacao;
    }
    public boolean comer(Alimento comida) {
        if (tipoAlimentacao == comida) {
            comFome = false;
            System.out.println(nome + " comeu " + comida + ".");
            return true;
        } else {
            System.out.println(nome + " não come " + comida + ".");
        }
        return false;
    }



}







