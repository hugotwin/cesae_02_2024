package Exercicio10Funcionario;


public class Main {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("hugo", 1000,"engenharia");


        System.out.println(funcionario.exibirdados());
        funcionario.aumentarSalrio(0.1);
        System.out.println(funcionario.exibirdados());


    }

}
