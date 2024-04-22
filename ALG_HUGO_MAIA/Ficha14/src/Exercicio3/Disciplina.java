package Exercicio3;

import java.util.Scanner;

public class Disciplina {

    private String nome;
    private AreaFormacao area;
    private int duracaoHoras;

    public Disciplina() {
        Scanner input = new Scanner(System.in);
        System.out.println("indique nome");
        String nome = input.nextLine();
        System.out.println("indique area opcçoes");
        System.out.println("1 :"+AreaFormacao.CONTABILIDADE);
        System.out.println("2 :"+AreaFormacao.ECONOMICA);
        System.out.println("3 :"+AreaFormacao.INFORMATICA);
        System.out.println("4 :"+AreaFormacao.MEDICINA);
        int opcao = input.nextInt();
        if(opcao==1){area =AreaFormacao.CONTABILIDADE; }
        if(opcao==2){area =AreaFormacao.ECONOMICA;}
        if(opcao==3){area =AreaFormacao.INFORMATICA;}
        if(opcao==4){area =AreaFormacao.MEDICINA;}

        System.out.println("indique duracao de horas");
        int duracaoHoras = input.nextInt();


        this.nome = nome;
        this.area = area;
        this.duracaoHoras = duracaoHoras;
    }





}
