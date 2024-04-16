package Exercicio3;

import Exercicio3.Enum.Tamanho;
import Exercicio3.Ingredientes.Base;
import Exercicio3.Ingredientes.Carne;
import Exercicio3.Ingredientes.FrutosMar;
import Exercicio3.Ingredientes.Vegetal;

import java.util.ArrayList;
import java.util.Scanner;

public class Pizza {


    private String código;
    private String nome;
    private  String descricao;
    private double preco;
    private Tamanho tamanho;

    private ArrayList<PizzaIngrediente> listaPizzaIngredientes;


    public Pizza(String código, String nome, String descricao, double preco, Tamanho tamanho) {
        this.código = código;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.tamanho = tamanho;
        this.listaPizzaIngredientes = new ArrayList<PizzaIngrediente>();
        this.adicionar();
        this.adicionar();

    }


    public void adicionar(PizzaIngrediente pizzaIngrediente)
    {

        int count=0;

        for (PizzaIngrediente pizzaIngredienteLista : listaPizzaIngredientes)
        {

            if(pizzaIngredienteLista.getIngrediente() instanceof Base){
                count++;
            }
        }

        if (count ==0 )
        {
            System.out.println("Deve adicionar em primeiro lugar a base ");
            return;
        }

        if (count ==1  && !(pizzaIngrediente.getIngrediente() instanceof  Base)){
        if(listaPizzaIngredientes.size()<=5)
        {
            listaPizzaIngredientes.add(pizzaIngrediente);
        }else {
            System.out.println("Pizaa ja tem os seus 4 ingredientes");

        }

    }}

    public void removerIngrediente(int id)

    {
        int count= 0;

        for(PizzaIngrediente pizza : listaPizzaIngredientes)
        {

            if(pizza.getIngrediente().getId()==id){listaPizzaIngredientes.remove(pizza);
            count++;}
        }
        if (count==0){
            System.out.println("não foi encontrado esse ingrediente na pizza");
        }


    }

    public void editarQuantidadeIngrediente()
    {
        System.out.println("lista de ingredientes :");
        this.exibirIngredientes();
        System.out.println("*********************************");

        Scanner input = new Scanner(System.in);
        System.out.println("Indique qual o ingrediente que quer editar a quantidade");
        String nome = input.nextLine();
        System.out.println("Indique qual a quantidade final");
        double quantidade = input.nextDouble();
        int count=0;

        for(PizzaIngrediente pizza : listaPizzaIngredientes)
        {
            if(pizza.getIngrediente().getNome().equals(nome)){
                pizza.setQuantidade(quantidade);

                count++;
            }

            if (count==0){
                System.out.println("Não foram encontrados os igredinets verifique o nome");
            }

        }


    }

    public void exibirIngredientes()
    {
        int count =1;
        for (PizzaIngrediente pizza : listaPizzaIngredientes)
        {
            System.out.println("---------------------");
            System.out.println("Ingrediente "+ count);
            System.out.println(pizza.getIngrediente().getNome());
            System.out.println("quantidade"+pizza.getQuantidade()+" "+pizza.getIngrediente().getUnidade_medida());
            System.out.println(""+pizza.getIngrediente().getNumero_calorias_unidade_medida()+" kCal");

            count++;
        }

    }


    public double caloriasPizza(){

        double somatorio =0;

        for(PizzaIngrediente pizza : listaPizzaIngredientes)
        {

            somatorio= pizza.getQuantidade()*pizza.getIngrediente().getNumero_calorias_unidade_medida();

        }

        return somatorio;

    }


    public String tipologiaPizza()

    {

        int countVegetal=0;
        int countCarne=0;
        int countFrutos=0;
        String msg="";


        for(PizzaIngrediente pizzainGre : listaPizzaIngredientes){

            if(pizzainGre.getIngrediente() instanceof Vegetal){

                countVegetal++;
            }

            if(pizzainGre.getIngrediente() instanceof Carne){

                countCarne++;
            }
            if(pizzainGre.getIngrediente() instanceof FrutosMar){

                countFrutos++;
            }



        }
        if( countVegetal==4)
        {
            msg= "Tipo vegetariana";
        } else if (countCarne==4) {

            msg= "Tipo de carne";

        }else if (countFrutos==4) {

            msg= "Tipo do Mar";

        }else if (countFrutos==1 && countCarne==1  && countVegetal==1){

            msg= "Tipo Completa";

        }else{

           msg= "Tipo Completa";
        }


        return msg;





    }








}
