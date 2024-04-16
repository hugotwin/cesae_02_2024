package Exercicio1;

import java.util.ArrayList;

public class JatoParticular extends  Aviao{


    private int Lotação;
    private double Capacidade_Bagagem; //cm3

    private Categoria categoria;
    private ArrayList<Instalacoes> instalacoes;


    public JatoParticular(String numero_serie, String modelo, int ano_fabrico, double peso_kg, double comprimento_fuselagem, double envergadura_asas, double altura_cauda, int numero_motores, double autonomia, double velocidade_maxima, double preco,Categoria categoria) {
        super(numero_serie, modelo, ano_fabrico, peso_kg, comprimento_fuselagem, envergadura_asas, altura_cauda, numero_motores, autonomia, velocidade_maxima, preco);

        this.instalacoes=new ArrayList<Instalacoes>();

        this.categoria=categoria;

    }


    public int getLotação() {
        return Lotação;
    }

    public double getCapacidade_Bagagem() {
        return Capacidade_Bagagem;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void getInstalacoes() {
       for(Instalacoes  instalacao : this.instalacoes )
       {
           System.out.println(instalacao);
       }

    }

    public void setLotação(int lotação) {
        Lotação = lotação;
    }

    public void setCapacidade_Bagagem(double capacidade_Bagagem) {
        Capacidade_Bagagem = capacidade_Bagagem;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void adicionarInstalacao(Instalacoes instalacao)
    {

        if(!this.instalacoes.contains(instalacao)){
            this.instalacoes.add(instalacao);

        }else {
            System.out.println("ja constem esta instalacao");
        }


    }

    public void removerInstalacao(Instalacoes instalacao)
    {

        if(this.instalacoes.contains(instalacao)){
            this.instalacoes.remove(instalacao);

        }else {
            System.out.println("não contem esta instalacao");
        }


    }



    @Override
    public void exibirDados() {
        super.exibirDados();
        this.getInstalacoes();
    }
}
