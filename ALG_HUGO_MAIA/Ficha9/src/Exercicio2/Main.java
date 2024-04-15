package Exercicio2;

public class Main {

    public static void main(String[] args) {

        Conta conta1 = new Conta("hugo", 1000);
        System.out.println("----------------------------------");
        System.out.println(conta1.exibirDados());
        System.out.println("----------------------------------");
        System.out.println(conta1.getDivida());
        System.out.println("----------------------------------");
        System.out.println(conta1.getMargem_emprestimo());
        System.out.println("----------------------------------");
        System.out.println(conta1.pedirEmprestimo(100));
        System.out.println("----------------------------------");
        System.out.println(conta1.getDivida());
        System.out.println("----------------------------------");
        System.out.println(conta1.exibirDados());

    }



}
