package Exercicio1;

import java.util.ArrayList;

public class AviaoCombate  extends Aviao{


    private String país_Origem;
    private boolean camuflagem=false;
    private ArrayList<Armas> armas;


    public AviaoCombate(String numero_serie, String modelo, int ano_fabrico, double peso_kg, double comprimento_fuselagem, double envergadura_asas, double altura_cauda, int numero_motores, double autonomia, double velocidade_maxima, double preco,String pais_origem) {
        super(numero_serie, modelo, ano_fabrico, peso_kg, comprimento_fuselagem, envergadura_asas, altura_cauda, numero_motores, autonomia, velocidade_maxima, preco);

        this.país_Origem = pais_origem;
        this. armas = new ArrayList<Armas>();


    }

    public String getPaís_Origem() {
        return país_Origem;
    }

    public void setPaís_Origem(String país_Origem) {
        país_Origem = país_Origem;
    }

    public boolean isCamuflagem() {
        return camuflagem;
    }

    public void setCamuflagem(boolean camuflagem) {
        camuflagem = camuflagem;
    }


    public  void addArmas(Armas arma)
    {
        if(!this.armas.contains(arma)){
            this.armas.add(arma);

        }else{
            System.out.println("ja tem arma");
        }

    }

    public void removeArma(Armas arma){

        if(this.armas.contains(arma)){
            this.armas.remove(arma);

        }else{
            System.out.println("nao tem arma no arsenal");
        }

    }


    public void listaArmas()
    {
        for(Armas arma : armas)
        {
            System.out.println(arma);
        }


    }





}
