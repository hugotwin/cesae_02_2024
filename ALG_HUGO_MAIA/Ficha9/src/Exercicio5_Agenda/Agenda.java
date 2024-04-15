package Exercicio5_Agenda;

import java.util.Scanner;

public class Agenda {

    public Pessoa[] listaPessoas={};


    public Agenda() {}

    public void metodoAdicionar(){

        Scanner input = new Scanner(System.in);

        System.out.println("Indique o nome");
        String nome = input.nextLine();

        System.out.println("Indique o mail");
        String mail = input.nextLine();

        System.out.println("Indique o idade");
        int idade = input.nextInt();
        System.out.println("---------------------");

        System.out.println("---------------------");

        System.out.println("Indique o contacto");
        int contacto = input.nextInt();


        Pessoa pessoa = new Pessoa(nome,idade, mail, contacto );

        int count=0;
        for (Pessoa pessoaIn : listaPessoas){

            if (pessoa.getNome().equals(pessoaIn.getNome()) && pessoa.getIdade()==pessoaIn.getIdade())
            {

                System.out.println("Pssoa ja existe nao sera inserida");
            }

        }

        if(count==0)
        {
            if (listaPessoas.length==0)
            {
                Pessoa [] novalista = new Pessoa[1];

                novalista[0]=pessoa;

                listaPessoas= novalista;

            }else {

            Pessoa [] novalista = new Pessoa[listaPessoas.length+1];

            for (int i=0; i<listaPessoas.length; i++)
            {
                novalista[i]=listaPessoas[i];

            }

            novalista[novalista.length-1]=pessoa;

            listaPessoas= novalista;


        }}


    }

    public void exibirListaPessoas()
    {

        for(Pessoa pessoa : listaPessoas)
        {

            System.out.println("Nome : "+pessoa.getNome());
            System.out.println("Idade : "+pessoa.getIdade());
            System.out.println("Mail : "+pessoa.getEmail());
            System.out.println("Contacto : "+pessoa.getTelemovel());


        }


    }




}




