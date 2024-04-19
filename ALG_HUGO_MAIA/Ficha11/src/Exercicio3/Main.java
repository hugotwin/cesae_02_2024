package Exercicio3;

import Exercicio3.Enum.Tamanho;
import Exercicio3.Enum.UnidadeMedida;
import Exercicio3.Ingredientes.Ingrediente;

public class Main {

    public static void main(String[] args) {

        Ingrediente queijo = new Ingrediente(1,"queijo", UnidadeMedida.GRAMAS,10.0);
        Ingrediente fiambre = new Ingrediente(1,"fiambre", UnidadeMedida.GRAMAS,10.0);

        PizzaIngrediente pizzaIngrediente_queijo = new PizzaIngrediente(queijo, 10);
        PizzaIngrediente pizzaIngrediente_fiambre = new PizzaIngrediente(queijo, 20);
        Pizza pizza_abacate = new Pizza("p65456465","abacate","frutos",100, Tamanho.GRANDE);

        pizza_abacate.adicionar(pizzaIngrediente_queijo);
        pizza_abacate.adicionar(pizzaIngrediente_fiambre);
         pizza_abacate.exibirIngredientes();

         pizza_abacate.editarQuantidadeIngrediente();
        pizza_abacate.exibirIngredientes();









    }




}
