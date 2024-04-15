package Exercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class MusicPlayer {

    ArrayList<Musica> programacao= new ArrayList<Musica>();


    public MusicPlayer() {

    }

    public void addMusica() {
        Scanner input = new Scanner(System.in);
        System.out.println("indique o titulo");
        String titulo = input.nextLine();
        System.out.println("indique o genero");
        String genero = input.nextLine();
        System.out.println("indique o Artista");
        String artista = input.nextLine();
        System.out.println("indique o duracao");
        int duracao = input.nextInt();



        Musica musica = new Musica(titulo,genero,artista,duracao);
       programacao.add(musica);
    }


    public void programarMusicas(int posicao_incial, int posicao_final)
    {
        Musica temp = programacao.get(posicao_incial);

        programacao.set(posicao_incial, programacao.get(posicao_final));
        programacao.set(posicao_final, temp);
    }

    public void programarMusicas(Musica musica_inicial,Musica musica_final)
    {
        int posicao_incial = programacao.indexOf(musica_inicial);
        int posicao_final = programacao.indexOf(musica_final);

        programacao.set(posicao_incial,musica_final);
        programacao.set(posicao_final, musica_inicial);
    }


    public void programarMusicas(int posicao ,Musica musicaNova )
    {
        programacao.set(posicao, musicaNova);
    }



    public int posicaoMusica(Musica musica_a_procura)
    {
        int posicao = programacao.indexOf(musica_a_procura);
        return posicao;
    }

    public void removerMusica(int posicaoMusica)
    {
         programacao.remove(posicaoMusica);

    }


    public void removerTudo()
    {
        programacao.removeAll(programacao);

    }

    public void exibirMusica()
    {
        int contador = 1;

        for(Musica musica : programacao )
        {
            System.out.println("Musica "+contador+" "+musica.getTitulo()+"|"+musica.getArtista()+"|"+musica.getGenero()+"|"+musica.getDuração());
        }
    }

    public String duracaoProgramacao()
    {
        int soma =0;

        for(Musica musica : programacao)
        {
            soma+=musica.getDuração();
        }
        int horas = soma/360;
        soma = soma-(horas*360);
        int min = soma/60;
        soma = soma -(min*60);


        return ""+horas+":"+min+":"+soma;
    }






}
